package com.sidrhelli.netflixfinder.services.impl;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.sidrhelli.netflixfinder.dao.NewReleasesDao;
import com.sidrhelli.netflixfinder.dto.AllMoviesView;
import com.sidrhelli.netflixfinder.services.NetflixReleaseService;

@Service
public class NetflixReleaseServiceImpl implements NetflixReleaseService {
  private static final Logger LOG = LogManager.getLogger(NetflixReleaseServiceImpl.class);

  @Autowired
  private NewReleasesDao newReleasesDao;


  @Override
  public List<AllMoviesView> findPageable(int pageNumber, int pageSize) {
    Pageable paging = PageRequest.of(pageNumber, pageSize, Sort.by(Sort.Direction.DESC, "unogsdate"));
    Page<AllMoviesView> pageResult = newReleasesDao.findAll(paging);
    return pageResult.toList();
  }



}
