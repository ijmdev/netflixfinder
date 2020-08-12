package com.sidrhelli.netflixfinder.services;

import java.util.List;
import com.sidrhelli.netflixfinder.dto.AllMoviesView;

public interface NetflixReleaseService {

  List<AllMoviesView> findPageable(int pageNumber, int pageSize);

}
