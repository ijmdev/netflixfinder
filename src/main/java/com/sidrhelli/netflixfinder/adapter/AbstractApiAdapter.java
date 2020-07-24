package com.sidrhelli.netflixfinder.adapter;

import java.io.IOException;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Request.Builder;
import okhttp3.RequestBody;
import okhttp3.Response;

abstract class AbstractApiAdapter {
  static final Logger LOG = LogManager.getLogger(AbstractApiAdapter.class);
  final OkHttpClient client = new OkHttpClient();

  String sendNetworkRequest(String url, String httpMethod, String postData,
      Map<String, String> headers) throws Exception {

    final MediaType MEDIA_TYPE__HTML = MediaType.parse("text/html; charset=UTF-8");
    Builder requestBuilder = new Request.Builder().url(url);

    if (httpMethod.equals("POST")) {
      requestBuilder.post(RequestBody.create(MEDIA_TYPE__HTML, postData));
    }

    if (null != headers) {
      for (Map.Entry<String, String> header : headers.entrySet()) {
        requestBuilder.addHeader(header.getKey(), header.getValue());
      }
    }
    LOG.info("Making request with URL: " + url);

    Request request = requestBuilder.build();

    try (Response response = client.newCall(request).execute()) {
      if (!response.isSuccessful())
        throw new IOException("Unexpected code " + response);

      Headers responseHeaders = response.headers();
      for (int i = 0; i < responseHeaders.size(); i++) {
        System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
      }

      return response.body().string();
    }
  }


}
