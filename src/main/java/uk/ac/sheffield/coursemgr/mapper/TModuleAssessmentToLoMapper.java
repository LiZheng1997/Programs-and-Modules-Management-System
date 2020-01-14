package uk.ac.sheffield.coursemgr.mapper;

import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessmentToLo;

public interface TModuleAssessmentToLoMapper {

    //增加一个assessment和Lo之间的关系 通过Lo id
    //insert a relation between module assessment and lo
    int insertModuleAssessmentLo(TModuleAssessmentToLo tModuleAssessmentToLo);

    //删除一个assessment和Lo之间的关系 通过Lo id
    //delete a relation between module assessment and lo by lo Id
    int deleteModuleAssessmentLoById(Long assessmentId);



}