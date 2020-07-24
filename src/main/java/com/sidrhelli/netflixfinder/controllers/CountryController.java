package com.sidrhelli.netflixfinder.controllers;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.sidrhelli.netflixfinder.adapter.ApiAdapter;


@RestController
public class CountryController {
  @SuppressWarnings("unused")
  private static final Logger LOG = LogManager.getLogger(CountryController.class);

  @Autowired
  private ApiAdapter apiAdapter;

  @GetMapping("/all")
  @ResponseBody
  public List<List<String>> showAllCountries() throws Exception {
    List<List<String>> cdto = apiAdapter.getAllCountries();
    return cdto;
  }



}
