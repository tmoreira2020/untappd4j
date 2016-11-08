
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Stats implements Serializable
{

    @SerializedName("total_badges")
    @Expose
    private int totalBadges;
    @SerializedName("total_friends")
    @Expose
    private int totalFriends;
    @SerializedName("total_checkins")
    @Expose
    private int totalCheckins;
    @SerializedName("total_beers")
    @Expose
    private int totalBeers;
    @SerializedName("total_created_beers")
    @Expose
    private int totalCreatedBeers;
    @SerializedName("total_followings")
    @Expose
    private int totalFollowings;
    @SerializedName("total_photos")
    @Expose
    private int totalPhotos;
    private final static long serialVersionUID = -4979729825084014761L;

    /**
     * 
     * @return
     *     The totalBadges
     */
    public int getTotalBadges() {
        return totalBadges;
    }

    /**
     * 
     * @param totalBadges
     *     The total_badges
     */
    public void setTotalBadges(int totalBadges) {
        this.totalBadges = totalBadges;
    }

    /**
     * 
     * @return
     *     The totalFriends
     */
    public int getTotalFriends() {
        return totalFriends;
    }

    /**
     * 
     * @param totalFriends
     *     The total_friends
     */
    public void setTotalFriends(int totalFriends) {
        this.totalFriends = totalFriends;
    }

    /**
     * 
     * @return
     *     The totalCheckins
     */
    public int getTotalCheckins() {
        return totalCheckins;
    }

    /**
     * 
     * @param totalCheckins
     *     The total_checkins
     */
    public void setTotalCheckins(int totalCheckins) {
        this.totalCheckins = totalCheckins;
    }

    /**
     * 
     * @return
     *     The totalBeers
     */
    public int getTotalBeers() {
        return totalBeers;
    }

    /**
     * 
     * @param totalBeers
     *     The total_beers
     */
    public void setTotalBeers(int totalBeers) {
        this.totalBeers = totalBeers;
    }

    /**
     * 
     * @return
     *     The totalCreatedBeers
     */
    public int getTotalCreatedBeers() {
        return totalCreatedBeers;
    }

    /**
     * 
     * @param totalCreatedBeers
     *     The total_created_beers
     */
    public void setTotalCreatedBeers(int totalCreatedBeers) {
        this.totalCreatedBeers = totalCreatedBeers;
    }

    /**
     * 
     * @return
     *     The totalFollowings
     */
    public int getTotalFollowings() {
        return totalFollowings;
    }

    /**
     * 
     * @param totalFollowings
     *     The total_followings
     */
    public void setTotalFollowings(int totalFollowings) {
        this.totalFollowings = totalFollowings;
    }

    /**
     * 
     * @return
     *     The totalPhotos
     */
    public int getTotalPhotos() {
        return totalPhotos;
    }

    /**
     * 
     * @param totalPhotos
     *     The total_photos
     */
    public void setTotalPhotos(int totalPhotos) {
        this.totalPhotos = totalPhotos;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalBadges).append(totalFriends).append(totalCheckins).append(totalBeers).append(totalCreatedBeers).append(totalFollowings).append(totalPhotos).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stats) == false) {
            return false;
        }
        Stats rhs = ((Stats) other);
        return new EqualsBuilder().append(totalBadges, rhs.totalBadges).append(totalFriends, rhs.totalFriends).append(totalCheckins, rhs.totalCheckins).append(totalBeers, rhs.totalBeers).append(totalCreatedBeers, rhs.totalCreatedBeers).append(totalFollowings, rhs.totalFollowings).append(totalPhotos, rhs.totalPhotos).isEquals();
    }

}
