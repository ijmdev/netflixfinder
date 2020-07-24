package com.sidrhelli.netflixfinder.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;

@EnableAutoConfiguration
@ContextConfiguration(classes = Utils.class)
public class UtilsTest {

  @Test
  public void shouldReturnMinutesWhenHoursAndMinutesArePresent() {
    assertEquals("137 min", Utils.formatMovieDuration("2h17m"));
  }

  @Test
  public void shouldReturnMinutesWhenOnlyMinutesArePresent() {
    assertEquals("17 min", Utils.formatMovieDuration("17m"));
  }

  @Test
  public void shouldReturnMinutesWhenOnlyMinutesIsZero() {
    assertEquals("120 min", Utils.formatMovieDuration("2h00m"));
  }
}
