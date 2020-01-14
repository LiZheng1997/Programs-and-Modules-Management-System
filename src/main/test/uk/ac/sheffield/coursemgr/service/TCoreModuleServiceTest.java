package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TCoreModuleServiceTest {

    @Resource
    private TCoreModuleService tCoreModuleService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TCoreModule coreModule = new TCoreModule();
        coreModule.setProgramId(214214512431L);
        coreModule.setCoreModuleId(21521421151421L);
        coreModule.setId(321421312421421L);
        coreModule.setCreateBy("Jack");
        coreModule.setCreateTime(date);
        tCoreModuleService.insert(coreModule);
    }

    @Test
    public void testSelectByProgram() {
        tCoreModuleService.selectByPrimaryKey(321421312421421L);
    }

    @Test
    public void testDelete() {
        tCoreModuleService.delete(214214512431L,21521421151421L);
    }





}
