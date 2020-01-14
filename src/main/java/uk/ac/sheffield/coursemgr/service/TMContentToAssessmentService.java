package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.TMContentToAssessment;


public interface TMContentToAssessmentService {

    //同过主键的方式统计所有的记录数量
    //count all records by PK
    int countById(Long id);

    //增加一条content关系
    //insert a record relation into the table
    int insert(TMContentToAssessment record);

    //删除一条content关系通过主键的方式
    //delete a record by content id and assessment id
    int deleteByPrimaryKey(Long id);


}
