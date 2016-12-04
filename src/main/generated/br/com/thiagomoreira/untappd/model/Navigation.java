
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Navigation implements Serializable
{

    @SerializedName("default_to_checkin")
    @Expose
    private int defaultToCheckin;
    private final static long serialVersionUID = -5174550299221300882L;

    /**
     * 
     * @return
     *     The defaultToCheckin
     */
    public int getDefaultToCheckin() {
        return defaultToCheckin;
    }

    /**
     * 
     * @param defaultToCheckin
     *     The default_to_checkin
     */
    public void setDefaultToCheckin(int defaultToCheckin) {
        this.defaultToCheckin = defaultToCheckin;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultToCheckin).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Navigation) == false) {
            return false;
        }
        Navigation rhs = ((Navigation) other);
        return new EqualsBuilder().append(defaultToCheckin, rhs.defaultToCheckin).isEquals();
    }

}
