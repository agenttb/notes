package com.agenttb.code.sql.model;

public class Teacher {
    private Integer tNo;

    private String tName;

    private Integer tAge;

    private String tSex;

    private String tDept;

    public Integer gettNo() {
        return tNo;
    }

    public void settNo(Integer tNo) {
        this.tNo = tNo;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public String gettSex() {
        return tSex;
    }

    public void settSex(String tSex) {
        this.tSex = tSex == null ? null : tSex.trim();
    }

    public String gettDept() {
        return tDept;
    }

    public void settDept(String tDept) {
        this.tDept = tDept == null ? null : tDept.trim();
    }
}