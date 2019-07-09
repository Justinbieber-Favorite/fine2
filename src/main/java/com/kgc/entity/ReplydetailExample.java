package com.kgc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReplydetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplydetailExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInvidIsNull() {
            addCriterion("invid is null");
            return (Criteria) this;
        }

        public Criteria andInvidIsNotNull() {
            addCriterion("invid is not null");
            return (Criteria) this;
        }

        public Criteria andInvidEqualTo(Integer value) {
            addCriterion("invid =", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotEqualTo(Integer value) {
            addCriterion("invid <>", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidGreaterThan(Integer value) {
            addCriterion("invid >", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidGreaterThanOrEqualTo(Integer value) {
            addCriterion("invid >=", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLessThan(Integer value) {
            addCriterion("invid <", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidLessThanOrEqualTo(Integer value) {
            addCriterion("invid <=", value, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidIn(List<Integer> values) {
            addCriterion("invid in", values, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotIn(List<Integer> values) {
            addCriterion("invid not in", values, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidBetween(Integer value1, Integer value2) {
            addCriterion("invid between", value1, value2, "invid");
            return (Criteria) this;
        }

        public Criteria andInvidNotBetween(Integer value1, Integer value2) {
            addCriterion("invid not between", value1, value2, "invid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andReplyauthorIsNull() {
            addCriterion("replyauthor is null");
            return (Criteria) this;
        }

        public Criteria andReplyauthorIsNotNull() {
            addCriterion("replyauthor is not null");
            return (Criteria) this;
        }

        public Criteria andReplyauthorEqualTo(String value) {
            addCriterion("replyauthor =", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorNotEqualTo(String value) {
            addCriterion("replyauthor <>", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorGreaterThan(String value) {
            addCriterion("replyauthor >", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorGreaterThanOrEqualTo(String value) {
            addCriterion("replyauthor >=", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorLessThan(String value) {
            addCriterion("replyauthor <", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorLessThanOrEqualTo(String value) {
            addCriterion("replyauthor <=", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorLike(String value) {
            addCriterion("replyauthor like", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorNotLike(String value) {
            addCriterion("replyauthor not like", value, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorIn(List<String> values) {
            addCriterion("replyauthor in", values, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorNotIn(List<String> values) {
            addCriterion("replyauthor not in", values, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorBetween(String value1, String value2) {
            addCriterion("replyauthor between", value1, value2, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andReplyauthorNotBetween(String value1, String value2) {
            addCriterion("replyauthor not between", value1, value2, "replyauthor");
            return (Criteria) this;
        }

        public Criteria andRecreatdateIsNull() {
            addCriterion("recreatdate is null");
            return (Criteria) this;
        }

        public Criteria andRecreatdateIsNotNull() {
            addCriterion("recreatdate is not null");
            return (Criteria) this;
        }

        public Criteria andRecreatdateEqualTo(Date value) {
            addCriterionForJDBCDate("recreatdate =", value, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("recreatdate <>", value, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateGreaterThan(Date value) {
            addCriterionForJDBCDate("recreatdate >", value, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recreatdate >=", value, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateLessThan(Date value) {
            addCriterionForJDBCDate("recreatdate <", value, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recreatdate <=", value, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateIn(List<Date> values) {
            addCriterionForJDBCDate("recreatdate in", values, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("recreatdate not in", values, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recreatdate between", value1, value2, "recreatdate");
            return (Criteria) this;
        }

        public Criteria andRecreatdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recreatdate not between", value1, value2, "recreatdate");
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