package com.zking.book.model;

import java.io.Serializable;

public class bookUser implements Serializable {
    private Integer uId;

    private String uZh;

    private String uMm;

    private Integer uQx;

    public bookUser(Integer uId, String uZh, String uMm, Integer uQx) {
        this.uId = uId;
        this.uZh = uZh;
        this.uMm = uMm;
        this.uQx = uQx;
    }

    public bookUser() {
        super();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuZh() {
        return uZh;
    }

    public void setuZh(String uZh) {
        this.uZh = uZh;
    }

    public String getuMm() {
        return uMm;
    }

    public void setuMm(String uMm) {
        this.uMm = uMm;
    }

    public Integer getuQx() {
        return uQx;
    }

    public void setuQx(Integer uQx) {
        this.uQx = uQx;
    }

    @Override
    public String toString() {
        return "bookUser{" +
                "uId=" + uId +
                ", uZh='" + uZh + '\'' +
                ", uMm='" + uMm + '\'' +
                ", uQx=" + uQx +
                '}';
    }
}