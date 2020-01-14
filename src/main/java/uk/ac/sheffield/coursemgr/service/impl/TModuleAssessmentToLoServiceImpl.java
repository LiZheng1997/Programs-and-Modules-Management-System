package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessmentToLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.mapper.TModuleAssessmentToLoMapper;
import uk.ac.sheffield.coursemgr.service.TModuleAssessmentToLoService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TModuleAssessmentToLoServiceImpl implements TModuleAssessmentToLoService {

    @Resource
    private TModuleAssessmentToLoMapper tModuleAssessmentToLoMapper;

    @Override
    public int insertModuleAssessmentLo(TModuleAssessmentToLo tModuleAssessmentToLo) {
        return tModuleAssessmentToLoMapper.insertModuleAssessmentLo(tModuleAssessmentToLo);
    }

    @Override
    public int deleteModuleAssessmentLoById( Long LOId) {
        return tModuleAssessmentToLoMapper.deleteModuleAssessmentLoById(LOId);
    }

}
