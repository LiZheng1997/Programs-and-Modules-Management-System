package uk.ac.sheffield.coursemgr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class TModule {
    private Long moduleId;

    private String moduleCode;

    private String programCode;

    private Long aimId;

    private Long contentId;

    private Long loId;

    private Long assessmentId;

    private String createBy;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private String objectives;

    private String moduleTitle;

    private List<TModule> ModuleList;

    private List<TModuleAim> moduleAims;

    private List<TModuleLo> moduleLos;

    private List<TModuleAssessment> moduleAssessments;

    private List<TModuleContent> moduleContents;




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

    public List<TModuleLo> getModuleLos() {
        return moduleLos;
    }

    public void setModuleLos(List<TModuleLo> moduleLos) {
        this.moduleLos = moduleLos;
    }

    public List<TModuleAim> getModuleAims() {
        return moduleAims;
    }

    public void setModuleAims(List<TModuleAim> moduleAims) {
        this.moduleAims = moduleAims;
    }

    public List<TModule> getModuleList() {
        return ModuleList;
    }

    public void setModuleList(List<TModule> moduleList) {
        ModuleList = moduleList;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public Long getModuleId() {
        return moduleId;
    }

    public void setModuleId(Long moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Long getAimId() {
        return aimId;
    }

    public void setAimId(Long aimId) {
        this.aimId = aimId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Long getLoId() {
        return loId;
    }

    public void setLoId(Long loId) {
        this.loId = loId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
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

    public String getObjectives() {
        return objectives;
    }

    public void setObjectives(String objectives) {
        this.objectives = objectives;
    }
}