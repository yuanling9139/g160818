package com.zking.book.model;

public class bookShopping {
    private Integer sId;

    private Integer bId;

    private Integer sCout;

    private Float sNum;

    private Integer uId;

    public bookShopping(Integer sId, Integer bId, Integer sCout, Float sNum, Integer uId) {
        this.sId = sId;
        this.bId = bId;
        this.sCout = sCout;
        this.sNum = sNum;
        this.uId = uId;
    }

    public bookShopping() {
        super();
    }

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public Integer getsCout() {
        return sCout;
    }

    public void setsCout(Integer sCout) {
        this.sCout = sCout;
    }

    public Float getsNum() {
        return sNum;
    }

    public void setsNum(Float sNum) {
        this.sNum = sNum;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "bookShopping{" +
                "sId=" + sId +
                ", bId=" + bId +
                ", sCout=" + sCout +
                ", sNum=" + sNum +
                ", uId=" + uId +
                '}';
    }
}