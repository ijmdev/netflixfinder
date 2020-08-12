package com.sidrhelli.netflixfinder.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.sidrhelli.netflixfinder.dto.AllMoviesView;
import com.sidrhelli.netflixfinder.services.NetflixReleaseService;

@Controller
public class NewReleasesController {

  private static final int PAGE_SIZE = 18;

  @Autowired
  private NetflixReleaseService releaseService;

  @GetMapping("/newreleases")
  public ModelAndView showNewReleasePerCountry(@RequestParam(defaultValue = "0", required = false, name = "p") int pageNumber) throws Exception {

    List<AllMoviesView> releases = releaseService.findPageable(pageNumber, PAGE_SIZE);

    ModelAndView modelView = new ModelAndView();
    modelView.addObject("netflixreleases", releases);
    modelView.setViewName("releases");

    return modelView;
  }

}
