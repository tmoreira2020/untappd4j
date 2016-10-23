
package br.com.thiagomoreira.untappd.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ResponseTime {

    @SerializedName("time")
    @Expose
    private double time;
    @SerializedName("measure")
    @Expose
    private String measure;

    /**
     * 
     * @return
     *     The time
     */
    public double getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     * 
     * @return
     *     The measure
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * 
     * @param measure
     *     The measure
     */
    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(time).append(measure).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseTime) == false) {
            return false;
        }
        ResponseTime rhs = ((ResponseTime) other);
        return new EqualsBuilder().append(time, rhs.time).append(measure, rhs.measure).isEquals();
    }

}
