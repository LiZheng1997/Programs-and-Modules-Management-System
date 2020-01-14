package uk.ac.sheffield.coursemgr.domain.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class TProgram {
    private Long programId;

    private String programCode;

    private String programTitle;

    private Long programAimId;

    private Long programLoId;

    private Long coreModuleId;

    private Long optionalModuleId;

    private String updateBy;

    private LocalDateTime updateTime;

    private String createBy;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp createTime;

    private List<TProgramAim> tProgramAimList;

    private List<TProgramSkill> tProgramSkillList;

    private List<TProgramKnowledge> tProgramKnowledgeList;

    private List<TModule> tModuleList;



    public List<TModule> gettModuleList() {
        return tModuleList;
    }

    public void settModuleList(List<TModule> tModuleList) {
        this.tModuleList = tModuleList;
    }

    public List<TProgramAim> gettProgramAimList() {
        return tProgramAimList;
    }

    public void settProgramAimList(List<TProgramAim> tProgramAimList) {
        this.tProgramAimList = tProgramAimList;
    }

    public List<TProgramSkill> gettProgramSkillList() {
        return tProgramSkillList;
    }

    public void settProgramSkillList(List<TProgramSkill> tProgramSkillList) {
        this.tProgramSkillList = tProgramSkillList;
    }

    public List<TProgramKnowledge> gettProgramKnowledgeList() {
        return tProgramKnowledgeList;
    }

    public void settProgramKnowledgeList(List<TProgramKnowledge> tProgramKnowledgeList) {
        this.tProgramKnowledgeList = tProgramKnowledgeList;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramTitle() {
        return programTitle;
    }

    public void setProgramTitle(String programTitle) {
        this.programTitle = programTitle;
    }

    public Long getProgramAimId() {
        return programAimId;
    }

    public void setProgramAimId(Long programAimId) {
        this.programAimId = programAimId;
    }

    public Long getProgramLoId() {
        return programLoId;
    }

    public void setProgramLoId(Long programLoId) {
        this.programLoId = programLoId;
    }

    public Long getCoreModuleId() {
        return coreModuleId;
    }

    public void setCoreModuleId(Long coreModuleId) {
        this.coreModuleId = coreModuleId;
    }

    public Long getOptionalModuleId() {
        return optionalModuleId;
    }

    public void setOptionalModuleId(Long optionalModuleId) {
        this.optionalModuleId = optionalModuleId;
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
}
