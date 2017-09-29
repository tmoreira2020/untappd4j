
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class VenueStats implements Serializable
{

    @SerializedName("monthly_count")
    @Expose
    private int monthlyCount;
    @SerializedName("total_count")
    @Expose
    private int totalCount;
    @SerializedName("total_user_count")
    @Expose
    private int totalUserCount;
    @SerializedName("user_count")
    @Expose
    private int userCount;
    @SerializedName("weekly_count")
    @Expose
    private int weeklyCount;
    private final static long serialVersionUID = 2473191891096638674L;

    /**
     * 
     * @return
     *     The monthlyCount
     */
    public int getMonthlyCount() {
        return monthlyCount;
    }

    /**
     * 
     * @param monthlyCount
     *     The monthly_count
     */
    public void setMonthlyCount(int monthlyCount) {
        this.monthlyCount = monthlyCount;
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
     *     The totalUserCount
     */
    public int getTotalUserCount() {
        return totalUserCount;
    }

    /**
     * 
     * @param totalUserCount
     *     The total_user_count
     */
    public void setTotalUserCount(int totalUserCount) {
        this.totalUserCount = totalUserCount;
    }

    /**
     * 
     * @return
     *     The userCount
     */
    public int getUserCount() {
        return userCount;
    }

    /**
     * 
     * @param userCount
     *     The user_count
     */
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    /**
     * 
     * @return
     *     The weeklyCount
     */
    public int getWeeklyCount() {
        return weeklyCount;
    }

    /**
     * 
     * @param weeklyCount
     *     The weekly_count
     */
    public void setWeeklyCount(int weeklyCount) {
        this.weeklyCount = weeklyCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(monthlyCount).append(totalCount).append(totalUserCount).append(userCount).append(weeklyCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VenueStats) == false) {
            return false;
        }
        VenueStats rhs = ((VenueStats) other);
        return new EqualsBuilder().append(monthlyCount, rhs.monthlyCount).append(totalCount, rhs.totalCount).append(totalUserCount, rhs.totalUserCount).append(userCount, rhs.userCount).append(weeklyCount, rhs.weeklyCount).isEquals();
    }

}
