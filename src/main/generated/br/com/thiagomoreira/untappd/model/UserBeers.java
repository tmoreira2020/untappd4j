
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserBeers implements Serializable
{

    @SerializedName("is_search")
    @Expose
    private boolean isSearch;
    @SerializedName("beers")
    @Expose
    private Beers beers;
    private final static long serialVersionUID = 2437213716451957388L;

    /**
     * 
     * @return
     *     The isSearch
     */
    public boolean isIsSearch() {
        return isSearch;
    }

    /**
     * 
     * @param isSearch
     *     The is_search
     */
    public void setIsSearch(boolean isSearch) {
        this.isSearch = isSearch;
    }

    /**
     * 
     * @return
     *     The beers
     */
    public Beers getBeers() {
        return beers;
    }

    /**
     * 
     * @param beers
     *     The beers
     */
    public void setBeers(Beers beers) {
        this.beers = beers;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isSearch).append(beers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserBeers) == false) {
            return false;
        }
        UserBeers rhs = ((UserBeers) other);
        return new EqualsBuilder().append(isSearch, rhs.isSearch).append(beers, rhs.beers).isEquals();
    }

}
