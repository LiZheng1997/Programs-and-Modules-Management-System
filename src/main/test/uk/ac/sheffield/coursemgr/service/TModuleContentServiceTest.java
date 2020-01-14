package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleContentServiceTest {

    @Resource
    private TModuleContentService tModuleContentService;

    @Test
    public void TestInsert(){
        TModuleContent tModuleContent = new TModuleContent();
        tModuleContent.setContentId(124123241242L);
        tModuleContent.setConnectContentId(3453453635L);
        tModuleContent.setContentPrerequisite(15432425234234234L);
        tModuleContent.setContext("this is a test");
        tModuleContent.setCreateBy("Jack");
        tModuleContent.setCreateTime(LocalDateTime.now());
        tModuleContentService.insert(tModuleContent);
    }

    @Test
    public void TestSelect(){
        tModuleContentService.selectByPrimaryKey(124123241242L);
    }

    @Test
    public void TestUpdate(){
        TModuleContent tModuleContent = new TModuleContent();
        tModuleContent.setContentId(124123241242L);
        tModuleContent.setConnectContentId(3453453635L);
        tModuleContent.setContentPrerequisite(15432425234234234L);
        tModuleContent.setContext("this is a test");
        tModuleContent.setUpdateBy("Paul");
        tModuleContent.setUpdateTime(LocalDateTime.now());
        tModuleContentService.update(tModuleContent);
    }

    @Test
    public void TestDelete(){
        tModuleContentService.deleteByPrimaryKey(124123241242L);
    }

}
