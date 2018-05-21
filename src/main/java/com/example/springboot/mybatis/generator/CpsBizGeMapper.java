package com.example.springboot.mybatis.generator;

import com.example.springboot.mybatis.generator.CpsBizGe;
import com.example.springboot.mybatis.generator.CpsBizGeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CpsBizGeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    long countByExample(CpsBizGeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int deleteByExample(CpsBizGeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int insert(CpsBizGe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int insertSelective(CpsBizGe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    List<CpsBizGe> selectByExample(CpsBizGeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    CpsBizGe selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") CpsBizGe record, @Param("example") CpsBizGeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int updateByExample(@Param("record") CpsBizGe record, @Param("example") CpsBizGeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int updateByPrimaryKeySelective(CpsBizGe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cps_biz
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    int updateByPrimaryKey(CpsBizGe record);
}