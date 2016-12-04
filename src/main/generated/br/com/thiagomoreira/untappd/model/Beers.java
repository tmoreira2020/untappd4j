
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Beers implements Serializable
{

    @SerializedName("sort")
    @Expose
    private String sort;
    @SerializedName("sort_english")
    @Expose
    private String sortEnglish;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("items")
    @Expose
    private List<Item_> items = new ArrayList<Item_>();
    private final static long serialVersionUID = -2578285044706723702L;

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
     *     The sortEnglish
     */
    public String getSortEnglish() {
        return sortEnglish;
    }

    /**
     * 
     * @param sortEnglish
     *     The sort_english
     */
    public void setSortEnglish(String sortEnglish) {
        this.sortEnglish = sortEnglish;
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
    public List<Item_> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item_> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sort).append(sortEnglish).append(count).append(items).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Beers) == false) {
            return false;
        }
        Beers rhs = ((Beers) other);
        return new EqualsBuilder().append(sort, rhs.sort).append(sortEnglish, rhs.sortEnglish).append(count, rhs.count).append(items, rhs.items).isEquals();
    }

}
