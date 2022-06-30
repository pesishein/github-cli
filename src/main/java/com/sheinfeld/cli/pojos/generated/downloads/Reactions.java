
package com.sheinfeld.cli.pojos.generated.downloads;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Reaction Rollup
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "total_count",
    "PLUS1",
    "MINUS1",
    "laugh",
    "confused",
    "heart",
    "hooray",
    "eyes",
    "rocket"
})
public class Reactions {

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
    @JsonProperty("total_count")
    private Integer totalCount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PLUS1")
    private Integer plus1;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MINUS1")
    private Integer minus1;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("laugh")
    private Integer laugh;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confused")
    private Integer confused;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("heart")
    private Integer heart;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooray")
    private Integer hooray;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eyes")
    private Integer eyes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rocket")
    private Integer rocket;
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
    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PLUS1")
    public Integer getPlus1() {
        return plus1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("PLUS1")
    public void setPlus1(Integer plus1) {
        this.plus1 = plus1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MINUS1")
    public Integer getMinus1() {
        return minus1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MINUS1")
    public void setMinus1(Integer minus1) {
        this.minus1 = minus1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("laugh")
    public Integer getLaugh() {
        return laugh;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("laugh")
    public void setLaugh(Integer laugh) {
        this.laugh = laugh;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confused")
    public Integer getConfused() {
        return confused;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("confused")
    public void setConfused(Integer confused) {
        this.confused = confused;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("heart")
    public Integer getHeart() {
        return heart;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("heart")
    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooray")
    public Integer getHooray() {
        return hooray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("hooray")
    public void setHooray(Integer hooray) {
        this.hooray = hooray;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eyes")
    public Integer getEyes() {
        return eyes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("eyes")
    public void setEyes(Integer eyes) {
        this.eyes = eyes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rocket")
    public Integer getRocket() {
        return rocket;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rocket")
    public void setRocket(Integer rocket) {
        this.rocket = rocket;
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
        sb.append(Reactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("plus1");
        sb.append('=');
        sb.append(((this.plus1 == null)?"<null>":this.plus1));
        sb.append(',');
        sb.append("minus1");
        sb.append('=');
        sb.append(((this.minus1 == null)?"<null>":this.minus1));
        sb.append(',');
        sb.append("laugh");
        sb.append('=');
        sb.append(((this.laugh == null)?"<null>":this.laugh));
        sb.append(',');
        sb.append("confused");
        sb.append('=');
        sb.append(((this.confused == null)?"<null>":this.confused));
        sb.append(',');
        sb.append("heart");
        sb.append('=');
        sb.append(((this.heart == null)?"<null>":this.heart));
        sb.append(',');
        sb.append("hooray");
        sb.append('=');
        sb.append(((this.hooray == null)?"<null>":this.hooray));
        sb.append(',');
        sb.append("eyes");
        sb.append('=');
        sb.append(((this.eyes == null)?"<null>":this.eyes));
        sb.append(',');
        sb.append("rocket");
        sb.append('=');
        sb.append(((this.rocket == null)?"<null>":this.rocket));
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
        result = ((result* 31)+((this.confused == null)? 0 :this.confused.hashCode()));
        result = ((result* 31)+((this.rocket == null)? 0 :this.rocket.hashCode()));
        result = ((result* 31)+((this.plus1 == null)? 0 :this.plus1 .hashCode()));
        result = ((result* 31)+((this.minus1 == null)? 0 :this.minus1 .hashCode()));
        result = ((result* 31)+((this.hooray == null)? 0 :this.hooray.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.eyes == null)? 0 :this.eyes.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.laugh == null)? 0 :this.laugh.hashCode()));
        result = ((result* 31)+((this.heart == null)? 0 :this.heart.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reactions) == false) {
            return false;
        }
        Reactions rhs = ((Reactions) other);
        return ((((((((((((this.confused == rhs.confused)||((this.confused!= null)&&this.confused.equals(rhs.confused)))&&((this.rocket == rhs.rocket)||((this.rocket!= null)&&this.rocket.equals(rhs.rocket))))&&((this.plus1 == rhs.plus1)||((this.plus1 != null)&&this.plus1 .equals(rhs.plus1))))&&((this.minus1 == rhs.minus1)||((this.minus1 != null)&&this.minus1 .equals(rhs.minus1))))&&((this.hooray == rhs.hooray)||((this.hooray!= null)&&this.hooray.equals(rhs.hooray))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.eyes == rhs.eyes)||((this.eyes!= null)&&this.eyes.equals(rhs.eyes))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.laugh == rhs.laugh)||((this.laugh!= null)&&this.laugh.equals(rhs.laugh))))&&((this.heart == rhs.heart)||((this.heart!= null)&&this.heart.equals(rhs.heart))));
    }

}
