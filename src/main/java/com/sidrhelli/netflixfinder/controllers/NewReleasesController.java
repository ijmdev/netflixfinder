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
  private static final String DEFAULT_COUNTRY = "NETHERLANDS";
  private static final String DEFAULT_INTERVAL = "LAST_TWO_MONTHS";
  private static final String DEFAULT_PAGE = "1";


  @Autowired
  private ApiAdapter apiAdapter;

  @GetMapping("/newreleases")
  public ModelAndView showNewReleasePerCountry(
      @RequestParam(defaultValue = DEFAULT_COUNTRY, required = false) Country country,
      @RequestParam(defaultValue = DEFAULT_INTERVAL, required = false) Interval iv,
      @RequestParam(defaultValue = DEFAULT_PAGE, required = false, name = "p") String page)
      throws Exception {
    NewReleasesDto dto = apiAdapter.getNewReleasesPerCountry(country, iv, page);
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
