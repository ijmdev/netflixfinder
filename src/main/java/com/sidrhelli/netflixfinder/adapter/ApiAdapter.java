package com.sidrhelli.netflixfinder.adapter;

import java.util.List;
import com.sidrhelli.netflixfinder.dto.Country;
import com.sidrhelli.netflixfinder.dto.Interval;
import com.sidrhelli.netflixfinder.dto.NewReleasesDto;

public interface ApiAdapter {
  NewReleasesDto getNewReleasesPerCountry(Country country, Interval interval) throws Exception;

  List<List<String>> getAllCountries() throws Exception;
}
