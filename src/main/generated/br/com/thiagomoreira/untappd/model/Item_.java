
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item_ implements Serializable
{

    @SerializedName("first_checkin_id")
    @Expose
    private int firstCheckinId;
    @SerializedName("first_created_at")
    @Expose
    private String firstCreatedAt;
    @SerializedName("recent_checkin_id")
    @Expose
    private int recentCheckinId;
    @SerializedName("recent_created_at")
    @Expose
    private String recentCreatedAt;
    @SerializedName("recent_created_at_timezone")
    @Expose
    private String recentCreatedAtTimezone;
    @SerializedName("rating_score")
    @Expose
    private double ratingScore;
    @SerializedName("first_had")
    @Expose
    private String firstHad;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("beer")
    @Expose
    private Beer beer;
    @SerializedName("brewery")
    @Expose
    private Brewery brewery;
    private final static long serialVersionUID = -8889018130126768208L;

    /**
     * 
     * @return
     *     The firstCheckinId
     */
    public int getFirstCheckinId() {
        return firstCheckinId;
    }

    /**
     * 
     * @param firstCheckinId
     *     The first_checkin_id
     */
    public void setFirstCheckinId(int firstCheckinId) {
        this.firstCheckinId = firstCheckinId;
    }

    /**
     * 
     * @return
     *     The firstCreatedAt
     */
    public String getFirstCreatedAt() {
        return firstCreatedAt;
    }

    /**
     * 
     * @param firstCreatedAt
     *     The first_created_at
     */
    public void setFirstCreatedAt(String firstCreatedAt) {
        this.firstCreatedAt = firstCreatedAt;
    }

    /**
     * 
     * @return
     *     The recentCheckinId
     */
    public int getRecentCheckinId() {
        return recentCheckinId;
    }

    /**
     * 
     * @param recentCheckinId
     *     The recent_checkin_id
     */
    public void setRecentCheckinId(int recentCheckinId) {
        this.recentCheckinId = recentCheckinId;
    }

    /**
     * 
     * @return
     *     The recentCreatedAt
     */
    public String getRecentCreatedAt() {
        return recentCreatedAt;
    }

    /**
     * 
     * @param recentCreatedAt
     *     The recent_created_at
     */
    public void setRecentCreatedAt(String recentCreatedAt) {
        this.recentCreatedAt = recentCreatedAt;
    }

    /**
     * 
     * @return
     *     The recentCreatedAtTimezone
     */
    public String getRecentCreatedAtTimezone() {
        return recentCreatedAtTimezone;
    }

    /**
     * 
     * @param recentCreatedAtTimezone
     *     The recent_created_at_timezone
     */
    public void setRecentCreatedAtTimezone(String recentCreatedAtTimezone) {
        this.recentCreatedAtTimezone = recentCreatedAtTimezone;
    }

    /**
     * 
     * @return
     *     The ratingScore
     */
    public double getRatingScore() {
        return ratingScore;
    }

    /**
     * 
     * @param ratingScore
     *     The rating_score
     */
    public void setRatingScore(double ratingScore) {
        this.ratingScore = ratingScore;
    }

    /**
     * 
     * @return
     *     The firstHad
     */
    public String getFirstHad() {
        return firstHad;
    }

    /**
     * 
     * @param firstHad
     *     The first_had
     */
    public void setFirstHad(String firstHad) {
        this.firstHad = firstHad;
    }

    /**
     * 
     * @return
     *     The count
     */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The beer
     */
    public Beer getBeer() {
        return beer;
    }

    /**
     * 
     * @param beer
     *     The beer
     */
    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    /**
     * 
     * @return
     *     The brewery
     */
    public Brewery getBrewery() {
        return brewery;
    }

    /**
     * 
     * @param brewery
     *     The brewery
     */
    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstCheckinId).append(firstCreatedAt).append(recentCheckinId).append(recentCreatedAt).append(recentCreatedAtTimezone).append(ratingScore).append(firstHad).append(count).append(beer).append(brewery).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item_) == false) {
            return false;
        }
        Item_ rhs = ((Item_) other);
        return new EqualsBuilder().append(firstCheckinId, rhs.firstCheckinId).append(firstCreatedAt, rhs.firstCreatedAt).append(recentCheckinId, rhs.recentCheckinId).append(recentCreatedAt, rhs.recentCreatedAt).append(recentCreatedAtTimezone, rhs.recentCreatedAtTimezone).append(ratingScore, rhs.ratingScore).append(firstHad, rhs.firstHad).append(count, rhs.count).append(beer, rhs.beer).append(brewery, rhs.brewery).isEquals();
    }

}
