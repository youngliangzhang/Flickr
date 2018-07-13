package com.chowbus.flickrphotos.model;

import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("id")
    private String id;
    @SerializedName("owner")
    private String owner;
    @SerializedName("secret")
    private String secret;
    @SerializedName("server")
    private String server;
    @SerializedName("farm")
    private int farm;
    @SerializedName("title")
    private String title;
    @SerializedName("ispublic")
    private int ispublic;
    @SerializedName("isfriend")
    private int isfriend;
    @SerializedName("isfamily")
    private int isfamily;
    @SerializedName("license")
    private String license;
    @SerializedName("description")
    private DescriptionBean description;
    @SerializedName("dateupload")
    private String dateupload;
    @SerializedName("lastupdate")
    private String lastupdate;
    @SerializedName("datetaken")
    private String datetaken;
    @SerializedName("datetakengranularity")
    private int datetakengranularity;
    @SerializedName("datetakenunknown")
    private String datetakenunknown;
    @SerializedName("ownername")
    private String ownername;
    @SerializedName("iconserver")
    private String iconserver;
    @SerializedName("iconfarm")
    private int iconfarm;
    @SerializedName("views")
    private String views;
    @SerializedName("tags")
    private String tags;
    @SerializedName("machine_tags")
    private String machineTags;
    @SerializedName("latitude")
    private int latitude;
    @SerializedName("longitude")
    private int longitude;
    @SerializedName("accuracy")
    private int accuracy;
    @SerializedName("context")
    private int context;
    @SerializedName("media")
    private String media;
    @SerializedName("media_status")
    private String mediaStatus;
    @SerializedName("url_sq")
    private String urlSq;
    @SerializedName("height_sq")
    private int heightSq;
    @SerializedName("width_sq")
    private int widthSq;
    @SerializedName("url_t")
    private String urlT;
    @SerializedName("height_t")
    private int heightT;
    @SerializedName("width_t")
    private int widthT;
    @SerializedName("url_s")
    private String urlS;
    @SerializedName("height_s")
    private String heightS;
    @SerializedName("width_s")
    private String widthS;
    @SerializedName("url_q")
    private String urlQ;
    @SerializedName("height_q")
    private String heightQ;
    @SerializedName("width_q")
    private String widthQ;
    @SerializedName("url_m")
    private String urlM;
    @SerializedName("height_m")
    private String heightM;
    @SerializedName("width_m")
    private String widthM;
    @SerializedName("url_n")
    private String urlN;
    @SerializedName("height_n")
    private String heightN;
    @SerializedName("width_n")
    private String widthN;
    @SerializedName("url_z")
    private String urlZ;
    @SerializedName("height_z")
    private String heightZ;
    @SerializedName("width_z")
    private String widthZ;
    @SerializedName("url_c")
    private String urlC;
    @SerializedName("height_c")
    private String heightC;
    @SerializedName("width_c")
    private String widthC;
    @SerializedName("url_l")
    private String urlL;
    @SerializedName("height_l")
    private String heightL;
    @SerializedName("width_l")
    private String widthL;
    @SerializedName("pathalias")
    private String pathalias;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIspublic() {
        return ispublic;
    }

    public void setIspublic(int ispublic) {
        this.ispublic = ispublic;
    }

    public int getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(int isfriend) {
        this.isfriend = isfriend;
    }

    public int getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(int isfamily) {
        this.isfamily = isfamily;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public DescriptionBean getDescription() {
        return description;
    }

    public void setDescription(DescriptionBean description) {
        this.description = description;
    }

    public String getDateupload() {
        return dateupload;
    }

    public void setDateupload(String dateupload) {
        this.dateupload = dateupload;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getDatetaken() {
        return datetaken;
    }

    public void setDatetaken(String datetaken) {
        this.datetaken = datetaken;
    }

    public int getDatetakengranularity() {
        return datetakengranularity;
    }

    public void setDatetakengranularity(int datetakengranularity) {
        this.datetakengranularity = datetakengranularity;
    }

    public String getDatetakenunknown() {
        return datetakenunknown;
    }

    public void setDatetakenunknown(String datetakenunknown) {
        this.datetakenunknown = datetakenunknown;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getIconserver() {
        return iconserver;
    }

    public void setIconserver(String iconserver) {
        this.iconserver = iconserver;
    }

    public int getIconfarm() {
        return iconfarm;
    }

    public void setIconfarm(int iconfarm) {
        this.iconfarm = iconfarm;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getMachineTags() {
        return machineTags;
    }

    public void setMachineTags(String machineTags) {
        this.machineTags = machineTags;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getContext() {
        return context;
    }

    public void setContext(int context) {
        this.context = context;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMediaStatus() {
        return mediaStatus;
    }

    public void setMediaStatus(String mediaStatus) {
        this.mediaStatus = mediaStatus;
    }

    public String getUrlSq() {
        return urlSq;
    }

    public void setUrlSq(String urlSq) {
        this.urlSq = urlSq;
    }

    public int getHeightSq() {
        return heightSq;
    }

    public void setHeightSq(int heightSq) {
        this.heightSq = heightSq;
    }

    public int getWidthSq() {
        return widthSq;
    }

    public void setWidthSq(int widthSq) {
        this.widthSq = widthSq;
    }

    public String getUrlT() {
        return urlT;
    }

    public void setUrlT(String urlT) {
        this.urlT = urlT;
    }

    public int getHeightT() {
        return heightT;
    }

    public void setHeightT(int heightT) {
        this.heightT = heightT;
    }

    public int getWidthT() {
        return widthT;
    }

    public void setWidthT(int widthT) {
        this.widthT = widthT;
    }

    public String getUrlS() {
        return urlS;
    }

    public void setUrlS(String urlS) {
        this.urlS = urlS;
    }

    public String getHeightS() {
        return heightS;
    }

    public void setHeightS(String heightS) {
        this.heightS = heightS;
    }

    public String getWidthS() {
        return widthS;
    }

    public void setWidthS(String widthS) {
        this.widthS = widthS;
    }

    public String getUrlQ() {
        return urlQ;
    }

    public void setUrlQ(String urlQ) {
        this.urlQ = urlQ;
    }

    public String getHeightQ() {
        return heightQ;
    }

    public void setHeightQ(String heightQ) {
        this.heightQ = heightQ;
    }

    public String getWidthQ() {
        return widthQ;
    }

    public void setWidthQ(String widthQ) {
        this.widthQ = widthQ;
    }

    public String getUrlM() {
        return urlM;
    }

    public void setUrlM(String urlM) {
        this.urlM = urlM;
    }

    public String getHeightM() {
        return heightM;
    }

    public void setHeightM(String heightM) {
        this.heightM = heightM;
    }

    public String getWidthM() {
        return widthM;
    }

    public void setWidthM(String widthM) {
        this.widthM = widthM;
    }

    public String getUrlN() {
        return urlN;
    }

    public void setUrlN(String urlN) {
        this.urlN = urlN;
    }

    public String getHeightN() {
        return heightN;
    }

    public void setHeightN(String heightN) {
        this.heightN = heightN;
    }

    public String getWidthN() {
        return widthN;
    }

    public void setWidthN(String widthN) {
        this.widthN = widthN;
    }

    public String getUrlZ() {
        return urlZ;
    }

    public void setUrlZ(String urlZ) {
        this.urlZ = urlZ;
    }

    public String getHeightZ() {
        return heightZ;
    }

    public void setHeightZ(String heightZ) {
        this.heightZ = heightZ;
    }

    public String getWidthZ() {
        return widthZ;
    }

    public void setWidthZ(String widthZ) {
        this.widthZ = widthZ;
    }

    public String getUrlC() {
        return urlC;
    }

    public void setUrlC(String urlC) {
        this.urlC = urlC;
    }

    public String getHeightC() {
        return heightC;
    }

    public void setHeightC(String heightC) {
        this.heightC = heightC;
    }

    public String getWidthC() {
        return widthC;
    }

    public void setWidthC(String widthC) {
        this.widthC = widthC;
    }

    public String getUrlL() {
        return urlL;
    }

    public void setUrlL(String urlL) {
        this.urlL = urlL;
    }

    public String getHeightL() {
        return heightL;
    }

    public void setHeightL(String heightL) {
        this.heightL = heightL;
    }

    public String getWidthL() {
        return widthL;
    }

    public void setWidthL(String widthL) {
        this.widthL = widthL;
    }

    public String getPathalias() {
        return pathalias;
    }

    public void setPathalias(String pathalias) {
        this.pathalias = pathalias;
    }

    public static class DescriptionBean {

        @SerializedName("_content")
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
