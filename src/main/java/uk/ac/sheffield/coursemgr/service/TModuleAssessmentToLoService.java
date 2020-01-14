package uk.ac.sheffield.coursemgr.service;

import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessmentToLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;

import java.util.List;

public interface TModuleAssessmentToLoService {

    //删除一个assessment和Lo之间的关系 通过Lo id
    //delete a relation between module assessment and lo by lo Id
    int deleteModuleAssessmentLoById(Long assessmentId);

    //增加一个assessment和Lo之间的关系 通过Lo id
    //insert a relation between module assessment and lo
    int insertModuleAssessmentLo(TModuleAssessmentToLo tModuleAssessmentToLo);

}
