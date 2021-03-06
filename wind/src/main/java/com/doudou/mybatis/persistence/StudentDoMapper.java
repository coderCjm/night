package com.doudou.mybatis.persistence;

import com.doudou.mybatis.bean.StudentDo;
import com.doudou.mybatis.bean.StudentDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int countByExample(StudentDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int deleteByExample(StudentDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int insert(StudentDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int insertSelective(StudentDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    List<StudentDo> selectByExample(StudentDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    StudentDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") StudentDo record, @Param("example") StudentDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") StudentDo record, @Param("example") StudentDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StudentDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StudentDo record);
}