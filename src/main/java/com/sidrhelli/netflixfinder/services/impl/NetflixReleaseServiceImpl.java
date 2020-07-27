package com.sidrhelli.netflixfinder.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sidrhelli.netflixfinder.dto.NetflixRelease;
import com.sidrhelli.netflixfinder.services.NetflixReleaseService;
import com.sidrhelli.netflixfinder.utils.Utils;

@Service
public class NetflixReleaseServiceImpl implements NetflixReleaseService {

  @Autowired
  private NetflixRelease release;

  public NetflixReleaseServiceImpl(NetflixRelease release) {
    this.release = release;
  }

  public NetflixRelease getRelease() {
    return release;
  }

  public void setRelease(NetflixRelease release) {
    this.release = release;
  }

  @Override
  public String getTruncatedSynopsis() {
    return Utils.truncateSynopsis(release.getSynopsis());
  }

}
