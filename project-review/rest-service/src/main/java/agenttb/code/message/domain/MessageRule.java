package agenttb.code.message.domain;

import java.util.Date;

public class MessageRule {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_rule.id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_rule.create_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_rule.modify_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_rule.rule_type
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Integer ruleType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_rule.rule_content
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private String ruleContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_rule.state
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Integer state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_rule.id
     *
     * @return the value of message_rule.id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_rule.id
     *
     * @param id the value for message_rule.id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_rule.create_time
     *
     * @return the value of message_rule.create_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_rule.create_time
     *
     * @param createTime the value for message_rule.create_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_rule.modify_time
     *
     * @return the value of message_rule.modify_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_rule.modify_time
     *
     * @param modifyTime the value for message_rule.modify_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_rule.rule_type
     *
     * @return the value of message_rule.rule_type
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Integer getRuleType() {
        return ruleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_rule.rule_type
     *
     * @param ruleType the value for message_rule.rule_type
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_rule.rule_content
     *
     * @return the value of message_rule.rule_content
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public String getRuleContent() {
        return ruleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_rule.rule_content
     *
     * @param ruleContent the value for message_rule.rule_content
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setRuleContent(String ruleContent) {
        this.ruleContent = ruleContent == null ? null : ruleContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_rule.state
     *
     * @return the value of message_rule.state
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_rule.state
     *
     * @param state the value for message_rule.state
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setState(Integer state) {
        this.state = state;
    }
}