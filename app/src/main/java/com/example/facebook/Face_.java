package com.example.facebook;

public class Face_ {
    private String profName;
    private String hours;
    private String profTxt;
    private int postPic;
    private int liked;
    private int coments;
    private int profPic;

    public Face_(String profName, String hours, String profTxt, int postPic, int liked, int coments, int profPic) {
        this.profName = profName;
        this.hours = hours;
        this.profTxt = profTxt;
        this.postPic = postPic;
        this.liked = liked;
        this.coments = coments;
        this.profPic = profPic;
    }

    @Override
    public String toString() {
        return "Face_{" +
                "profName='" + profName + '\'' +
                ", hours='" + hours + '\'' +
                ", profTxt='" + profTxt + '\'' +
                ", postPic=" + postPic +
                ", liked=" + liked +
                ", coments=" + coments +
                ", profPic=" + profPic +
                '}';
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getProfTxt() {
        return profTxt;
    }

    public void setProfTxt(String profTxt) {
        this.profTxt = profTxt;
    }

    public int getPostPic() {
        return postPic;
    }

    public void setPostPic(int postPic) {
        this.postPic = postPic;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public int getComents() {
        return coments;
    }

    public void setComents(int coments) {
        this.coments = coments;
    }

    public int getProfPic() {
        return profPic;
    }

    public void setProfPic(int profPic) {
        this.profPic = profPic;
    }
}
