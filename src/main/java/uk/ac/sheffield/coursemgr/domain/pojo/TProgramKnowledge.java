package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TProgramKnowledge {
    private Long knowledgeId;

    private Long programId;

    private String programCode;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private String knowledgeContext;

    private List<TProgramKnowledgeToModuleLo> ProgramKnowledgeToModuleLos;

    private List<TModuleLo> moduleLos;



    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public List<TModuleLo> getModuleLos() {
        return moduleLos;
    }

    public void setModuleLos(List<TModuleLo> moduleLos) {
        this.moduleLos=moduleLos;
    }

    public List<TProgramKnowledgeToModuleLo> getProgramKnowledgeToModuleLos() {
        return ProgramKnowledgeToModuleLos;
    }

    public void setProgramKnowledgeToModuleLos(List<TProgramKnowledgeToModuleLo> programKnowledgeToModuleLos) {
        ProgramKnowledgeToModuleLos = programKnowledgeToModuleLos;
    }

    public Long getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
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

    public String getKnowledgeContext() {
        return knowledgeContext;
    }

    public void setKnowledgeContext(String knowledgeContext) {
        this.knowledgeContext = knowledgeContext;
    }
}
