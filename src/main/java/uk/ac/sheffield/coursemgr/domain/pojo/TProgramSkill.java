package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class TProgramSkill {
    private Long skillId;

    private Long programId;

    private String programCode;

    private String context;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private List<TProgramSkillToModuleLo> ProgramSkillToModuleLos;

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

    public List<TProgramSkillToModuleLo> getProgramSkillToModuleLos() {
        return ProgramSkillToModuleLos;
    }

    public void setProgramSkillToModuleLos(List<TProgramSkillToModuleLo> programSkillToModuleLos) {
        ProgramSkillToModuleLos = programSkillToModuleLos;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
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
