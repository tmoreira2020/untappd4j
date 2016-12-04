
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Checkin implements Serializable
{

    @SerializedName("checkin_to_facebook")
    @Expose
    private int checkinToFacebook;
    @SerializedName("checkin_to_twitter")
    @Expose
    private int checkinToTwitter;
    @SerializedName("checkin_to_foursquare")
    @Expose
    private int checkinToFoursquare;
    private final static long serialVersionUID = -8442308136359452045L;

    /**
     * 
     * @return
     *     The checkinToFacebook
     */
    public int getCheckinToFacebook() {
        return checkinToFacebook;
    }

    /**
     * 
     * @param checkinToFacebook
     *     The checkin_to_facebook
     */
    public void setCheckinToFacebook(int checkinToFacebook) {
        this.checkinToFacebook = checkinToFacebook;
    }

    /**
     * 
     * @return
     *     The checkinToTwitter
     */
    public int getCheckinToTwitter() {
        return checkinToTwitter;
    }

    /**
     * 
     * @param checkinToTwitter
     *     The checkin_to_twitter
     */
    public void setCheckinToTwitter(int checkinToTwitter) {
        this.checkinToTwitter = checkinToTwitter;
    }

    /**
     * 
     * @return
     *     The checkinToFoursquare
     */
    public int getCheckinToFoursquare() {
        return checkinToFoursquare;
    }

    /**
     * 
     * @param checkinToFoursquare
     *     The checkin_to_foursquare
     */
    public void setCheckinToFoursquare(int checkinToFoursquare) {
        this.checkinToFoursquare = checkinToFoursquare;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(checkinToFacebook).append(checkinToTwitter).append(checkinToFoursquare).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Checkin) == false) {
            return false;
        }
        Checkin rhs = ((Checkin) other);
        return new EqualsBuilder().append(checkinToFacebook, rhs.checkinToFacebook).append(checkinToTwitter, rhs.checkinToTwitter).append(checkinToFoursquare, rhs.checkinToFoursquare).isEquals();
    }

}
