
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class VenueIcon implements Serializable
{

    @SerializedName("lg")
    @Expose
    private String lg;
    @SerializedName("md")
    @Expose
    private String md;
    @SerializedName("sm")
    @Expose
    private String sm;
    private final static long serialVersionUID = -621317559375676838L;

    /**
     * 
     * @return
     *     The lg
     */
    public String getLg() {
        return lg;
    }

    /**
     * 
     * @param lg
     *     The lg
     */
    public void setLg(String lg) {
        this.lg = lg;
    }

    /**
     * 
     * @return
     *     The md
     */
    public String getMd() {
        return md;
    }

    /**
     * 
     * @param md
     *     The md
     */
    public void setMd(String md) {
        this.md = md;
    }

    /**
     * 
     * @return
     *     The sm
     */
    public String getSm() {
        return sm;
    }

    /**
     * 
     * @param sm
     *     The sm
     */
    public void setSm(String sm) {
        this.sm = sm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lg).append(md).append(sm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VenueIcon) == false) {
            return false;
        }
        VenueIcon rhs = ((VenueIcon) other);
        return new EqualsBuilder().append(lg, rhs.lg).append(md, rhs.md).append(sm, rhs.sm).isEquals();
    }

}
