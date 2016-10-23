
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Response implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("meta")
    @Expose
    private Meta meta;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("notifications")
    @Expose
    private List<Object> notifications = new ArrayList<Object>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("response")
    @Expose
    private Object response;
    private final static long serialVersionUID = 6255805409863997755L;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The meta
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * 
     * (Required)
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The notifications
     */
    public List<Object> getNotifications() {
        return notifications;
    }

    /**
     * 
     * (Required)
     * 
     * @param notifications
     *     The notifications
     */
    public void setNotifications(List<Object> notifications) {
        this.notifications = notifications;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The response
     */
    public Object getResponse() {
        return response;
    }

    /**
     * 
     * (Required)
     * 
     * @param response
     *     The response
     */
    public void setResponse(Object response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(meta).append(notifications).append(response).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(meta, rhs.meta).append(notifications, rhs.notifications).append(response, rhs.response).isEquals();
    }

}
