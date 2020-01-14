package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgram;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleServiceTest {

    @Resource
    private TModuleService tModuleService;


//    @Resource
//    private TModuleAimService tModuleAimService;

    @Test
    public void testInsert() {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        TModule module = new TModule();
        module.setModuleId(45334532543224L);
        module.setProgramCode("ACS");
        module.setContentId(2142131241321L);
        module.setObjectives("objectives");
        module.setModuleCode("COM6115");
        module.setModuleTitle("Text Processing");
        module.setAimId(31242312421312L);
        module.setLoId(21412321421421L);
        module.setAssessmentId(1253212141233213L);
        module.setCreateBy("Jack");
        module.setCreateTime(date);
        tModuleService.insert(module);
    }


    @Test
    public void testSelect() {
        tModuleService.selectByPrimaryKey(45334532543224L);
    }

    @Test
    public void testUpdate() {
        LocalDateTime date = LocalDateTime.now();
        TModule module = new TModule();
        module.setModuleId(45334532543224L);
        module.setProgramCode("ACS");
        module.setContentId(12413214131224124L);
        module.setObjectives("objectives");
        module.setModuleCode("COM6502");
        module.setModuleTitle("Speech Processing");
        module.setAimId(12421312421L);
        module.setLoId(124214124311L);
        module.setAssessmentId(12421312421L);
        module.setUpdateBy("Paul");
        module.setUpdateTime(date);
        tModuleService.update(module);
    }


    @Test
    public void testDelete() {
        tModuleService.deleteByPrimaryKey(45334532543224L);
    }


//    @Test
//    public void testInsertAim(){
//        TModuleAim tModuleAim =new TModuleAim();
//        tModuleAim.setAimId((long) 345);
//        tModuleAimService.insert(tModuleAim);
//    }
}
