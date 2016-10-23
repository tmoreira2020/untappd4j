
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Meta implements Serializable
{

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("error_detail")
    @Expose
    private String errorDetail;
    @SerializedName("error_type")
    @Expose
    private String errorType;
    @SerializedName("developer_friendly")
    @Expose
    private String developerFriendly;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("response_time")
    @Expose
    private ResponseTime responseTime;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("init_time")
    @Expose
    private ResponseTime initTime;
    private final static long serialVersionUID = -6760931582994639129L;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The code
     */
    public int getCode() {
        return code;
    }

    /**
     * 
     * (Required)
     * 
     * @param code
     *     The code
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The errorDetail
     */
    public String getErrorDetail() {
        return errorDetail;
    }

    /**
     * 
     * @param errorDetail
     *     The error_detail
     */
    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * 
     * @return
     *     The errorType
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * 
     * @param errorType
     *     The error_type
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * 
     * @return
     *     The developerFriendly
     */
    public String getDeveloperFriendly() {
        return developerFriendly;
    }

    /**
     * 
     * @param developerFriendly
     *     The developer_friendly
     */
    public void setDeveloperFriendly(String developerFriendly) {
        this.developerFriendly = developerFriendly;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The responseTime
     */
    public ResponseTime getResponseTime() {
        return responseTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param responseTime
     *     The response_time
     */
    public void setResponseTime(ResponseTime responseTime) {
        this.responseTime = responseTime;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The initTime
     */
    public ResponseTime getInitTime() {
        return initTime;
    }

    /**
     * 
     * (Required)
     * 
     * @param initTime
     *     The init_time
     */
    public void setInitTime(ResponseTime initTime) {
        this.initTime = initTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(errorDetail).append(errorType).append(developerFriendly).append(responseTime).append(initTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(code, rhs.code).append(errorDetail, rhs.errorDetail).append(errorType, rhs.errorType).append(developerFriendly, rhs.developerFriendly).append(responseTime, rhs.responseTime).append(initTime, rhs.initTime).isEquals();
    }

}
