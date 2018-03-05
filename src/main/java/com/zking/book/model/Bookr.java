package com.zking.book.model;

import java.io.Serializable;
import java.util.Date;

public class Bookr implements Serializable{
    private Integer bId;

    private String bBt;

    private String bZz;

    private Integer tId;

    private Float bJg;

    private String bCbs;

    private String bSjjj;

    private Date bScsj;

    private Integer bSjzt;

    private String bImg;

    private int bSjtop;

    public Bookr(Integer bId, String bBt, String bZz, Integer tId, Float bJg, String bCbs, String bSjjj, Date bScsj, Integer bSjzt, String bImg, int bSjtop) {
        this.bId = bId;
        this.bBt = bBt;
        this.bZz = bZz;
        this.tId = tId;
        this.bJg = bJg;
        this.bCbs = bCbs;
        this.bSjjj = bSjjj;
        this.bScsj = bScsj;
        this.bSjzt = bSjzt;
        this.bImg = bImg;
        this.bSjtop = bSjtop;
    }

    public int getbSjtop() {
        return bSjtop;
    }

    public void setbSjtop(int bSjtop) {
        this.bSjtop = bSjtop;
    }

    public Bookr() {
        super();
    }

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbBt() {
        return bBt;
    }

    public void setbBt(String bBt) {
        this.bBt = bBt;
    }

    public String getbZz() {
        return bZz;
    }

    public void setbZz(String bZz) {
        this.bZz = bZz;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Float getbJg() {
        return bJg;
    }

    public void setbJg(Float bJg) {
        this.bJg = bJg;
    }

    public String getbCbs() {
        return bCbs;
    }

    public void setbCbs(String bCbs) {
        this.bCbs = bCbs;
    }

    public String getbSjjj() {
        return bSjjj;
    }

    public void setbSjjj(String bSjjj) {
        this.bSjjj = bSjjj;
    }

    public Date getbScsj() {
        return bScsj;
    }

    public void setbScsj(Date bScsj) {
        this.bScsj = bScsj;
    }

    public Integer getbSjzt() {
        return bSjzt;
    }

    public void setbSjzt(Integer bSjzt) {
        this.bSjzt = bSjzt;
    }

    public String getbImg() {
        return bImg;
    }

    public void setbImg(String bImg) {
        this.bImg = bImg;
    }

    @Override
    public String toString() {
        return "Bookr{" +
                "bId=" + bId +
                ", bBt='" + bBt + '\'' +
                ", bZz='" + bZz + '\'' +
                ", tId=" + tId +
                ", bJg=" + bJg +
                ", bCbs='" + bCbs + '\'' +
                ", bSjjj='" + bSjjj + '\'' +
                ", bScsj=" + bScsj +
                ", bSjzt=" + bSjzt +
                ", bImg='" + bImg + '\'' +
                '}';
    }
}