package com.mediatechindo.wahyu.materialuikit.template.EcommerceCategory.Style2;

/**
 * Created by Wahyu on 06/08/2015.
 */
public class EcommerceStyle2Model {

    public EcommerceStyle2Model(String mTitle, String lCount, String url){
        title = mTitle;
        pictureCount = lCount;
        imageUrl = url;
    }

    public EcommerceStyle2Model(){

    }

    private String id;
    private String imageUrl;
    private String title;
    private String pictureCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPictureCount() {
        return pictureCount;
    }

    public void setPictureCount(String pictureCount) {
        this.pictureCount = pictureCount;
    }
}
