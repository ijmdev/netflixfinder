package com.sidrhelli.netflixfinder.services;

import java.util.List;
import com.sidrhelli.netflixfinder.dto.NetflixRelease;

public interface NetflixReleaseService {

  List<NetflixRelease> findPageable(int pageNumber, int pageSize);

}
