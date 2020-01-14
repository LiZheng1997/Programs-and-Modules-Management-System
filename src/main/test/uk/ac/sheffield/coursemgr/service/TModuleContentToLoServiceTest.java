package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessmentToLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContentToLo;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleContentToLoServiceTest {

    @Resource
    private TModuleContentToLoService tModuleContentToLoService;

    @Test
    public void TestInsert(){
        TModuleContentToLo tModuleContentToLo = new TModuleContentToLo();
        tModuleContentToLo.setId(21521421412341L);
        tModuleContentToLo.setModuleContentId(35214151L);
        tModuleContentToLo.setModuleLoId(15324354524L);
        tModuleContentToLo.setNumber(8);
        tModuleContentToLo.setCreateBy("Jack");
        tModuleContentToLo.setCreateTime(LocalDateTime.now());
        tModuleContentToLo.setUpdateTime(LocalDateTime.now());
        tModuleContentToLo.setUpdateBy("li");
        tModuleContentToLoService.insertModuleContentLo(tModuleContentToLo);
    }

    @Test
    public void TestDelete(){
        tModuleContentToLoService.deleteModuleContentLoById(21521421412341L);
    }

}
