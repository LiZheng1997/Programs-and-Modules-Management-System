package uk.ac.sheffield.coursemgr.service.impl;

import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessment;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.mapper.TModuleContentMapper;
import uk.ac.sheffield.coursemgr.service.TModuleContentService;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TModuleContentServiceImpl implements TModuleContentService {

    @Resource
    private TModuleContentMapper tModuleContentMapper;

    @Override
    public int countByExample(TModuleContent tModuleContent) {
        return tModuleContentMapper.countByExample(tModuleContent);
    }

    @Override
    public int insert(TModuleContent record) {
        return tModuleContentMapper.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Long contentId) {
        return tModuleContentMapper.deleteByPrimaryKey(contentId);
    }

    @Override
    public int update(TModuleContent record) {
        return tModuleContentMapper.update(record);
    }

    @Override
    public Long selectConnectContentById(Long contentId) {
        return tModuleContentMapper.selectConnectContentById(contentId);
    }

    @Override
    public TModuleContent selectByPrimaryKey(Long contentId) {
        return tModuleContentMapper.selectByPrimaryKey(contentId);
    }

    @Override
    public List<TModuleContent> selectAll(Long contentId) {
        return tModuleContentMapper.selectAll(contentId);
    }

    @Override
    public Long selectContentPrerequisite(Long contentId) {
        return tModuleContentMapper.selectContentPrerequisite(contentId);
    }

    @Override
    public List<TModuleLo> selectLos(Long contentId) {
        return tModuleContentMapper.selectLos(contentId);
    }

    @Override
    public List<TModuleAssessment> selectAssessments(Long contentId) {
        return tModuleContentMapper.selectAssessments(contentId);
    }

    @Override
    public List<TModuleLo> selectContentLos() {
        return tModuleContentMapper.selectContentLos();
    }
}
