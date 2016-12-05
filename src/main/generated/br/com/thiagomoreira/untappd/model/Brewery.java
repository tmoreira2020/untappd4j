
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Brewery implements Serializable
{

    @SerializedName("brewery_id")
    @Expose
    private int breweryId;
    @SerializedName("brewery_name")
    @Expose
    private String breweryName;
    @SerializedName("brewery_slug")
    @Expose
    private String brewerySlug;
    @SerializedName("brewery_label")
    @Expose
    private String breweryLabel;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("brewery_in_production")
    @Expose
    private int breweryInProduction;
    @SerializedName("is_independent")
    @Expose
    private int isIndependent;
    @SerializedName("claimed_status")
    @Expose
    private Object claimedStatus;
    @SerializedName("beer_count")
    @Expose
    private int beerCount;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("brewery_type")
    @Expose
    private String breweryType;
    @SerializedName("brewery_type_id")
    @Expose
    private int breweryTypeId;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("rating")
    @Expose
    private Rating rating;
    @SerializedName("brewery_description")
    @Expose
    private String breweryDescription;
    @SerializedName("stats")
    @Expose
    private Object stats;
    @SerializedName("beer_list")
    @Expose
    private BeerList beerList;
    private final static long serialVersionUID = -5809995308140342444L;

    /**
     * 
     * @return
     *     The breweryId
     */
    public int getBreweryId() {
        return breweryId;
    }

    /**
     * 
     * @param breweryId
     *     The brewery_id
     */
    public void setBreweryId(int breweryId) {
        this.breweryId = breweryId;
    }

    /**
     * 
     * @return
     *     The breweryName
     */
    public String getBreweryName() {
        return breweryName;
    }

    /**
     * 
     * @param breweryName
     *     The brewery_name
     */
    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    /**
     * 
     * @return
     *     The brewerySlug
     */
    public String getBrewerySlug() {
        return brewerySlug;
    }

    /**
     * 
     * @param brewerySlug
     *     The brewery_slug
     */
    public void setBrewerySlug(String brewerySlug) {
        this.brewerySlug = brewerySlug;
    }

    /**
     * 
     * @return
     *     The breweryLabel
     */
    public String getBreweryLabel() {
        return breweryLabel;
    }

    /**
     * 
     * @param breweryLabel
     *     The brewery_label
     */
    public void setBreweryLabel(String breweryLabel) {
        this.breweryLabel = breweryLabel;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The country_name
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The breweryInProduction
     */
    public int getBreweryInProduction() {
        return breweryInProduction;
    }

    /**
     * 
     * @param breweryInProduction
     *     The brewery_in_production
     */
    public void setBreweryInProduction(int breweryInProduction) {
        this.breweryInProduction = breweryInProduction;
    }

    /**
     * 
     * @return
     *     The isIndependent
     */
    public int getIsIndependent() {
        return isIndependent;
    }

    /**
     * 
     * @param isIndependent
     *     The is_independent
     */
    public void setIsIndependent(int isIndependent) {
        this.isIndependent = isIndependent;
    }

    /**
     * 
     * @return
     *     The claimedStatus
     */
    public Object getClaimedStatus() {
        return claimedStatus;
    }

    /**
     * 
     * @param claimedStatus
     *     The claimed_status
     */
    public void setClaimedStatus(Object claimedStatus) {
        this.claimedStatus = claimedStatus;
    }

    /**
     * 
     * @return
     *     The beerCount
     */
    public int getBeerCount() {
        return beerCount;
    }

    /**
     * 
     * @param beerCount
     *     The beer_count
     */
    public void setBeerCount(int beerCount) {
        this.beerCount = beerCount;
    }

    /**
     * 
     * @return
     *     The contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * 
     * @return
     *     The breweryType
     */
    public String getBreweryType() {
        return breweryType;
    }

    /**
     * 
     * @param breweryType
     *     The brewery_type
     */
    public void setBreweryType(String breweryType) {
        this.breweryType = breweryType;
    }

    /**
     * 
     * @return
     *     The breweryTypeId
     */
    public int getBreweryTypeId() {
        return breweryTypeId;
    }

    /**
     * 
     * @param breweryTypeId
     *     The brewery_type_id
     */
    public void setBreweryTypeId(int breweryTypeId) {
        this.breweryTypeId = breweryTypeId;
    }

    /**
     * 
     * @return
     *     The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The rating
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * 
     * @param rating
     *     The rating
     */
    public void setRating(Rating rating) {
        this.rating = rating;
    }

    /**
     * 
     * @return
     *     The breweryDescription
     */
    public String getBreweryDescription() {
        return breweryDescription;
    }

    /**
     * 
     * @param breweryDescription
     *     The brewery_description
     */
    public void setBreweryDescription(String breweryDescription) {
        this.breweryDescription = breweryDescription;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Object getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Object stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The beerList
     */
    public BeerList getBeerList() {
        return beerList;
    }

    /**
     * 
     * @param beerList
     *     The beer_list
     */
    public void setBeerList(BeerList beerList) {
        this.beerList = beerList;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(breweryId).append(breweryName).append(brewerySlug).append(breweryLabel).append(countryName).append(breweryInProduction).append(isIndependent).append(claimedStatus).append(beerCount).append(contact).append(breweryType).append(breweryTypeId).append(location).append(rating).append(breweryDescription).append(stats).append(beerList).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Brewery) == false) {
            return false;
        }
        Brewery rhs = ((Brewery) other);
        return new EqualsBuilder().append(breweryId, rhs.breweryId).append(breweryName, rhs.breweryName).append(brewerySlug, rhs.brewerySlug).append(breweryLabel, rhs.breweryLabel).append(countryName, rhs.countryName).append(breweryInProduction, rhs.breweryInProduction).append(isIndependent, rhs.isIndependent).append(claimedStatus, rhs.claimedStatus).append(beerCount, rhs.beerCount).append(contact, rhs.contact).append(breweryType, rhs.breweryType).append(breweryTypeId, rhs.breweryTypeId).append(location, rhs.location).append(rating, rhs.rating).append(breweryDescription, rhs.breweryDescription).append(stats, rhs.stats).append(beerList, rhs.beerList).isEquals();
    }

}
