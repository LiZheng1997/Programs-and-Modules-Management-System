package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleLoServiceTest {

    @Resource
    private TModuleLoService tModuleLoService;

    @Test
    public void TestInsert(){
       TModuleLo tModuleLo = new TModuleLo();
        tModuleLo.setModuleLoId(254321325L);
        tModuleLo.setLoTitle("Familiar with using Java");
        tModuleLo.setContext("this is a test");
        tModuleLo.setModuleCode("Text Processing");
        tModuleLo.setCreateBy("Jack");
        tModuleLo.setCreateTime(LocalDateTime.now());
        tModuleLoService.insert(tModuleLo);
    }

    @Test
    public void Testselect(){
        tModuleLoService.selectByPrimaryKey(254321325L);
    }

    @Test
    public void TestUpdate(){
        TModuleLo tModuleLo = new TModuleLo();
        tModuleLo.setModuleLoId(254321325L);
        tModuleLo.setLoTitle("Familiar with using Java");
        tModuleLo.setContext("this is a test");
        tModuleLo.setModuleCode("Speech Processing");
        tModuleLo.setUpdateBy("Paul");
        tModuleLo.setUpdateTime(LocalDateTime.now());
        tModuleLoService.update(tModuleLo);

    }

    @Test
    public void TestDelete(){
        tModuleLoService.deleteByPrimaryKey(254321325L);
    }
}
