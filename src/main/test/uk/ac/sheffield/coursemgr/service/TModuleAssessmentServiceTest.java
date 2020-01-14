package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessment;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleAssessmentServiceTest {

    @Resource
    private TModuleAssessmentService tModuleAssessmentService;

    @Test
    public void TestInsert(){
        TModuleAssessment tModuleAssessment = new TModuleAssessment();
        tModuleAssessment.setAssessmentId(23532436535443L);
        tModuleAssessment.setModuleCode("COM6115");
        tModuleAssessment.setAssessmentType("Paper exam");
        tModuleAssessment.setCreateBy("Jack");
        tModuleAssessment.setCreateTime(LocalDateTime.now());
        tModuleAssessment.setSubmitTime(LocalDateTime.now());
        tModuleAssessment.setPercentage(66);
        tModuleAssessment.setIssuedTime(LocalDateTime.now());
        tModuleAssessmentService.insert(tModuleAssessment);
    }

    @Test
    public void TestSelect(){
        tModuleAssessmentService.selectByPrimaryKey(23532436535443L);
    }

    @Test
    public void TestUpdate(){
        TModuleAssessment tModuleAssessment = new TModuleAssessment();
        tModuleAssessment.setAssessmentId(23532436535443L);
        tModuleAssessment.setModuleCode("COM6502");
        tModuleAssessment.setAssessmentType("Paper exam");
        tModuleAssessment.setUpdateBy("Paul");
        tModuleAssessment.setUpdateTime(LocalDateTime.now());
        tModuleAssessment.setSubmitTime(LocalDateTime.now());
        tModuleAssessment.setPercentage(86);
        tModuleAssessment.setIssuedTime(LocalDateTime.now());
        tModuleAssessmentService.update(tModuleAssessment);
    }

    @Test
    public void TestDelete(){
        tModuleAssessmentService.deleteByPrimaryKey(23532436535443L);
    }
}
