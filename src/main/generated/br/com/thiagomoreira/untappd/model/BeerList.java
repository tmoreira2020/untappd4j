
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BeerList implements Serializable
{

    @SerializedName("is_super")
    @Expose
    private boolean isSuper;
    @SerializedName("sort")
    @Expose
    private String sort;
    @SerializedName("filter")
    @Expose
    private String filter;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("beer_count")
    @Expose
    private int beerCount;
    private final static long serialVersionUID = -7811609829786410538L;

    /**
     * 
     * @return
     *     The isSuper
     */
    public boolean isIsSuper() {
        return isSuper;
    }

    /**
     * 
     * @param isSuper
     *     The is_super
     */
    public void setIsSuper(boolean isSuper) {
        this.isSuper = isSuper;
    }

    /**
     * 
     * @return
     *     The sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * 
     * @param sort
     *     The sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 
     * @return
     *     The filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * 
     * @param filter
     *     The filter
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

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
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The beerCount
     */
    public int getBeerCount() {
        return beerCount;
    }

    /**
     * 
     * @param beerCount
     *     The beer_count
     */
    public void setBeerCount(int beerCount) {
        this.beerCount = beerCount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(isSuper).append(sort).append(filter).append(count).append(items).append(beerCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BeerList) == false) {
            return false;
        }
        BeerList rhs = ((BeerList) other);
        return new EqualsBuilder().append(isSuper, rhs.isSuper).append(sort, rhs.sort).append(filter, rhs.filter).append(count, rhs.count).append(items, rhs.items).append(beerCount, rhs.beerCount).isEquals();
    }

}
