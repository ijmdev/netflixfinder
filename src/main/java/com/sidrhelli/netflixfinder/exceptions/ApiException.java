package com.sidrhelli.netflixfinder.exceptions;

public class ApiException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = -7939805601730371469L;

  public ApiException(String errorMessage) {
    super(errorMessage);

  }
}
