package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkill;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramSkillServiceTest {

    @Resource
    private TProgramSkillService tProgramSkillService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TProgramSkill programSkill = new TProgramSkill();
        programSkill.setSkillId(4357348474547L);
        programSkill.setProgramId(54754747847L);
        programSkill.setProgramCode("ACS");
        programSkill.setContext("ACS Skill 1");
        programSkill.setCreateBy("Jack");
        programSkill.setCreateTime(date);
        tProgramSkillService.insert(programSkill);
    }

    @Test
    public void testSelect() {
        tProgramSkillService.selectByPrimaryKey(4357348474547L);
    }

    @Test
    public void testUpdate() {
        LocalDateTime date = LocalDateTime.now();
        TProgramSkill programSkill = new TProgramSkill();
        programSkill.setSkillId(4357348474547L);
        programSkill.setProgramId(5125421521421417L);
        programSkill.setProgramCode("IM");
        programSkill.setContext("IM Skill 1");
        programSkill.setUpdateBy("Paul");
        programSkill.setUpdateTime(date);
        tProgramSkillService.updateByPrimaryKey(programSkill);
    }

    @Test
    public void testDelete() {
        tProgramSkillService.deleteByPrimaryKey(4357348474547L);
    }

    @Test
    public void testCount() {
        TProgramSkill programSkill = new TProgramSkill();
        int a = tProgramSkillService.countProgramSkill(programSkill);
        System.out.println("The number of the table of the program skill is " +a);
    }



}
