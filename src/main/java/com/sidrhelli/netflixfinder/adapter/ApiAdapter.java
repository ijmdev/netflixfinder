package com.sidrhelli.netflixfinder.adapter;

import java.util.List;
import com.sidrhelli.netflixfinder.dto.Country;
import com.sidrhelli.netflixfinder.dto.Interval;
import com.sidrhelli.netflixfinder.dto.NewReleasesDto;

public interface ApiAdapter {
  NewReleasesDto getNewReleasesPerCountry(Country country, Interval interval, String page)
      throws Exception;

  List<List<String>> getAllCountries() throws Exception;

  NewReleasesDto getAllReleasesPerCountryFromPastYear(Country country, String page)
      throws Exception;


}
