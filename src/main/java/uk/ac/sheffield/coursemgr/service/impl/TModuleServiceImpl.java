package uk.ac.sheffield.coursemgr.service.impl;

import com.google.common.base.Preconditions;
import org.springframework.stereotype.Service;
import uk.ac.sheffield.coursemgr.domain.pojo.*;
import uk.ac.sheffield.coursemgr.mapper.TModuleMapper;
import uk.ac.sheffield.coursemgr.service.TModuleService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Zheng li
 *
 */
@Service
public class TModuleServiceImpl implements TModuleService {

    @Resource
    private TModuleMapper moduleMapper;

    //This is a insert function to
    @Override
    public int insert(TModule record) {
        Preconditions.checkNotNull(record);
        return moduleMapper.insert(record);
    }

    @Override
    public TModule selectByPrimaryKey(Long id) {
        Preconditions.checkNotNull(moduleMapper.selectByPrimaryKey(id));
        return moduleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteByPrimaryKey(Long moduleId){
        return moduleMapper.deleteByPrimaryKey(moduleId);
    }

    @Override
    public int update(TModule record){
        return moduleMapper.update(record);
    }

    @Override
    public List<TModule> selectAll() {
        return moduleMapper.selectAll();
    }

    @Override
    public List<Map<String, Object>> selectPartModule() {
        return moduleMapper.selectPartModule();
    }

    @Override
    public List<Map<String, Object>> selectPartModuleByAim(Long aimId) {
        return moduleMapper.selectPartModuleByAim(aimId);
    }

    @Override
    public List<Map<String, Object>> selectPartModuleByLo(Long loId) {
        return moduleMapper.selectPartModuleByLo(loId);
    }

    @Override
    public List<TModuleAim> selectAims(Long id) {
        return moduleMapper.selectAims(id);
    }

    @Override
    public int countByPrimaryKey(Long moduleId) {
        return moduleMapper.countByPrimaryKey(moduleId);
    }

    @Override
    public List<TModuleLo> selectLos(Long id) {
        return moduleMapper.selectLos(id);
    }

    @Override
    public List<TModuleAssessment> selectAssessments(Long id) {
        return moduleMapper.selectAssessments(id);
    }

    @Override
    public List<TModuleContent> selectContents(Long id) {
        return moduleMapper.selectContents(id);
    }
}
