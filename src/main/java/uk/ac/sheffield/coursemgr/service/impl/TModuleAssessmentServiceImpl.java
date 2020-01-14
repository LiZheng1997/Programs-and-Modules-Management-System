package uk.ac.sheffield.coursemgr.service.impl;


import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessment;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.mapper.TModuleAssessmentMapper;
import uk.ac.sheffield.coursemgr.service.TModuleAssessmentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TModuleAssessmentServiceImpl implements TModuleAssessmentService {

    @Resource
    private TModuleAssessmentMapper tModuleAssessmentMapper;

    @Override
    public int countByPrimaryKey(TModuleAssessment tModuleAssessment) {
        return tModuleAssessmentMapper.countByPrimaryKey(tModuleAssessment);
    }

    @Override
    public int insert(TModuleAssessment record) {
        return tModuleAssessmentMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Long assessmentId) {
        return tModuleAssessmentMapper.deleteByPrimaryKey(assessmentId);
    }

    @Override
    public int update(TModuleAssessment record) {
        return tModuleAssessmentMapper.update(record);
    }

    @Override
    public List<TModuleLo> selectAssessmentLos() {
        return tModuleAssessmentMapper.selectAssessmentLos();
    }

    @Override
    public TModuleAssessment selectByPrimaryKey(Long assessmentId) {
        return tModuleAssessmentMapper.selectByPrimaryKey(assessmentId);
    }

    @Override
    public List<TModuleAim> selectAssessmentAims() {
        return tModuleAssessmentMapper.selectAssessmentAims();
    }

    @Override
    public List<TModuleLo> selectLOs(Long assessmentId) {
        return tModuleAssessmentMapper.selectLOs(assessmentId);
    }

    @Override
    public List<TModuleAim> selectAims(Long assessmentId) {
        return tModuleAssessmentMapper.selectAims(assessmentId);
    }

    @Override
    public List<TModuleContent> selectContents(Long assessmentId) {
        return tModuleAssessmentMapper.selectContents(assessmentId);
    }
}
