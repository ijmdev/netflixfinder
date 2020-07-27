package com.sidrhelli.netflixfinder.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sidrhelli.netflixfinder.adapter.ApiAdapter;
import com.sidrhelli.netflixfinder.dao.NewReleasesDao;
import com.sidrhelli.netflixfinder.dto.Country;
import com.sidrhelli.netflixfinder.dto.NewReleasesDto;
import com.sidrhelli.netflixfinder.services.Initialiser;

/**
 *
 ***/
@Component
public class InitialiserImpl implements Initialiser {

  private ApiAdapter adapter;
  private NewReleasesDao dao;

  @Autowired
  public InitialiserImpl(ApiAdapter adapter, NewReleasesDao dao) {
    this.adapter = adapter;
    this.dao = dao;
  }

  private NewReleasesDto getReleasesFromLastYear(Country country, String page) throws Exception {
    return adapter.getAllReleasesPerCountryFromPastYear(country, page);
  }

  @Override
  public void initAllData() throws Exception {
    for (Country country : Country.values()) {
      NewReleasesDto firstPage = getReleasesFromLastYear(country, String.valueOf(1));

      final double count = Double.valueOf(firstPage.getCount());
      final double itemsPerPage = 100;

      for (int page = 0; page < Math.round(count / itemsPerPage); page++) {
        NewReleasesDto movieList = getReleasesFromLastYear(country, String.valueOf(page));

        if (null != movieList) {
          movieList.getItems().stream().forEach(m -> m.setCountry(country));
          dao.saveAll(movieList.getItems());
        }
      }
    }
  }


  @Override
  public void initDataPerCountry() throws Exception {
    Country country = Country.NETHERLANDS;
    NewReleasesDto firstPage = getReleasesFromLastYear(country, String.valueOf(1));

    final double count = Double.valueOf(firstPage.getCount());
    final double itemsPerPage = 100;

    for (int page = 0; page < Math.round(count / itemsPerPage); page++) {
      NewReleasesDto movieList = getReleasesFromLastYear(country, String.valueOf(page));

      if (null != movieList) {
        movieList.getItems().stream().forEach(m -> m.setCountry(country));
        dao.saveAll(movieList.getItems());
      }
    }

  }
}
