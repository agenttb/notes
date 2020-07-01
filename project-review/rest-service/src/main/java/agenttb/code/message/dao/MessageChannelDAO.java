package agenttb.code.message.dao;

import java.util.List;

import agenttb.code.message.domain.MessageChannel;
import agenttb.code.message.domain.MessageChannelQuery;
import org.apache.ibatis.annotations.Param;

public interface MessageChannelDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    long countByExample(MessageChannelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int deleteByExample(MessageChannelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int insert(MessageChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int insertSelective(MessageChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    List<MessageChannel> selectByExample(MessageChannelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    MessageChannel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") MessageChannel record, @Param("example") MessageChannelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByExample(@Param("record") MessageChannel record, @Param("example") MessageChannelQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByPrimaryKeySelective(MessageChannel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message_channel
     *
     * @mbg.generated Fri Jul 26 12:38:07 CST 2019
     */
    int updateByPrimaryKey(MessageChannel record);
}