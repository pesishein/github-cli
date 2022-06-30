package com.sheinfeld.cli.util;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RestServices {

	private static Logger logger = LogManager.getLogger(RestServices.class);

	public static String callHttpGet(String url) throws IOException, URISyntaxException {
		try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
			final HttpGet httpget = new HttpGet(url);

			logger.info("Executing request " + httpget.getMethod() + " " + httpget.getUri());

			// Create a custom response handler
			final HttpClientResponseHandler<String> responseHandler = new HttpClientResponseHandler<String>() {

				@Override
				public String handleResponse(final ClassicHttpResponse response) throws IOException {
					final int status = response.getCode();
					if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
						final HttpEntity entity = response.getEntity();
						try {
							return entity != null ? EntityUtils.toString(entity) : null;
						} catch (final ParseException ex) {
							throw new ClientProtocolException(ex);
						}
					} else {
						throw new ClientProtocolException(String.valueOf(status));
					}
				}

			};
			final String responseBody = httpclient.execute(httpget, responseHandler);
			return responseBody;
		}
	}

}
