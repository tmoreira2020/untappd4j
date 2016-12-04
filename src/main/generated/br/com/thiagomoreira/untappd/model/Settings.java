
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Settings implements Serializable
{

    @SerializedName("badge")
    @Expose
    private Badge badge;
    @SerializedName("checkin")
    @Expose
    private Checkin checkin;
    @SerializedName("navigation")
    @Expose
    private Navigation navigation;
    @SerializedName("email_address")
    @Expose
    private String emailAddress;
    private final static long serialVersionUID = -7859051914526718056L;

    /**
     * 
     * @return
     *     The badge
     */
    public Badge getBadge() {
        return badge;
    }

    /**
     * 
     * @param badge
     *     The badge
     */
    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    /**
     * 
     * @return
     *     The checkin
     */
    public Checkin getCheckin() {
        return checkin;
    }

    /**
     * 
     * @param checkin
     *     The checkin
     */
    public void setCheckin(Checkin checkin) {
        this.checkin = checkin;
    }

    /**
     * 
     * @return
     *     The navigation
     */
    public Navigation getNavigation() {
        return navigation;
    }

    /**
     * 
     * @param navigation
     *     The navigation
     */
    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    /**
     * 
     * @return
     *     The emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * 
     * @param emailAddress
     *     The email_address
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(badge).append(checkin).append(navigation).append(emailAddress).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Settings) == false) {
            return false;
        }
        Settings rhs = ((Settings) other);
        return new EqualsBuilder().append(badge, rhs.badge).append(checkin, rhs.checkin).append(navigation, rhs.navigation).append(emailAddress, rhs.emailAddress).isEquals();
    }

}
