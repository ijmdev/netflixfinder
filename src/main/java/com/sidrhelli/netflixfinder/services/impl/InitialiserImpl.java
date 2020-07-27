package com.sidrhelli.netflixfinder.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sidrhelli.netflixfinder.adapter.ApiAdapter;
import com.sidrhelli.netflixfinder.dto.Country;
import com.sidrhelli.netflixfinder.dto.NewReleasesDto;

/**
 *
 ***/
@Component
public class InitialiserImpl {

  private ApiAdapter adapter;

  @Autowired
  public InitialiserImpl(ApiAdapter adapter) {
    this.adapter = adapter;
  }

  public NewReleasesDto getReleasesFromLastYear(Country country, String page) throws Exception {
    return adapter.getAllReleasesPerCountryFromPastYear(country, page);
  }

  /**
   * 1. fetch all movies 2. save movies to database
   * 
   */
}
