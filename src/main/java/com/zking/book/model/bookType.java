package com.zking.book.model;

import java.io.Serializable;

public class bookType implements Serializable {
    private Integer tId;

    private String typeName;

    public bookType(Integer tId, String typeName) {
        this.tId = tId;
        this.typeName = typeName;
    }

    public bookType() {
        super();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "bookType{" +
                "tId=" + tId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}