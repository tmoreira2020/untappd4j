
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Location implements Serializable
{

    @SerializedName("brewery_city")
    @Expose
    private String breweryCity;
    @SerializedName("brewery_state")
    @Expose
    private String breweryState;
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    private final static long serialVersionUID = 4253963161129994463L;

    /**
     * 
     * @return
     *     The breweryCity
     */
    public String getBreweryCity() {
        return breweryCity;
    }

    /**
     * 
     * @param breweryCity
     *     The brewery_city
     */
    public void setBreweryCity(String breweryCity) {
        this.breweryCity = breweryCity;
    }

    /**
     * 
     * @return
     *     The breweryState
     */
    public String getBreweryState() {
        return breweryState;
    }

    /**
     * 
     * @param breweryState
     *     The brewery_state
     */
    public void setBreweryState(String breweryState) {
        this.breweryState = breweryState;
    }

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(breweryCity).append(breweryState).append(lat).append(lng).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(breweryCity, rhs.breweryCity).append(breweryState, rhs.breweryState).append(lat, rhs.lat).append(lng, rhs.lng).isEquals();
    }

}
