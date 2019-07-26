package dao;

import domain.Message;
import domain.MessageQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    long countByExample(MessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int deleteByExample(MessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    List<Message> selectByExample(MessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    Message selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int updateByExample(@Param("record") Message record, @Param("example") MessageQuery example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Thu Jul 25 18:24:38 CST 2019
     */
    int updateByPrimaryKey(Message record);
}