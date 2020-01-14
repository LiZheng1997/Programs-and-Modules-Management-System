package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessmentToLo;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleAssessmentToLoServiceTest {

    @Resource
    private TModuleAssessmentToLoService tModuleAssessmentToLoService;

    @Test
    public void TestInsert(){
        TModuleAssessmentToLo tModuleAssessmentToLo = new TModuleAssessmentToLo();
        tModuleAssessmentToLo.setId(13514323432532L);
        tModuleAssessmentToLo.setModuleAssessmentId(435234352423L);
        tModuleAssessmentToLo.setModuleLoId(36342325243252L);
        tModuleAssessmentToLo.setNumber(8);
        tModuleAssessmentToLo.setCreateBy("Jack");
        tModuleAssessmentToLo.setCreateTime(LocalDateTime.now());
        tModuleAssessmentToLo.setUpdateTime(LocalDateTime.now());
        tModuleAssessmentToLo.setUpdateBy("li");
        tModuleAssessmentToLoService.insertModuleAssessmentLo(tModuleAssessmentToLo);
    }

    @Test
    public void TestDelete(){
        tModuleAssessmentToLoService.deleteModuleAssessmentLoById(13514323432532L);
    }

}
