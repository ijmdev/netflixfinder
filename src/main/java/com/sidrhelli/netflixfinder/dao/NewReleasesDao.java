package com.sidrhelli.netflixfinder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.sidrhelli.netflixfinder.dto.AllMoviesView;

public interface NewReleasesDao extends CrudRepository<AllMoviesView, Long>, PagingAndSortingRepository<AllMoviesView, Long> {

}
