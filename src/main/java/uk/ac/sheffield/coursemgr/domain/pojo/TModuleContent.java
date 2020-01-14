package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TModuleContent {
    private Long contentId;

    private Long moduleId;

    private String moduleCode;

    private Long contentPrerequisite;

    private String context;

    private Long connectContentId;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private List<TModuleLo> moduleLos;

    private List<TModuleAssessment> assessments;


    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public List<TModuleAssessment> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<TModuleAssessment> assessments) {
        this.assessments = assessments;
    }

    public List<TModuleLo> getModuleLos() {
        return moduleLos;
    }

    public void setModuleLos(List<TModuleLo> moduleLos) {
        this.moduleLos = moduleLos;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Long getContentPrerequisite() {
        return contentPrerequisite;
    }

    public void setContentPrerequisite(Long contentPrerequisite) {
        this.contentPrerequisite = contentPrerequisite;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Long getConnectContentId() {
        return connectContentId;
    }

    public void setConnectContentId(Long connectContentId) {
        this.connectContentId = connectContentId;
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