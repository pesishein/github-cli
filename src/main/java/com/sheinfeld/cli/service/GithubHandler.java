package com.sheinfeld.cli.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.sheinfeld.cli.pojos.DownloadsData;
import com.sheinfeld.cli.pojos.generated.downloads.Asset;
import com.sheinfeld.cli.pojos.generated.downloads.ReleaseData;
import com.sheinfeld.cli.pojos.generated.stats.contributors.ContributorsDatum;
import com.sheinfeld.cli.pojos.generated.stats.forks.ForksData;
import com.sheinfeld.cli.pojos.generated.stats.languages.LanguagesData;
import com.sheinfeld.cli.pojos.generated.stats.stars.StarsData1;
import com.sheinfeld.cli.pojos.generated.stats.stars.StarsData2;

public class GithubHandler {
	private ObjectMapper objectMapper = new ObjectMapper();

	public GithubHandler(){
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	public List<DownloadsData> getDownloadsData(String releasesJson) throws Exception {

		List<DownloadsData> downloadsDataResponse = new ArrayList<DownloadsData>();
		List<ReleaseData> restResponse = null;

		TypeFactory typeFactory = objectMapper.getTypeFactory();
		CollectionType collectionType = typeFactory.constructCollectionType(List.class, ReleaseData.class);
		restResponse = objectMapper.readValue(releasesJson, collectionType);

		for (ReleaseData release : restResponse) {
			downloadsDataResponse.addAll(getDownloadsData(release));
		}

		return downloadsDataResponse;

	}

	public <T> Integer getStatsCount(String json, T classType) throws Exception {
		
		List<T> restResponse = null;

		TypeFactory typeFactory = objectMapper.getTypeFactory();
		CollectionType collectionType = typeFactory.constructCollectionType(List.class, (Class<?>) classType);
		restResponse = objectMapper.readValue(json, collectionType);

		return restResponse == null ? 0 : restResponse.size();
	}

	private List<DownloadsData> getDownloadsData(ReleaseData release) {

		List<DownloadsData> result = new ArrayList<DownloadsData>();
		List<Asset> assets = release.getAssets();
		for (Asset asset : assets) {
			DownloadsData downloadsData = new DownloadsData();
			downloadsData.setReleaseName(release.getName());
			downloadsData.setDistribution(asset.getName());
			downloadsData.setDownloadCount(asset.getDownloadCount());
			result.add(downloadsData);
		}
		return result;
	}

	public Integer getForksCount(String forks) throws Exception {
		return getStatsCount(forks, ForksData.class);
	}

	public Integer getContributorsCount(String forks) throws Exception {
		return getStatsCount(forks, ContributorsDatum.class);
	}

	public Integer getStarsCount(String json) throws Exception {
		Integer result = null;
		try {
			result = getStatsCount(json, StarsData1.class);
		} catch (Exception e) {
			result = getStatsCount(json, StarsData2.class);
		}
		return result;
	}

	public String getLanguages(String langs) throws Exception {

		String result = "";
		LanguagesData data = objectMapper.readValue(langs, LanguagesData.class);
		Map<String, Integer> properties = data.getAdditionalProperties();
		if (properties.keySet().size() > 0) {
			for (String key : properties.keySet()) {
				result += key + " , ";
			}
			result = result.substring(0, result.length() - 3);
		}
		return result;
	}
}
