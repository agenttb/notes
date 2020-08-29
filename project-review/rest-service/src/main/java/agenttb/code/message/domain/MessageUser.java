package agenttb.code.message.domain;

import java.util.Date;

public class MessageUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.user_name
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.user_id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.user_department
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private String userDepartment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.create_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.modify_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Date modifyTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_user.user_state
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    private Integer userState;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.id
     *
     * @return the value of message_user.id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.id
     *
     * @param id the value for message_user.id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.user_name
     *
     * @return the value of message_user.user_name
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.user_name
     *
     * @param userName the value for message_user.user_name
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.user_id
     *
     * @return the value of message_user.user_id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.user_id
     *
     * @param userId the value for message_user.user_id
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.user_department
     *
     * @return the value of message_user.user_department
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public String getUserDepartment() {
        return userDepartment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.user_department
     *
     * @param userDepartment the value for message_user.user_department
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment == null ? null : userDepartment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.create_time
     *
     * @return the value of message_user.create_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.create_time
     *
     * @param createTime the value for message_user.create_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.modify_time
     *
     * @return the value of message_user.modify_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.modify_time
     *
     * @param modifyTime the value for message_user.modify_time
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_user.user_state
     *
     * @return the value of message_user.user_state
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public Integer getUserState() {
        return userState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_user.user_state
     *
     * @param userState the value for message_user.user_state
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    public void setUserState(Integer userState) {
        this.userState = userState;
    }
}