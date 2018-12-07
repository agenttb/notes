package com.agenttb.code.sql.model;

import java.util.Date;

public class Student {
    private Integer sNo;

    private String sName;

    private Integer sAge;

    private String sSex;

    private Date sEnrollmentDate;

    private String sDept;

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    public Date getsEnrollmentDate() {
        return sEnrollmentDate;
    }

    public void setsEnrollmentDate(Date sEnrollmentDate) {
        this.sEnrollmentDate = sEnrollmentDate;
    }

    public String getsDept() {
        return sDept;
    }

    public void setsDept(String sDept) {
        this.sDept = sDept == null ? null : sDept.trim();
    }
}