package com.sidrhelli.netflixfinder.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.sidrhelli.netflixfinder.adapter.ApiAdapter;

@RestController
public class IndexController {

  @Autowired
  private ApiAdapter apiAdapter;


}
