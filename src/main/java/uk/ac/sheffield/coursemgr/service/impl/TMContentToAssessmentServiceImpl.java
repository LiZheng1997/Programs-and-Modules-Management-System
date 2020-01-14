package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TMContentToAssessment;
import uk.ac.sheffield.coursemgr.mapper.TMContentToAssessmentMapper;
import uk.ac.sheffield.coursemgr.service.TMContentToAssessmentService;

import javax.annotation.Resource;

@Service
public class TMContentToAssessmentServiceImpl implements TMContentToAssessmentService {
    @Resource
    private TMContentToAssessmentMapper tmContentToAssessmentMapper;

    @Override
    public int countById(Long id) {
        return tmContentToAssessmentMapper.countById(id);
    }

    @Override
    public int insert(TMContentToAssessment record) {
        return tmContentToAssessmentMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey( Long assessmentId) {
        return tmContentToAssessmentMapper.deleteByPrimaryKey( assessmentId);
    }
}
