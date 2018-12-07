package com.agenttb.code.sql.model;

public class Department {
    private String deptName;

    private Integer deptHead;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(Integer deptHead) {
        this.deptHead = deptHead;
    }
}