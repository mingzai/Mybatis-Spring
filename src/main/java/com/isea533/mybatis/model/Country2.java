package com.isea533.mybatis.model;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="country")
public class Country2 {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.id
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    @Id
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countryname
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    private String countryname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countrycode
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    private String countrycode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.id
     *
     * @return the value of country.id
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.id
     *
     * @param id the value for country.id
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countryname
     *
     * @return the value of country.countryname
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countryname
     *
     * @param countryname the value for country.countryname
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countrycode
     *
     * @return the value of country.countrycode
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countrycode
     *
     * @param countrycode the value for country.countrycode
     *
     * @mbggenerated Mon Dec 08 11:25:39 CST 2014
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}