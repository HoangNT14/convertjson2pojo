
package convert;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nameScore",
    "ageScore"
})
public class LastScore {

    @JsonProperty("nameScore")
    private String nameScore;
    @JsonProperty("ageScore")
    private Integer ageScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("nameScore")
    public String getNameScore() {
        return nameScore;
    }

    @JsonProperty("nameScore")
    public void setNameScore(String nameScore) {
        this.nameScore = nameScore;
    }

    public LastScore withNameScore(String nameScore) {
        this.nameScore = nameScore;
        return this;
    }

    @JsonProperty("ageScore")
    public Integer getAgeScore() {
        return ageScore;
    }

    @JsonProperty("ageScore")
    public void setAgeScore(Integer ageScore) {
        this.ageScore = ageScore;
    }

    public LastScore withAgeScore(Integer ageScore) {
        this.ageScore = ageScore;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public LastScore withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nameScore).append(ageScore).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LastScore) == false) {
            return false;
        }
        LastScore rhs = ((LastScore) other);
        return new EqualsBuilder().append(nameScore, rhs.nameScore).append(ageScore, rhs.ageScore).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
