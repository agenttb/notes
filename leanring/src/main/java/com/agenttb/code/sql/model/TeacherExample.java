package com.agenttb.code.sql.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTNoIsNull() {
            addCriterion("t_no is null");
            return (Criteria) this;
        }

        public Criteria andTNoIsNotNull() {
            addCriterion("t_no is not null");
            return (Criteria) this;
        }

        public Criteria andTNoEqualTo(Integer value) {
            addCriterion("t_no =", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotEqualTo(Integer value) {
            addCriterion("t_no <>", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThan(Integer value) {
            addCriterion("t_no >", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_no >=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThan(Integer value) {
            addCriterion("t_no <", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThanOrEqualTo(Integer value) {
            addCriterion("t_no <=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoIn(List<Integer> values) {
            addCriterion("t_no in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotIn(List<Integer> values) {
            addCriterion("t_no not in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoBetween(Integer value1, Integer value2) {
            addCriterion("t_no between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotBetween(Integer value1, Integer value2) {
            addCriterion("t_no not between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andTAgeEqualTo(Integer value) {
            addCriterion("t_age =", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotEqualTo(Integer value) {
            addCriterion("t_age <>", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThan(Integer value) {
            addCriterion("t_age >", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_age >=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThan(Integer value) {
            addCriterion("t_age <", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThanOrEqualTo(Integer value) {
            addCriterion("t_age <=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeIn(List<Integer> values) {
            addCriterion("t_age in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotIn(List<Integer> values) {
            addCriterion("t_age not in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeBetween(Integer value1, Integer value2) {
            addCriterion("t_age between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_age not between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(String value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(String value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(String value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLike(String value) {
            addCriterion("t_sex like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotLike(String value) {
            addCriterion("t_sex not like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<String> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTDeptIsNull() {
            addCriterion("t_dept is null");
            return (Criteria) this;
        }

        public Criteria andTDeptIsNotNull() {
            addCriterion("t_dept is not null");
            return (Criteria) this;
        }

        public Criteria andTDeptEqualTo(String value) {
            addCriterion("t_dept =", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptNotEqualTo(String value) {
            addCriterion("t_dept <>", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptGreaterThan(String value) {
            addCriterion("t_dept >", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptGreaterThanOrEqualTo(String value) {
            addCriterion("t_dept >=", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptLessThan(String value) {
            addCriterion("t_dept <", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptLessThanOrEqualTo(String value) {
            addCriterion("t_dept <=", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptLike(String value) {
            addCriterion("t_dept like", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptNotLike(String value) {
            addCriterion("t_dept not like", value, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptIn(List<String> values) {
            addCriterion("t_dept in", values, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptNotIn(List<String> values) {
            addCriterion("t_dept not in", values, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptBetween(String value1, String value2) {
            addCriterion("t_dept between", value1, value2, "tDept");
            return (Criteria) this;
        }

        public Criteria andTDeptNotBetween(String value1, String value2) {
            addCriterion("t_dept not between", value1, value2, "tDept");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}