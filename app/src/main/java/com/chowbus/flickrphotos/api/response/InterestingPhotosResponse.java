package com.chowbus.flickrphotos.api.response;

import com.chowbus.flickrphotos.model.Photo;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class InterestingPhotosResponse extends BaseResponse {

    @SerializedName("photos")
    private PhotosBean photos;

    public PhotosBean getPhotos() {
        return photos;
    }

    public void setPhotos(PhotosBean photos) {
        this.photos = photos;
    }

    public static class PhotosBean {

        @SerializedName("page")
        private int page;
        @SerializedName("pages")
        private String pages;
        @SerializedName("perpage")
        private int perpage;
        @SerializedName("total")
        private int total;
        @SerializedName("photo")
        private ArrayList<Photo> photos;

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public int getPerpage() {
            return perpage;
        }

        public void setPerpage(int perpage) {
            this.perpage = perpage;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public ArrayList<Photo> getPhotos() {
            return photos;
        }

        public void setPhotos(ArrayList<Photo> photos) {
            this.photos = photos;
        }
    }
}
