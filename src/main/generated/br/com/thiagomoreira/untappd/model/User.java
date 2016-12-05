
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User implements Serializable
{

    @SerializedName("uid")
    @Expose
    private int uid;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("user_avatar")
    @Expose
    private String userAvatar;
    @SerializedName("user_avatar_hd")
    @Expose
    private String userAvatarHd;
    @SerializedName("user_cover_photo")
    @Expose
    private String userCoverPhoto;
    @SerializedName("user_cover_photo_offset")
    @Expose
    private int userCoverPhotoOffset;
    @SerializedName("is_private")
    @Expose
    private int isPrivate;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("is_supporter")
    @Expose
    private int isSupporter;
    @SerializedName("relationship")
    @Expose
    private Object relationship;
    @SerializedName("untappd_url")
    @Expose
    private String untappdUrl;
    @SerializedName("account_type")
    @Expose
    private String accountType;
    @SerializedName("stats")
    @Expose
    private Stats stats;
    @SerializedName("contact")
    @Expose
    private Contact_ contact;
    @SerializedName("date_joined")
    @Expose
    private String dateJoined;
    @SerializedName("settings")
    @Expose
    private Settings settings;
    private final static long serialVersionUID = -7736496709636400256L;

    /**
     * 
     * @return
     *     The uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * 
     * @param uid
     *     The uid
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return
     *     The id
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName
     *     The user_name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     * @return
     *     The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 
     * @param firstName
     *     The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 
     * @return
     *     The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName
     *     The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     The userAvatar
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * 
     * @param userAvatar
     *     The user_avatar
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /**
     * 
     * @return
     *     The userAvatarHd
     */
    public String getUserAvatarHd() {
        return userAvatarHd;
    }

    /**
     * 
     * @param userAvatarHd
     *     The user_avatar_hd
     */
    public void setUserAvatarHd(String userAvatarHd) {
        this.userAvatarHd = userAvatarHd;
    }

    /**
     * 
     * @return
     *     The userCoverPhoto
     */
    public String getUserCoverPhoto() {
        return userCoverPhoto;
    }

    /**
     * 
     * @param userCoverPhoto
     *     The user_cover_photo
     */
    public void setUserCoverPhoto(String userCoverPhoto) {
        this.userCoverPhoto = userCoverPhoto;
    }

    /**
     * 
     * @return
     *     The userCoverPhotoOffset
     */
    public int getUserCoverPhotoOffset() {
        return userCoverPhotoOffset;
    }

    /**
     * 
     * @param userCoverPhotoOffset
     *     The user_cover_photo_offset
     */
    public void setUserCoverPhotoOffset(int userCoverPhotoOffset) {
        this.userCoverPhotoOffset = userCoverPhotoOffset;
    }

    /**
     * 
     * @return
     *     The isPrivate
     */
    public int getIsPrivate() {
        return isPrivate;
    }

    /**
     * 
     * @param isPrivate
     *     The is_private
     */
    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * 
     * @param bio
     *     The bio
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * 
     * @return
     *     The isSupporter
     */
    public int getIsSupporter() {
        return isSupporter;
    }

    /**
     * 
     * @param isSupporter
     *     The is_supporter
     */
    public void setIsSupporter(int isSupporter) {
        this.isSupporter = isSupporter;
    }

    /**
     * 
     * @return
     *     The relationship
     */
    public Object getRelationship() {
        return relationship;
    }

    /**
     * 
     * @param relationship
     *     The relationship
     */
    public void setRelationship(Object relationship) {
        this.relationship = relationship;
    }

    /**
     * 
     * @return
     *     The untappdUrl
     */
    public String getUntappdUrl() {
        return untappdUrl;
    }

    /**
     * 
     * @param untappdUrl
     *     The untappd_url
     */
    public void setUntappdUrl(String untappdUrl) {
        this.untappdUrl = untappdUrl;
    }

    /**
     * 
     * @return
     *     The accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 
     * @param accountType
     *     The account_type
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * 
     * @return
     *     The stats
     */
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    /**
     * 
     * @return
     *     The contact
     */
    public Contact_ getContact() {
        return contact;
    }

    /**
     * 
     * @param contact
     *     The contact
     */
    public void setContact(Contact_ contact) {
        this.contact = contact;
    }

    /**
     * 
     * @return
     *     The dateJoined
     */
    public String getDateJoined() {
        return dateJoined;
    }

    /**
     * 
     * @param dateJoined
     *     The date_joined
     */
    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    /**
     * 
     * @return
     *     The settings
     */
    public Settings getSettings() {
        return settings;
    }

    /**
     * 
     * @param settings
     *     The settings
     */
    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uid).append(id).append(userName).append(firstName).append(lastName).append(userAvatar).append(userAvatarHd).append(userCoverPhoto).append(userCoverPhotoOffset).append(isPrivate).append(location).append(url).append(bio).append(isSupporter).append(relationship).append(untappdUrl).append(accountType).append(stats).append(contact).append(dateJoined).append(settings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof User) == false) {
            return false;
        }
        User rhs = ((User) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(id, rhs.id).append(userName, rhs.userName).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(userAvatar, rhs.userAvatar).append(userAvatarHd, rhs.userAvatarHd).append(userCoverPhoto, rhs.userCoverPhoto).append(userCoverPhotoOffset, rhs.userCoverPhotoOffset).append(isPrivate, rhs.isPrivate).append(location, rhs.location).append(url, rhs.url).append(bio, rhs.bio).append(isSupporter, rhs.isSupporter).append(relationship, rhs.relationship).append(untappdUrl, rhs.untappdUrl).append(accountType, rhs.accountType).append(stats, rhs.stats).append(contact, rhs.contact).append(dateJoined, rhs.dateJoined).append(settings, rhs.settings).isEquals();
    }

}
