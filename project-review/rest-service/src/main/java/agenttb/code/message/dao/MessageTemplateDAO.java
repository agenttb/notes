package agenttb.code.message.dao;

import agenttb.code.message.domain.MessageTemplate;
import agenttb.code.message.domain.MessageTemplateQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageTemplateDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    long countByExample(MessageTemplateQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int deleteByExample(MessageTemplateQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int insert(MessageTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int insertSelective(MessageTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    List<MessageTemplate> selectByExample(MessageTemplateQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    MessageTemplate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") MessageTemplate record, @Param("example") MessageTemplateQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByExample(@Param("record") MessageTemplate record, @Param("example") MessageTemplateQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByPrimaryKeySelective(MessageTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_template
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByPrimaryKey(MessageTemplate record);
}