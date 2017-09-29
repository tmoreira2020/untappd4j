
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Foursquare implements Serializable
{

    @SerializedName("foursquare_id")
    @Expose
    private String foursquareId;
    @SerializedName("foursquare_url")
    @Expose
    private String foursquareUrl;
    private final static long serialVersionUID = 7124960528031932268L;

    /**
     * 
     * @return
     *     The foursquareId
     */
    public String getFoursquareId() {
        return foursquareId;
    }

    /**
     * 
     * @param foursquareId
     *     The foursquare_id
     */
    public void setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
    }

    /**
     * 
     * @return
     *     The foursquareUrl
     */
    public String getFoursquareUrl() {
        return foursquareUrl;
    }

    /**
     * 
     * @param foursquareUrl
     *     The foursquare_url
     */
    public void setFoursquareUrl(String foursquareUrl) {
        this.foursquareUrl = foursquareUrl;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(foursquareId).append(foursquareUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Foursquare) == false) {
            return false;
        }
        Foursquare rhs = ((Foursquare) other);
        return new EqualsBuilder().append(foursquareId, rhs.foursquareId).append(foursquareUrl, rhs.foursquareUrl).isEquals();
    }

}
