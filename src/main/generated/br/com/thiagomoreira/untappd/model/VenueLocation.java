
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class VenueLocation implements Serializable
{

    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("venue_address")
    @Expose
    private String venueAddress;
    @SerializedName("venue_city")
    @Expose
    private String venueCity;
    @SerializedName("venue_country")
    @Expose
    private String venueCountry;
    @SerializedName("venue_state")
    @Expose
    private String venueState;
    private final static long serialVersionUID = 5475078091884982544L;

    /**
     * 
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The venueAddress
     */
    public String getVenueAddress() {
        return venueAddress;
    }

    /**
     * 
     * @param venueAddress
     *     The venue_address
     */
    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    /**
     * 
     * @return
     *     The venueCity
     */
    public String getVenueCity() {
        return venueCity;
    }

    /**
     * 
     * @param venueCity
     *     The venue_city
     */
    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    /**
     * 
     * @return
     *     The venueCountry
     */
    public String getVenueCountry() {
        return venueCountry;
    }

    /**
     * 
     * @param venueCountry
     *     The venue_country
     */
    public void setVenueCountry(String venueCountry) {
        this.venueCountry = venueCountry;
    }

    /**
     * 
     * @return
     *     The venueState
     */
    public String getVenueState() {
        return venueState;
    }

    /**
     * 
     * @param venueState
     *     The venue_state
     */
    public void setVenueState(String venueState) {
        this.venueState = venueState;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lat).append(lng).append(venueAddress).append(venueCity).append(venueCountry).append(venueState).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VenueLocation) == false) {
            return false;
        }
        VenueLocation rhs = ((VenueLocation) other);
        return new EqualsBuilder().append(lat, rhs.lat).append(lng, rhs.lng).append(venueAddress, rhs.venueAddress).append(venueCity, rhs.venueCity).append(venueCountry, rhs.venueCountry).append(venueState, rhs.venueState).isEquals();
    }

}
