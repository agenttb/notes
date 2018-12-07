package com.agenttb.code.sql.model;

public class Course {
    private Integer cNo;

    private String cName;

    private Integer cTeacher;

    public Integer getcNo() {
        return cNo;
    }

    public void setcNo(Integer cNo) {
        this.cNo = cNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcTeacher() {
        return cTeacher;
    }

    public void setcTeacher(Integer cTeacher) {
        this.cTeacher = cTeacher;
    }
}