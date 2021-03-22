package com.mkyong.dto;

public class HelperDTO {

    private String lable;
    private String value;

    public HelperDTO() {
    }

    public HelperDTO(String lable, String value) {
        this.lable = lable;
        this.value = value;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HelperDTO{" +
                "lable='" + lable + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
