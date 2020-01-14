package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleAimServiceTest {

    @Resource
    private TModuleAimService tModuleAimService;

    @Test
    public void TestInsert(){
        TModuleAim tModuleAim = new TModuleAim();
        tModuleAim.setAimId(3421341241L);
        tModuleAim.setModuleId(1421353242L);
        tModuleAim.setModuleAssessmentId(124213141243L);
        tModuleAim.setModuleTitle("Text Processing");
        tModuleAim.setAimDescription("Text Processing Aim 1");
        tModuleAim.setCreateBy("Jack");
        tModuleAim.setCreateTime(LocalDateTime.now());
        tModuleAimService.insert(tModuleAim);
    }

    @Test
    public void TestSelect(){
        tModuleAimService.selectByPrimaryKey(3421341241L);
    }

    @Test
    public void TestUpdate(){
        TModuleAim tModuleAim = new TModuleAim();
        tModuleAim.setAimId(3421341241L);
        tModuleAim.setModuleId(11253243L);
        tModuleAim.setModuleAssessmentId(23543243242L);
        tModuleAim.setModuleTitle("Speech Processing");
        tModuleAim.setAimDescription("Speech Processing Aim 1");
        tModuleAim.setUpdateBy("Paul");
        tModuleAim.setUpdateTime(LocalDateTime.now());;
        tModuleAimService.update(tModuleAim);
    }

    @Test
    public void TestDelete(){
        tModuleAimService.deleteByPrimaryKey(3421341241L);
    }
}
