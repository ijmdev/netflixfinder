package com.sidrhelli.netflixfinder.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.sidrhelli.netflixfinder.dto.NetflixRelease;

public interface NewReleasesDao
    extends CrudRepository<NetflixRelease, Long>, PagingAndSortingRepository<NetflixRelease, Long> {

}
