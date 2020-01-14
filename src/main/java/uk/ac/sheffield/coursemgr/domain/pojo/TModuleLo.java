package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TModuleLo {
    private Long moduleLoId;

    private Long moduleId;

    private String loTitle;

    private String moduleCode;

    private String context;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private List<TModuleAssessment> moduleAssessments;

    private List<TModuleContent> moduleContents;

    private List<TProgramSkill> programSkills;

    private List<TProgramKnowledge> programKnowledge;



    public String getLoTitle() {
        return loTitle;
    }

    public void setLoTitle(String loTitle) {
        this.loTitle = loTitle;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public List<TProgramSkill> getProgramSkills() {
        return programSkills;
    }

    public void setProgramSkills(List<TProgramSkill> programSkills) {
        this.programSkills = programSkills;
    }

    public List<TProgramKnowledge> getProgramKnowledge() {
        return programKnowledge;
    }

    public void setProgramKnowledge(List<TProgramKnowledge> programKnowledge) {
        this.programKnowledge = programKnowledge;
    }

    public List<TModuleContent> getModuleContents() {
        return moduleContents;
    }

    public void setModuleContents(List<TModuleContent> moduleContents) {
        this.moduleContents = moduleContents;
    }

    public List<TModuleAssessment> getModuleAssessments() {
        return moduleAssessments;
    }

    public void setModuleAssessments(List<TModuleAssessment> moduleAssessments) {
        this.moduleAssessments = moduleAssessments;
    }

    public Long getModuleLoId() {
        return moduleLoId;
    }

    public void setModuleLoId(Long moduleLoId) {
        this.moduleLoId = moduleLoId;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
    

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}