package com.sheinfeld.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpUriRequest;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.HttpStatus;
import org.junit.Test;

import com.sheinfeld.cli.config.Config;
import com.sheinfeld.cli.config.ConfigKeys;
import com.sheinfeld.cli.util.RestServices;

public class GithubCliApplicationTest {

	private static final String DOWNLOADS_SUFFIX = "downloadsSuffix";
	@Test
	public void givenRepoDoesNotExists_whenReleasesInfoIsRetrieved_then404IsReceived()
	  throws ClientProtocolException, IOException {
	 
	    // Given
	    String repo = RandomStringUtils.randomAlphabetic( 8 );
	    String url = Config.getSetting(ConfigKeys.BASE_URL) + "/" + repo + "/" + Config.getSetting(DOWNLOADS_SUFFIX);
	    HttpUriRequest request = new HttpGet(url);

	    // When
	    HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );

	    // Then
	    assertEquals(httpResponse.getCode(),HttpStatus.SC_NOT_FOUND);
	}

	@Test
	public void givenRepoExists_whenReleasesInfoIsRetrieved_then200IsReceived()
	  throws ClientProtocolException, IOException, URISyntaxException {
	 
	    // Given
	    String repo = Config.getSetting("repo_sample");
	    String url = Config.getSetting(ConfigKeys.BASE_URL) + "/" + repo + "/" + Config.getSetting(DOWNLOADS_SUFFIX);

	    // When
	    String releases = RestServices.callHttpGet(url);

	    // Then
	    assertNotNull(releases);
	}
	
}