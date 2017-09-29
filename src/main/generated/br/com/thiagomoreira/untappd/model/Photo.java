
package br.com.thiagomoreira.untappd.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Photo implements Serializable
{

    @SerializedName("photo_img_lg")
    @Expose
    private String photoImgLg;
    @SerializedName("photo_img_md")
    @Expose
    private String photoImgMd;
    @SerializedName("photo_img_og")
    @Expose
    private String photoImgOg;
    @SerializedName("photo_img_sm")
    @Expose
    private String photoImgSm;
    private final static long serialVersionUID = 6535500413114457059L;

    /**
     * 
     * @return
     *     The photoImgLg
     */
    public String getPhotoImgLg() {
        return photoImgLg;
    }

    /**
     * 
     * @param photoImgLg
     *     The photo_img_lg
     */
    public void setPhotoImgLg(String photoImgLg) {
        this.photoImgLg = photoImgLg;
    }

    /**
     * 
     * @return
     *     The photoImgMd
     */
    public String getPhotoImgMd() {
        return photoImgMd;
    }

    /**
     * 
     * @param photoImgMd
     *     The photo_img_md
     */
    public void setPhotoImgMd(String photoImgMd) {
        this.photoImgMd = photoImgMd;
    }

    /**
     * 
     * @return
     *     The photoImgOg
     */
    public String getPhotoImgOg() {
        return photoImgOg;
    }

    /**
     * 
     * @param photoImgOg
     *     The photo_img_og
     */
    public void setPhotoImgOg(String photoImgOg) {
        this.photoImgOg = photoImgOg;
    }

    /**
     * 
     * @return
     *     The photoImgSm
     */
    public String getPhotoImgSm() {
        return photoImgSm;
    }

    /**
     * 
     * @param photoImgSm
     *     The photo_img_sm
     */
    public void setPhotoImgSm(String photoImgSm) {
        this.photoImgSm = photoImgSm;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(photoImgLg).append(photoImgMd).append(photoImgOg).append(photoImgSm).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Photo) == false) {
            return false;
        }
        Photo rhs = ((Photo) other);
        return new EqualsBuilder().append(photoImgLg, rhs.photoImgLg).append(photoImgMd, rhs.photoImgMd).append(photoImgOg, rhs.photoImgOg).append(photoImgSm, rhs.photoImgSm).isEquals();
    }

}
