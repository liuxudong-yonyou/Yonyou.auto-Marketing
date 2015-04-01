package yonyou.marketing.api.user.entity;

import java.util.ArrayList;
import java.util.List;

public class SysMenuBtnDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenuBtnDtoExample() {
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

        public Criteria andMenuidIsNull() {
            addCriterion("menuid is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuid =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuid <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuid >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuid >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuid <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuid <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuid in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuid not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuid between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuid not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andBtnnameIsNull() {
            addCriterion("btnName is null");
            return (Criteria) this;
        }

        public Criteria andBtnnameIsNotNull() {
            addCriterion("btnName is not null");
            return (Criteria) this;
        }

        public Criteria andBtnnameEqualTo(String value) {
            addCriterion("btnName =", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameNotEqualTo(String value) {
            addCriterion("btnName <>", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameGreaterThan(String value) {
            addCriterion("btnName >", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameGreaterThanOrEqualTo(String value) {
            addCriterion("btnName >=", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameLessThan(String value) {
            addCriterion("btnName <", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameLessThanOrEqualTo(String value) {
            addCriterion("btnName <=", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameLike(String value) {
            addCriterion("btnName like", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameNotLike(String value) {
            addCriterion("btnName not like", value, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameIn(List<String> values) {
            addCriterion("btnName in", values, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameNotIn(List<String> values) {
            addCriterion("btnName not in", values, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameBetween(String value1, String value2) {
            addCriterion("btnName between", value1, value2, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtnnameNotBetween(String value1, String value2) {
            addCriterion("btnName not between", value1, value2, "btnname");
            return (Criteria) this;
        }

        public Criteria andBtntypeIsNull() {
            addCriterion("btnType is null");
            return (Criteria) this;
        }

        public Criteria andBtntypeIsNotNull() {
            addCriterion("btnType is not null");
            return (Criteria) this;
        }

        public Criteria andBtntypeEqualTo(String value) {
            addCriterion("btnType =", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeNotEqualTo(String value) {
            addCriterion("btnType <>", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeGreaterThan(String value) {
            addCriterion("btnType >", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeGreaterThanOrEqualTo(String value) {
            addCriterion("btnType >=", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeLessThan(String value) {
            addCriterion("btnType <", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeLessThanOrEqualTo(String value) {
            addCriterion("btnType <=", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeLike(String value) {
            addCriterion("btnType like", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeNotLike(String value) {
            addCriterion("btnType not like", value, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeIn(List<String> values) {
            addCriterion("btnType in", values, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeNotIn(List<String> values) {
            addCriterion("btnType not in", values, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeBetween(String value1, String value2) {
            addCriterion("btnType between", value1, value2, "btntype");
            return (Criteria) this;
        }

        public Criteria andBtntypeNotBetween(String value1, String value2) {
            addCriterion("btnType not between", value1, value2, "btntype");
            return (Criteria) this;
        }

        public Criteria andActionurlsIsNull() {
            addCriterion("actionUrls is null");
            return (Criteria) this;
        }

        public Criteria andActionurlsIsNotNull() {
            addCriterion("actionUrls is not null");
            return (Criteria) this;
        }

        public Criteria andActionurlsEqualTo(String value) {
            addCriterion("actionUrls =", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsNotEqualTo(String value) {
            addCriterion("actionUrls <>", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsGreaterThan(String value) {
            addCriterion("actionUrls >", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsGreaterThanOrEqualTo(String value) {
            addCriterion("actionUrls >=", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsLessThan(String value) {
            addCriterion("actionUrls <", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsLessThanOrEqualTo(String value) {
            addCriterion("actionUrls <=", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsLike(String value) {
            addCriterion("actionUrls like", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsNotLike(String value) {
            addCriterion("actionUrls not like", value, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsIn(List<String> values) {
            addCriterion("actionUrls in", values, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsNotIn(List<String> values) {
            addCriterion("actionUrls not in", values, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsBetween(String value1, String value2) {
            addCriterion("actionUrls between", value1, value2, "actionurls");
            return (Criteria) this;
        }

        public Criteria andActionurlsNotBetween(String value1, String value2) {
            addCriterion("actionUrls not between", value1, value2, "actionurls");
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