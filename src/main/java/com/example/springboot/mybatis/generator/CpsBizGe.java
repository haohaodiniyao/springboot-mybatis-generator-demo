package com.example.springboot.mybatis.generator;

import java.util.Date;

public class CpsBizGe {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cps_biz.id
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cps_biz.biz_content
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    private String bizContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cps_biz.create_time
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cps_biz.opt_date
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    private Date optDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cps_biz.id
     *
     * @return the value of cps_biz.id
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cps_biz.id
     *
     * @param id the value for cps_biz.id
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cps_biz.biz_content
     *
     * @return the value of cps_biz.biz_content
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public String getBizContent() {
        return bizContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cps_biz.biz_content
     *
     * @param bizContent the value for cps_biz.biz_content
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cps_biz.create_time
     *
     * @return the value of cps_biz.create_time
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cps_biz.create_time
     *
     * @param createTime the value for cps_biz.create_time
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cps_biz.opt_date
     *
     * @return the value of cps_biz.opt_date
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public Date getOptDate() {
        return optDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cps_biz.opt_date
     *
     * @param optDate the value for cps_biz.opt_date
     *
     * @mbg.generated Mon May 21 16:27:50 CST 2018
     */
    public void setOptDate(Date optDate) {
        this.optDate = optDate;
    }
}