package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramKnowledgeServiceTest {

    @Resource
    private TProgramKnowledgeService tProgramKnowledgeService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TProgramKnowledge programKnowledge = new TProgramKnowledge();
        programKnowledge.setKnowledgeId(1251243135216L);
        programKnowledge.setProgramId(1252142121L);
        programKnowledge.setKnowledgeContext("ACS Knowledge 1");
        programKnowledge.setProgramCode("ACS");
        programKnowledge.setCreateBy("Jack");
        programKnowledge.setCreateTime(date);
        tProgramKnowledgeService.insert(programKnowledge);
    }

    @Test
    public void testSelect() {
        tProgramKnowledgeService.selectByPrimaryKey(1251243135216L);
    }

    @Test
    public void testUpdate() {
        LocalDateTime date = LocalDateTime.now();
        TProgramKnowledge programKnowledge = new TProgramKnowledge();
        programKnowledge.setKnowledgeId(1251243135216L);
        programKnowledge.setProgramId(1125132411421425L);
        programKnowledge.setKnowledgeContext("IM Knowledge 1");
        programKnowledge.setProgramCode("IM");
        programKnowledge.setUpdateBy("Paul");
        programKnowledge.setUpdateTime(date);
        tProgramKnowledgeService.updateByPrimaryKey(programKnowledge);
    }

    @Test
    public void testDelete() {
        tProgramKnowledgeService.deleteByPrimaryKey(1251243135216L);
    }

    @Test
    public void testCount() {
        TProgramKnowledge programKnowledge = new TProgramKnowledge();
        int a = tProgramKnowledgeService.countProgramKnowledge(programKnowledge);
        System.out.println("The number of the table of the program knowledge is " +a);
    }



}
