package com.agenttb.code.sql.model;

public class Grade {
    private Integer sNo;

    private String cName;

    private Integer cGrade;

    public Integer getsNo() {
        return sNo;
    }

    public void setsNo(Integer sNo) {
        this.sNo = sNo;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getcGrade() {
        return cGrade;
    }

    public void setcGrade(Integer cGrade) {
        this.cGrade = cGrade;
    }
}