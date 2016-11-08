
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Contact implements Serializable
{

    @SerializedName("facebook")
    @Expose
    private String facebook;
    private final static long serialVersionUID = -6496657340544491742L;

    /**
     * 
     * @return
     *     The facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * 
     * @param facebook
     *     The facebook
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(facebook).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(facebook, rhs.facebook).isEquals();
    }

}
