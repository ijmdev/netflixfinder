package com.sidrhelli.netflixfinder.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.sidrhelli.netflixfinder.adapter.ApiAdapter;
import com.sidrhelli.netflixfinder.dto.Country;
import com.sidrhelli.netflixfinder.dto.Interval;
import com.sidrhelli.netflixfinder.dto.NetflixRelease;
import com.sidrhelli.netflixfinder.dto.NewReleasesDto;

@Controller
public class NewReleasesController {

  @Autowired
  private ApiAdapter apiAdapter;

  @GetMapping("/newreleases")
  public ModelAndView showNewReleasePerCountry(
      @RequestParam(defaultValue = "NETHERLANDS") Country country,
      @RequestParam(defaultValue = "LAST_TWO_MONTHS") Interval iv) throws Exception {
    NewReleasesDto dto = apiAdapter.getNewReleasesPerCountry(country, iv);
    List<NetflixRelease> releases = dto.getItems();


    ModelAndView modelView = new ModelAndView();
    modelView.addObject("netflixreleases", releases);
    modelView.addObject("currentCountry", country.countryName);
    modelView.addObject("currentCountryCode", country.countryCode);
    modelView.addObject("intervalName", iv.name);

    modelView.addObject("interval", iv.urlParameter);


    modelView.setViewName("releases");

    return modelView;
  }

}
