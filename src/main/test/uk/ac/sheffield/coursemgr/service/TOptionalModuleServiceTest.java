package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TOptionalModule;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TOptionalModuleServiceTest {

    @Resource
    private TOptionalModuleService tOptionalModuleService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TOptionalModule optionalModule = new TOptionalModule();
        optionalModule.setProgramId(1253421421412L);
        optionalModule.setOptionalModuleId(12532421431251141L);
        optionalModule.setId(3463543523424214L);
        optionalModule.setCreateBy("Jack");
        optionalModule.setCreateTime(date);
        tOptionalModuleService.insert(optionalModule);
    }

    @Test
    public void testSelectByProgram() {
        tOptionalModuleService.selectByPrimaryKey(3463543523424214L);
    }

    @Test
    public void testDelete() {
        tOptionalModuleService.delete(1253421421412L,12532421431251141L);
    }





}
