
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Beer implements Serializable
{

    @SerializedName("bid")
    @Expose
    private int bid;
    @SerializedName("beer_name")
    @Expose
    private String beerName;
    @SerializedName("beer_label")
    @Expose
    private String beerLabel;
    @SerializedName("beer_label_hd")
    @Expose
    private String beerLabelHd;
    @SerializedName("beer_abv")
    @Expose
    private double beerAbv;
    @SerializedName("beer_ibu")
    @Expose
    private int beerIbu;
    @SerializedName("beer_description")
    @Expose
    private String beerDescription;
    @SerializedName("beer_style")
    @Expose
    private String beerStyle;
    @SerializedName("is_in_production")
    @Expose
    private int isInProduction;
    @SerializedName("beer_slug")
    @Expose
    private String beerSlug;
    @SerializedName("is_homebrew")
    @Expose
    private int isHomebrew;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("rating_count")
    @Expose
    private int ratingCount;
    @SerializedName("rating_score")
    @Expose
    private double ratingScore;
    @SerializedName("stats")
    @Expose
    private Object stats;
    @SerializedName("brewery")
    @Expose
    private Brewery brewery;
    @SerializedName("auth_rating")
    @Expose
    private double authRating;
    @SerializedName("wish_list")
    @Expose
    private boolean wishList;
    @SerializedName("media")
    @Expose
    private Object media;
    @SerializedName("checkins")
    @Expose
    private Object checkins;
    @SerializedName("similar")
    @Expose
    private Object similar;
    @SerializedName("friends")
    @Expose
    private Object friends;
    @SerializedName("weighted_rating_score")
    @Expose
    private double weightedRatingScore;
    @SerializedName("vintages")
    @Expose
    private Object vintages;
    private final static long serialVersionUID = -1293952362985804318L;

    /**
     * 
     * @return
     *     The bid
     */
    public int getBid() {
        return bid;
    }

    /**
     * 
     * @param bid
     *     The bid
     */
    public void setBid(int bid) {
        this.bid = bid;
    }

    /**
     * 
     * @return
     *     The beerName
     */
    public String getBeerName() {
        return beerName;
    }

    /**
     * 
     * @param beerName
     *     The beer_name
     */
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }

    /**
     * 
     * @return
     *     The beerLabel
     */
    public String getBeerLabel() {
        return beerLabel;
    }

    /**
     * 
     * @param beerLabel
     *     The beer_label
     */
    public void setBeerLabel(String beerLabel) {
        this.beerLabel = beerLabel;
    }

    /**
     * 
     * @return
     *     The beerLabelHd
     */
    public String getBeerLabelHd() {
        return beerLabelHd;
    }

    /**
     * 
     * @param beerLabelHd
     *     The beer_label_hd
     */
    public void setBeerLabelHd(String beerLabelHd) {
        this.beerLabelHd = beerLabelHd;
    }

    /**
     * 
     * @return
     *     The beerAbv
     */
    public double getBeerAbv() {
        return beerAbv;
    }

    /**
     * 
     * @param beerAbv
     *     The beer_abv
     */
    public void setBeerAbv(double beerAbv) {
        this.beerAbv = beerAbv;
    }

    /**
     * 
     * @return
     *     The beerIbu
     */
    public int getBeerIbu() {
        return beerIbu;
    }

    /**
     * 
     * @param beerIbu
     *     The beer_ibu
     */
    public void setBeerIbu(int beerIbu) {
        this.beerIbu = beerIbu;
    }

    /**
     * 
     * @return
     *     The beerDescription
     */
    public String getBeerDescription() {
        return beerDescription;
    }

    /**
     * 
     * @param beerDescription
     *     The beer_description
     */
    public void setBeerDescription(String beerDescription) {
        this.beerDescription = beerDescription;
    }

    /**
     * 
     * @return
     *     The beerStyle
     */
    public String getBeerStyle() {
        return beerStyle;
    }

    /**
     * 
     * @param beerStyle
     *     The beer_style
     */
    public void setBeerStyle(String beerStyle) {
        this.beerStyle = beerStyle;
    }

    /**
     * 
     * @return
     *     The isInProduction
     */
    public int getIsInProduction() {
        return isInProduction;
    }

    /**
     * 
     * @param isInProduction
     *     The is_in_production
     */
    public void setIsInProduction(int isInProduction) {
        this.isInProduction = isInProduction;
    }

    /**
     * 
     * @return
     *     The beerSlug
     */
    public String getBeerSlug() {
        return beerSlug;
    }

    /**
     * 
     * @param beerSlug
     *     The beer_slug
     */
    public void setBeerSlug(String beerSlug) {
        this.beerSlug = beerSlug;
    }

    /**
     * 
     * @return
     *     The isHomebrew
     */
    public int getIsHomebrew() {
        return isHomebrew;
    }

    /**
     * 
     * @param isHomebrew
     *     The is_homebrew
     */
    public void setIsHomebrew(int isHomebrew) {
        this.isHomebrew = isHomebrew;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The ratingCount
     */
    public int getRatingCount() {
        return ratingCount;
    }

    /**
     * 
     * @param ratingCount
     *     The rating_count
     */
    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
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

    /**
     * 
     * @return
     *     The authRating
     */
    public double getAuthRating() {
        return authRating;
    }

    /**
     * 
     * @param authRating
     *     The auth_rating
     */
    public void setAuthRating(double authRating) {
        this.authRating = authRating;
    }

    /**
     * 
     * @return
     *     The wishList
     */
    public boolean isWishList() {
        return wishList;
    }

    /**
     * 
     * @param wishList
     *     The wish_list
     */
    public void setWishList(boolean wishList) {
        this.wishList = wishList;
    }

    /**
     * 
     * @return
     *     The media
     */
    public Object getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(Object media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The checkins
     */
    public Object getCheckins() {
        return checkins;
    }

    /**
     * 
     * @param checkins
     *     The checkins
     */
    public void setCheckins(Object checkins) {
        this.checkins = checkins;
    }

    /**
     * 
     * @return
     *     The similar
     */
    public Object getSimilar() {
        return similar;
    }

    /**
     * 
     * @param similar
     *     The similar
     */
    public void setSimilar(Object similar) {
        this.similar = similar;
    }

    /**
     * 
     * @return
     *     The friends
     */
    public Object getFriends() {
        return friends;
    }

    /**
     * 
     * @param friends
     *     The friends
     */
    public void setFriends(Object friends) {
        this.friends = friends;
    }

    /**
     * 
     * @return
     *     The weightedRatingScore
     */
    public double getWeightedRatingScore() {
        return weightedRatingScore;
    }

    /**
     * 
     * @param weightedRatingScore
     *     The weighted_rating_score
     */
    public void setWeightedRatingScore(double weightedRatingScore) {
        this.weightedRatingScore = weightedRatingScore;
    }

    /**
     * 
     * @return
     *     The vintages
     */
    public Object getVintages() {
        return vintages;
    }

    /**
     * 
     * @param vintages
     *     The vintages
     */
    public void setVintages(Object vintages) {
        this.vintages = vintages;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bid).append(beerName).append(beerLabel).append(beerLabelHd).append(beerAbv).append(beerIbu).append(beerDescription).append(beerStyle).append(isInProduction).append(beerSlug).append(isHomebrew).append(createdAt).append(ratingCount).append(ratingScore).append(stats).append(brewery).append(authRating).append(wishList).append(media).append(checkins).append(similar).append(friends).append(weightedRatingScore).append(vintages).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beer) == false) {
            return false;
        }
        Beer rhs = ((Beer) other);
        return new EqualsBuilder().append(bid, rhs.bid).append(beerName, rhs.beerName).append(beerLabel, rhs.beerLabel).append(beerLabelHd, rhs.beerLabelHd).append(beerAbv, rhs.beerAbv).append(beerIbu, rhs.beerIbu).append(beerDescription, rhs.beerDescription).append(beerStyle, rhs.beerStyle).append(isInProduction, rhs.isInProduction).append(beerSlug, rhs.beerSlug).append(isHomebrew, rhs.isHomebrew).append(createdAt, rhs.createdAt).append(ratingCount, rhs.ratingCount).append(ratingScore, rhs.ratingScore).append(stats, rhs.stats).append(brewery, rhs.brewery).append(authRating, rhs.authRating).append(wishList, rhs.wishList).append(media, rhs.media).append(checkins, rhs.checkins).append(similar, rhs.similar).append(friends, rhs.friends).append(weightedRatingScore, rhs.weightedRatingScore).append(vintages, rhs.vintages).isEquals();
    }

}
