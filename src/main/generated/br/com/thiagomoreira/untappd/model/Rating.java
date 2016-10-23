
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Rating implements Serializable
{

    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("rating_score")
    @Expose
    private double ratingScore;
    private final static long serialVersionUID = -5697530254737882723L;

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).append(ratingScore).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rating) == false) {
            return false;
        }
        Rating rhs = ((Rating) other);
        return new EqualsBuilder().append(count, rhs.count).append(ratingScore, rhs.ratingScore).isEquals();
    }

}
