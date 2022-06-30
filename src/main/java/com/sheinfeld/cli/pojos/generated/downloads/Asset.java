package com.sheinfeld.cli.pojos.generated.downloads;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Release Asset
 * <p>
 * Data related to a release.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "browser_download_url",
    "id",
    "node_id",
    "name",
    "label",
    "state",
    "content_type",
    "size",
    "download_count",
    "created_at",
    "updated_at",
    "uploader"
})
public class Asset {

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
    @JsonProperty("browser_download_url")
    private URI browserDownloadUrl;
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
     * The file name of the asset.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The file name of the asset.")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    private String label;
    /**
     * State of the release asset.
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State of the release asset.")
    private Asset.State state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("content_type")
    private String contentType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    private Integer size;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("download_count")
    private Integer downloadCount;
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
    @JsonProperty("updated_at")
    private Date updatedAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uploader")
    private Object uploader;
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
    @JsonProperty("browser_download_url")
    public URI getBrowserDownloadUrl() {
        return browserDownloadUrl;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("browser_download_url")
    public void setBrowserDownloadUrl(URI browserDownloadUrl) {
        this.browserDownloadUrl = browserDownloadUrl;
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
     * The file name of the asset.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * The file name of the asset.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * State of the release asset.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public Asset.State getState() {
        return state;
    }

    /**
     * State of the release asset.
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(Asset.State state) {
        this.state = state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("download_count")
    public Integer getDownloadCount() {
        return downloadCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("download_count")
    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
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
    @JsonProperty("updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uploader")
    public Object getUploader() {
        return uploader;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("uploader")
    public void setUploader(Object uploader) {
        this.uploader = uploader;
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
        sb.append(Asset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("browserDownloadUrl");
        sb.append('=');
        sb.append(((this.browserDownloadUrl == null)?"<null>":this.browserDownloadUrl));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("label");
        sb.append('=');
        sb.append(((this.label == null)?"<null>":this.label));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("downloadCount");
        sb.append('=');
        sb.append(((this.downloadCount == null)?"<null>":this.downloadCount));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("uploader");
        sb.append('=');
        sb.append(((this.uploader == null)?"<null>":this.uploader));
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
        result = ((result* 31)+((this.label == null)? 0 :this.label.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.uploader == null)? 0 :this.uploader.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.browserDownloadUrl == null)? 0 :this.browserDownloadUrl.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.downloadCount == null)? 0 :this.downloadCount.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Asset) == false) {
            return false;
        }
        Asset rhs = ((Asset) other);
        return (((((((((((((((this.label == rhs.label)||((this.label!= null)&&this.label.equals(rhs.label)))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.uploader == rhs.uploader)||((this.uploader!= null)&&this.uploader.equals(rhs.uploader))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.browserDownloadUrl == rhs.browserDownloadUrl)||((this.browserDownloadUrl!= null)&&this.browserDownloadUrl.equals(rhs.browserDownloadUrl))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.downloadCount == rhs.downloadCount)||((this.downloadCount!= null)&&this.downloadCount.equals(rhs.downloadCount))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }


    /**
     * State of the release asset.
     * 
     */
    public enum State {

        UPLOADED("uploaded"),
        OPEN("open");
        private final String value;
        private final static Map<String, Asset.State> CONSTANTS = new HashMap<String, Asset.State>();

        static {
            for (Asset.State c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        State(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Asset.State fromValue(String value) {
            Asset.State constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
