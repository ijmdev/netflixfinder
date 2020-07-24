package com.sidrhelli.netflixfinder.adapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.sidrhelli.netflixfinder.dto.AllCountriesDto;
import com.sidrhelli.netflixfinder.dto.Country;
import com.sidrhelli.netflixfinder.dto.Interval;
import com.sidrhelli.netflixfinder.dto.NewReleasesDto;


@Service
public class ApiAdapterImpl extends AbstractApiAdapter implements ApiAdapter {

  @SuppressWarnings("unused")
  private static final Logger LOG = LogManager.getLogger(ApiAdapterImpl.class);

  private static final String API_BASE_URL = "https://unogs-unogs-v1.p.rapidapi.com/aaapi.cgi";
  private Gson gson;

  @Override
  public NewReleasesDto getNewReleasesPerCountry(Country country, Interval interval)
      throws Exception {
    gson = new Gson();
    final String endPoint =
        "q=get%3Anew" + interval.urlParameter + "%3A" + country.countryCode + "&p=1&t=ns&st=adv";
    final String response = makeRequest(endPoint, null);
    final NewReleasesDto newNetflixReleaseDto = gson.fromJson(response, NewReleasesDto.class);

    return newNetflixReleaseDto;
  }

  @Override
  public List<List<String>> getAllCountries() throws Exception {
    gson = new Gson();
    final String endPoint = "t=lc&q=available";
    String response = makeRequest(endPoint, null);
    AllCountriesDto dto = gson.fromJson(response, AllCountriesDto.class);

    return dto.getItems();
  }

  public String makeRequest(String endPoint, Map<String, String> params) throws Exception {

    StringBuilder urlBuilder = new StringBuilder();

    urlBuilder.append(API_BASE_URL + "?");

    if (params == null) {
      params = new HashMap<String, String>();
    }

    if (!params.isEmpty()) {
      for (Map.Entry<String, String> param : params.entrySet()) {
        urlBuilder.append(param.getKey());
        urlBuilder.append("=");
        urlBuilder.append(param.getValue());
      }
    }

    urlBuilder.append(endPoint);

    final HashMap<String, String> requestHeaders = new HashMap<String, String>();
    requestHeaders.put("x-rapidapi-host", "unogs-unogs-v1.p.rapidapi.com");
    requestHeaders.put("x-rapidapi-key", "de08fe3e90msh38b45ab2088b6fap1d07b1jsne2e1638ea4dd");

    return sendNetworkRequest(urlBuilder.toString(), "GET", null, requestHeaders);
  }

  @Override
  String sendNetworkRequest(String url, String httpMethod, String postData,
      Map<String, String> headers) throws Exception {
    return super.sendNetworkRequest(url, httpMethod, postData, headers);
  }



}
