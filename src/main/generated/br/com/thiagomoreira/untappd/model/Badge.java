
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Badge implements Serializable
{

    @SerializedName("badges_to_facebook")
    @Expose
    private int badgesToFacebook;
    @SerializedName("badges_to_twitter")
    @Expose
    private int badgesToTwitter;
    private final static long serialVersionUID = -1032223199135234790L;

    /**
     * 
     * @return
     *     The badgesToFacebook
     */
    public int getBadgesToFacebook() {
        return badgesToFacebook;
    }

    /**
     * 
     * @param badgesToFacebook
     *     The badges_to_facebook
     */
    public void setBadgesToFacebook(int badgesToFacebook) {
        this.badgesToFacebook = badgesToFacebook;
    }

    /**
     * 
     * @return
     *     The badgesToTwitter
     */
    public int getBadgesToTwitter() {
        return badgesToTwitter;
    }

    /**
     * 
     * @param badgesToTwitter
     *     The badges_to_twitter
     */
    public void setBadgesToTwitter(int badgesToTwitter) {
        this.badgesToTwitter = badgesToTwitter;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(badgesToFacebook).append(badgesToTwitter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Badge) == false) {
            return false;
        }
        Badge rhs = ((Badge) other);
        return new EqualsBuilder().append(badgesToFacebook, rhs.badgesToFacebook).append(badgesToTwitter, rhs.badgesToTwitter).isEquals();
    }

}
