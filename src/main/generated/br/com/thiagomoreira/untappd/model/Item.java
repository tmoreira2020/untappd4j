
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item implements Serializable
{

    @SerializedName("has_had")
    @Expose
    private Object hasHad;
    @SerializedName("total_count")
    @Expose
    private int totalCount;
    @SerializedName("beer")
    @Expose
    private Beer beer;
    private final static long serialVersionUID = -7363454455180653618L;

    /**
     * 
     * @return
     *     The hasHad
     */
    public Object getHasHad() {
        return hasHad;
    }

    /**
     * 
     * @param hasHad
     *     The has_had
     */
    public void setHasHad(Object hasHad) {
        this.hasHad = hasHad;
    }

    /**
     * 
     * @return
     *     The totalCount
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * 
     * @param totalCount
     *     The total_count
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(hasHad).append(totalCount).append(beer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(hasHad, rhs.hasHad).append(totalCount, rhs.totalCount).append(beer, rhs.beer).isEquals();
    }

}
