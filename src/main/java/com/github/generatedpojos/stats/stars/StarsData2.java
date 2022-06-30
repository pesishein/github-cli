
package com.github.generatedpojos.stats.stars;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Stargazer
 * <p>
 * Stargazer
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "starred_at",
    "user"
})
@Generated("jsonschema2pojo")
public class StarsData2 {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("starred_at")
    private Date starredAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user")
    private Object user;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("starred_at")
    public Date getStarredAt() {
        return starredAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("starred_at")
    public void setStarredAt(Date starredAt) {
        this.starredAt = starredAt;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user")
    public Object getUser() {
        return user;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("user")
    public void setUser(Object user) {
        this.user = user;
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
        sb.append(StarsData2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("starredAt");
        sb.append('=');
        sb.append(((this.starredAt == null)?"<null>":this.starredAt));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
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
        result = ((result* 31)+((this.starredAt == null)? 0 :this.starredAt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StarsData2) == false) {
            return false;
        }
        StarsData2 rhs = ((StarsData2) other);
        return ((((this.starredAt == rhs.starredAt)||((this.starredAt!= null)&&this.starredAt.equals(rhs.starredAt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))));
    }

}
