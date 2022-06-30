
package com.sheinfeld.cli.pojos.generated.downloads;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Release
 * <p>
 * A release.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "html_url",
    "assets_url",
    "upload_url",
    "tarball_url",
    "zipball_url",
    "id",
    "node_id",
    "tag_name",
    "target_commitish",
    "name",
    "body",
    "draft",
    "prerelease",
    "created_at",
    "published_at",
    "author",
    "assets",
    "body_html",
    "body_text",
    "mentions_count",
    "discussion_url",
    "reactions"
})
public class ReleaseData {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    private URI url;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    private URI htmlUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assets_url")
    private URI assetsUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("upload_url")
    private String uploadUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tarball_url")
    private URI tarballUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipball_url")
    private URI zipballUrl;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    private String nodeId;
    /**
     * The name of the tag.
     * (Required)
     * 
     */
    @JsonProperty("tag_name")
    @JsonPropertyDescription("The name of the tag.")
    private String tagName;
    /**
     * Specifies the commitish value that determines where the Git tag is created from.
     * (Required)
     * 
     */
    @JsonProperty("target_commitish")
    @JsonPropertyDescription("Specifies the commitish value that determines where the Git tag is created from.")
    private String targetCommitish;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("body")
    private String body;
    /**
     * true to create a draft (unpublished) release, false to create a published one.
     * (Required)
     * 
     */
    @JsonProperty("draft")
    @JsonPropertyDescription("true to create a draft (unpublished) release, false to create a published one.")
    private Boolean draft;
    /**
     * Whether to identify the release as a prerelease or a full release.
     * (Required)
     * 
     */
    @JsonProperty("prerelease")
    @JsonPropertyDescription("Whether to identify the release as a prerelease or a full release.")
    private Boolean prerelease;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    private Date createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("published_at")
    private Date publishedAt;
    /**
     * Simple User
     * <p>
     * Simple User
     * (Required)
     * 
     */
    @JsonProperty("author")
    @JsonPropertyDescription("Simple User")
    private Author author;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assets")
    private List<Asset> assets = new ArrayList<Asset>();
    @JsonProperty("body_html")
    private String bodyHtml;
    @JsonProperty("body_text")
    private String bodyText;
    @JsonProperty("mentions_count")
    private Integer mentionsCount;
    /**
     * The URL of the release discussion.
     * 
     */
    @JsonProperty("discussion_url")
    @JsonPropertyDescription("The URL of the release discussion.")
    private URI discussionUrl;
    /**
     * Reaction Rollup
     * <p>
     * 
     * 
     */
    @JsonProperty("reactions")
    private Reactions reactions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assets_url")
    public URI getAssetsUrl() {
        return assetsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assets_url")
    public void setAssetsUrl(URI assetsUrl) {
        this.assetsUrl = assetsUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("upload_url")
    public String getUploadUrl() {
        return uploadUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("upload_url")
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tarball_url")
    public URI getTarballUrl() {
        return tarballUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("tarball_url")
    public void setTarballUrl(URI tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipball_url")
    public URI getZipballUrl() {
        return zipballUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zipball_url")
    public void setZipballUrl(URI zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * The name of the tag.
     * (Required)
     * 
     */
    @JsonProperty("tag_name")
    public String getTagName() {
        return tagName;
    }

    /**
     * The name of the tag.
     * (Required)
     * 
     */
    @JsonProperty("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Specifies the commitish value that determines where the Git tag is created from.
     * (Required)
     * 
     */
    @JsonProperty("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    /**
     * Specifies the commitish value that determines where the Git tag is created from.
     * (Required)
     * 
     */
    @JsonProperty("target_commitish")
    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * true to create a draft (unpublished) release, false to create a published one.
     * (Required)
     * 
     */
    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    /**
     * true to create a draft (unpublished) release, false to create a published one.
     * (Required)
     * 
     */
    @JsonProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    /**
     * Whether to identify the release as a prerelease or a full release.
     * (Required)
     * 
     */
    @JsonProperty("prerelease")
    public Boolean getPrerelease() {
        return prerelease;
    }

    /**
     * Whether to identify the release as a prerelease or a full release.
     * (Required)
     * 
     */
    @JsonProperty("prerelease")
    public void setPrerelease(Boolean prerelease) {
        this.prerelease = prerelease;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("created_at")
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("published_at")
    public Date getPublishedAt() {
        return publishedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("published_at")
    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * Simple User
     * <p>
     * Simple User
     * (Required)
     * 
     */
    @JsonProperty("author")
    public Author getAuthor() {
        return author;
    }

    /**
     * Simple User
     * <p>
     * Simple User
     * (Required)
     * 
     */
    @JsonProperty("author")
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assets")
    public List<Asset> getAssets() {
        return assets;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("assets")
    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    @JsonProperty("body_html")
    public String getBodyHtml() {
        return bodyHtml;
    }

    @JsonProperty("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    @JsonProperty("body_text")
    public String getBodyText() {
        return bodyText;
    }

    @JsonProperty("body_text")
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    @JsonProperty("mentions_count")
    public Integer getMentionsCount() {
        return mentionsCount;
    }

    @JsonProperty("mentions_count")
    public void setMentionsCount(Integer mentionsCount) {
        this.mentionsCount = mentionsCount;
    }

    /**
     * The URL of the release discussion.
     * 
     */
    @JsonProperty("discussion_url")
    public URI getDiscussionUrl() {
        return discussionUrl;
    }

    /**
     * The URL of the release discussion.
     * 
     */
    @JsonProperty("discussion_url")
    public void setDiscussionUrl(URI discussionUrl) {
        this.discussionUrl = discussionUrl;
    }

    /**
     * Reaction Rollup
     * <p>
     * 
     * 
     */
    @JsonProperty("reactions")
    public Reactions getReactions() {
        return reactions;
    }

    /**
     * Reaction Rollup
     * <p>
     * 
     * 
     */
    @JsonProperty("reactions")
    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ReleaseData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("assetsUrl");
        sb.append('=');
        sb.append(((this.assetsUrl == null)?"<null>":this.assetsUrl));
        sb.append(',');
        sb.append("uploadUrl");
        sb.append('=');
        sb.append(((this.uploadUrl == null)?"<null>":this.uploadUrl));
        sb.append(',');
        sb.append("tarballUrl");
        sb.append('=');
        sb.append(((this.tarballUrl == null)?"<null>":this.tarballUrl));
        sb.append(',');
        sb.append("zipballUrl");
        sb.append('=');
        sb.append(((this.zipballUrl == null)?"<null>":this.zipballUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("tagName");
        sb.append('=');
        sb.append(((this.tagName == null)?"<null>":this.tagName));
        sb.append(',');
        sb.append("targetCommitish");
        sb.append('=');
        sb.append(((this.targetCommitish == null)?"<null>":this.targetCommitish));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("draft");
        sb.append('=');
        sb.append(((this.draft == null)?"<null>":this.draft));
        sb.append(',');
        sb.append("prerelease");
        sb.append('=');
        sb.append(((this.prerelease == null)?"<null>":this.prerelease));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("publishedAt");
        sb.append('=');
        sb.append(((this.publishedAt == null)?"<null>":this.publishedAt));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("assets");
        sb.append('=');
        sb.append(((this.assets == null)?"<null>":this.assets));
        sb.append(',');
        sb.append("bodyHtml");
        sb.append('=');
        sb.append(((this.bodyHtml == null)?"<null>":this.bodyHtml));
        sb.append(',');
        sb.append("bodyText");
        sb.append('=');
        sb.append(((this.bodyText == null)?"<null>":this.bodyText));
        sb.append(',');
        sb.append("mentionsCount");
        sb.append('=');
        sb.append(((this.mentionsCount == null)?"<null>":this.mentionsCount));
        sb.append(',');
        sb.append("discussionUrl");
        sb.append('=');
        sb.append(((this.discussionUrl == null)?"<null>":this.discussionUrl));
        sb.append(',');
        sb.append("reactions");
        sb.append('=');
        sb.append(((this.reactions == null)?"<null>":this.reactions));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.targetCommitish == null)? 0 :this.targetCommitish.hashCode()));
        result = ((result* 31)+((this.body == null)? 0 :this.body.hashCode()));
        result = ((result* 31)+((this.zipballUrl == null)? 0 :this.zipballUrl.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.assets == null)? 0 :this.assets.hashCode()));
        result = ((result* 31)+((this.bodyText == null)? 0 :this.bodyText.hashCode()));
        result = ((result* 31)+((this.draft == null)? 0 :this.draft.hashCode()));
        result = ((result* 31)+((this.bodyHtml == null)? 0 :this.bodyHtml.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.assetsUrl == null)? 0 :this.assetsUrl.hashCode()));
        result = ((result* 31)+((this.discussionUrl == null)? 0 :this.discussionUrl.hashCode()));
        result = ((result* 31)+((this.tarballUrl == null)? 0 :this.tarballUrl.hashCode()));
        result = ((result* 31)+((this.publishedAt == null)? 0 :this.publishedAt.hashCode()));
        result = ((result* 31)+((this.author == null)? 0 :this.author.hashCode()));
        result = ((result* 31)+((this.htmlUrl == null)? 0 :this.htmlUrl.hashCode()));
        result = ((result* 31)+((this.mentionsCount == null)? 0 :this.mentionsCount.hashCode()));
        result = ((result* 31)+((this.tagName == null)? 0 :this.tagName.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.uploadUrl == null)? 0 :this.uploadUrl.hashCode()));
        result = ((result* 31)+((this.prerelease == null)? 0 :this.prerelease.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.reactions == null)? 0 :this.reactions.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReleaseData) == false) {
            return false;
        }
        ReleaseData rhs = ((ReleaseData) other);
        return (((((((((((((((((((((((((this.targetCommitish == rhs.targetCommitish)||((this.targetCommitish!= null)&&this.targetCommitish.equals(rhs.targetCommitish)))&&((this.body == rhs.body)||((this.body!= null)&&this.body.equals(rhs.body))))&&((this.zipballUrl == rhs.zipballUrl)||((this.zipballUrl!= null)&&this.zipballUrl.equals(rhs.zipballUrl))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.assets == rhs.assets)||((this.assets!= null)&&this.assets.equals(rhs.assets))))&&((this.bodyText == rhs.bodyText)||((this.bodyText!= null)&&this.bodyText.equals(rhs.bodyText))))&&((this.draft == rhs.draft)||((this.draft!= null)&&this.draft.equals(rhs.draft))))&&((this.bodyHtml == rhs.bodyHtml)||((this.bodyHtml!= null)&&this.bodyHtml.equals(rhs.bodyHtml))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.assetsUrl == rhs.assetsUrl)||((this.assetsUrl!= null)&&this.assetsUrl.equals(rhs.assetsUrl))))&&((this.discussionUrl == rhs.discussionUrl)||((this.discussionUrl!= null)&&this.discussionUrl.equals(rhs.discussionUrl))))&&((this.tarballUrl == rhs.tarballUrl)||((this.tarballUrl!= null)&&this.tarballUrl.equals(rhs.tarballUrl))))&&((this.publishedAt == rhs.publishedAt)||((this.publishedAt!= null)&&this.publishedAt.equals(rhs.publishedAt))))&&((this.author == rhs.author)||((this.author!= null)&&this.author.equals(rhs.author))))&&((this.htmlUrl == rhs.htmlUrl)||((this.htmlUrl!= null)&&this.htmlUrl.equals(rhs.htmlUrl))))&&((this.mentionsCount == rhs.mentionsCount)||((this.mentionsCount!= null)&&this.mentionsCount.equals(rhs.mentionsCount))))&&((this.tagName == rhs.tagName)||((this.tagName!= null)&&this.tagName.equals(rhs.tagName))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.uploadUrl == rhs.uploadUrl)||((this.uploadUrl!= null)&&this.uploadUrl.equals(rhs.uploadUrl))))&&((this.prerelease == rhs.prerelease)||((this.prerelease!= null)&&this.prerelease.equals(rhs.prerelease))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.reactions == rhs.reactions)||((this.reactions!= null)&&this.reactions.equals(rhs.reactions))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))));
    }

}
