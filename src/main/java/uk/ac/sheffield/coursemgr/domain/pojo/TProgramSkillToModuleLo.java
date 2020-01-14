package uk.ac.sheffield.coursemgr.domain.pojo;

import java.time.LocalDateTime;

public class TProgramSkillToModuleLo {

    private Long id;

    private Long skillId;

    private Long loId;

    private int number;

    private String createBy;

    private LocalDateTime createTime;

    private String updateBy;

    private LocalDateTime updateTime;

    private TProgramSkill ProgramSkill;

    private TModuleLo ModuleLo;

    public TProgramSkill getProgramSkill() {
        return ProgramSkill;
    }

    public void setProgramSkill(TProgramSkill programSkill) {
        ProgramSkill = programSkill;
    }

    public TModuleLo getModuleLo() {
        return ModuleLo;
    }

    public void setModuleLo(TModuleLo moduleLo) {
        ModuleLo = moduleLo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public Long getLoId() {
        return loId;
    }

    public void setLoId(Long loId) {
        this.loId = loId;
    }
}
