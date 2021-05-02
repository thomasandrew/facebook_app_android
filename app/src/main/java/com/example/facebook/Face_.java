package com.example.facebook;

public class Face_ {
    private String profName;
    private String hours;
    private String profTxt;
    private int postPic;
    private int liked;
    private int comments;
    private int profPic;

    public Face_(String profName, String hours, String profTxt, int postPic, int liked, int comments, int profPic) {
        this.profName = profName;
        this.hours = hours;
        this.profTxt = profTxt;
        this.postPic = postPic;
        this.liked = liked;
        this.comments = comments;
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
                ", comments=" + comments +
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

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getProfPic() {
        return profPic;
    }

    public void setProfPic(int profPic) {
        this.profPic = profPic;
    }
}
