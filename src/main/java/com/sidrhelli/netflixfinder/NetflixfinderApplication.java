package com.sidrhelli.netflixfinder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NetflixfinderApplication implements CommandLineRunner {
  private static Logger LOG = LogManager.getLogger(NetflixfinderApplication.class);


  public static void main(String[] args) {
    SpringApplication.run(NetflixfinderApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {}


}
