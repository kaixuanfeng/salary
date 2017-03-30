package com.fh.entity.biz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaHourlyQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public AreaHourlyQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeIsNull() {
            addCriterion("duty_code is null");
            return (Criteria) this;
        }

        public Criteria andDutyCodeIsNotNull() {
            addCriterion("duty_code is not null");
            return (Criteria) this;
        }

        public Criteria andDutyCodeEqualTo(String value) {
            addCriterion("duty_code =", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeNotEqualTo(String value) {
            addCriterion("duty_code <>", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeGreaterThan(String value) {
            addCriterion("duty_code >", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("duty_code >=", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeLessThan(String value) {
            addCriterion("duty_code <", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeLessThanOrEqualTo(String value) {
            addCriterion("duty_code <=", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeLike(String value) {
            addCriterion("duty_code like", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeNotLike(String value) {
            addCriterion("duty_code not like", value, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeIn(List<String> values) {
            addCriterion("duty_code in", values, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeNotIn(List<String> values) {
            addCriterion("duty_code not in", values, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeBetween(String value1, String value2) {
            addCriterion("duty_code between", value1, value2, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andDutyCodeNotBetween(String value1, String value2) {
            addCriterion("duty_code not between", value1, value2, "dutyCode");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyIsNull() {
            addCriterion("normal_hourly is null");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyIsNotNull() {
            addCriterion("normal_hourly is not null");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyEqualTo(BigDecimal value) {
            addCriterion("normal_hourly =", value, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyNotEqualTo(BigDecimal value) {
            addCriterion("normal_hourly <>", value, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyGreaterThan(BigDecimal value) {
            addCriterion("normal_hourly >", value, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("normal_hourly >=", value, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyLessThan(BigDecimal value) {
            addCriterion("normal_hourly <", value, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("normal_hourly <=", value, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyIn(List<BigDecimal> values) {
            addCriterion("normal_hourly in", values, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyNotIn(List<BigDecimal> values) {
            addCriterion("normal_hourly not in", values, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("normal_hourly between", value1, value2, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andNormalHourlyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("normal_hourly not between", value1, value2, "normalHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyIsNull() {
            addCriterion("ot_hourly is null");
            return (Criteria) this;
        }

        public Criteria andOtHourlyIsNotNull() {
            addCriterion("ot_hourly is not null");
            return (Criteria) this;
        }

        public Criteria andOtHourlyEqualTo(BigDecimal value) {
            addCriterion("ot_hourly =", value, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyNotEqualTo(BigDecimal value) {
            addCriterion("ot_hourly <>", value, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyGreaterThan(BigDecimal value) {
            addCriterion("ot_hourly >", value, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ot_hourly >=", value, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyLessThan(BigDecimal value) {
            addCriterion("ot_hourly <", value, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ot_hourly <=", value, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyIn(List<BigDecimal> values) {
            addCriterion("ot_hourly in", values, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyNotIn(List<BigDecimal> values) {
            addCriterion("ot_hourly not in", values, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ot_hourly between", value1, value2, "otHourly");
            return (Criteria) this;
        }

        public Criteria andOtHourlyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ot_hourly not between", value1, value2, "otHourly");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIsNull() {
            addCriterion("sys_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIsNotNull() {
            addCriterion("sys_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeEqualTo(Date value) {
            addCriterion("sys_create_time =", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotEqualTo(Date value) {
            addCriterion("sys_create_time <>", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeGreaterThan(Date value) {
            addCriterion("sys_create_time >", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_create_time >=", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeLessThan(Date value) {
            addCriterion("sys_create_time <", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_create_time <=", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIn(List<Date> values) {
            addCriterion("sys_create_time in", values, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotIn(List<Date> values) {
            addCriterion("sys_create_time not in", values, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeBetween(Date value1, Date value2) {
            addCriterion("sys_create_time between", value1, value2, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_create_time not between", value1, value2, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIsNull() {
            addCriterion("sys_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIsNotNull() {
            addCriterion("sys_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeEqualTo(Date value) {
            addCriterion("sys_update_time =", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotEqualTo(Date value) {
            addCriterion("sys_update_time <>", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeGreaterThan(Date value) {
            addCriterion("sys_update_time >", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_update_time >=", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeLessThan(Date value) {
            addCriterion("sys_update_time <", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("sys_update_time <=", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIn(List<Date> values) {
            addCriterion("sys_update_time in", values, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotIn(List<Date> values) {
            addCriterion("sys_update_time not in", values, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("sys_update_time between", value1, value2, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("sys_update_time not between", value1, value2, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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