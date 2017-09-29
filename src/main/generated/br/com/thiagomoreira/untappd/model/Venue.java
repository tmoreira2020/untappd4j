
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Venue implements Serializable
{

    @SerializedName("categories")
    @Expose
    private Categories categories;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("foursquare")
    @Expose
    private Foursquare foursquare;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("location")
    @Expose
    private VenueLocation location;
    @SerializedName("primary_category")
    @Expose
    private String primaryCategory;
    @SerializedName("public_venue")
    @Expose
    private boolean publicVenue;
    @SerializedName("stats")
    @Expose
    private VenueStats stats;
    @SerializedName("venue_icon")
    @Expose
    private VenueIcon venueIcon;
    @SerializedName("venue_id")
    @Expose
    private int venueId;
    @SerializedName("venue_name")
    @Expose
    private String venueName;
    private final static long serialVersionUID = -4024223565930684581L;

    /**
     * 
     * @return
     *     The categories
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * 
     * @param categories
     *     The categories
     */
    public void setCategories(Categories categories) {
        this.categories = categories;
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
     *     The foursquare
     */
    public Foursquare getFoursquare() {
        return foursquare;
    }

    /**
     * 
     * @param foursquare
     *     The foursquare
     */
    public void setFoursquare(Foursquare foursquare) {
        this.foursquare = foursquare;
    }

    /**
     * 
     * @return
     *     The lastUpdated
     */
    public String getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * @param lastUpdated
     *     The last_updated
     */
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * @return
     *     The location
     */
    public VenueLocation getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(VenueLocation location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The primaryCategory
     */
    public String getPrimaryCategory() {
        return primaryCategory;
    }

    /**
     * 
     * @param primaryCategory
     *     The primary_category
     */
    public void setPrimaryCategory(String primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    /**
     * 
     * @return
     *     The publicVenue
     */
    public boolean isPublicVenue() {
        return publicVenue;
    }

    /**
     * 
     * @param publicVenue
     *     The public_venue
     */
    public void setPublicVenue(boolean publicVenue) {
        this.publicVenue = publicVenue;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public VenueStats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(VenueStats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The venueIcon
     */
    public VenueIcon getVenueIcon() {
        return venueIcon;
    }

    /**
     * 
     * @param venueIcon
     *     The venue_icon
     */
    public void setVenueIcon(VenueIcon venueIcon) {
        this.venueIcon = venueIcon;
    }

    /**
     * 
     * @return
     *     The venueId
     */
    public int getVenueId() {
        return venueId;
    }

    /**
     * 
     * @param venueId
     *     The venue_id
     */
    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    /**
     * 
     * @return
     *     The venueName
     */
    public String getVenueName() {
        return venueName;
    }

    /**
     * 
     * @param venueName
     *     The venue_name
     */
    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(categories).append(contact).append(foursquare).append(lastUpdated).append(location).append(primaryCategory).append(publicVenue).append(stats).append(venueIcon).append(venueId).append(venueName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Venue) == false) {
            return false;
        }
        Venue rhs = ((Venue) other);
        return new EqualsBuilder().append(categories, rhs.categories).append(contact, rhs.contact).append(foursquare, rhs.foursquare).append(lastUpdated, rhs.lastUpdated).append(location, rhs.location).append(primaryCategory, rhs.primaryCategory).append(publicVenue, rhs.publicVenue).append(stats, rhs.stats).append(venueIcon, rhs.venueIcon).append(venueId, rhs.venueId).append(venueName, rhs.venueName).isEquals();
    }

}
