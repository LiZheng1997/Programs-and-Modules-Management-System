package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramAim;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramAimServiceTest {

    @Resource
    private TProgramAimService tProgramAimService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TProgramAim programAim = new TProgramAim();
        programAim.setAimId(12513241215L);
        programAim.setAimDescription("ACS Aim1");
        programAim.setProgramId(124215115214L);
        programAim.setProgramCode("ACS");
        programAim.setCreateBy("Jack");
        programAim.setCreateTime(date);
        tProgramAimService.insert(programAim);
    }

    @Test
    public void testSelect() {
        tProgramAimService.selectByPrimaryKey(12513241215L);
    }

    @Test
    public void testUpdate() {
        LocalDateTime date = LocalDateTime.now();
        TProgramAim programAim = new TProgramAim();
        programAim.setAimId(12513241215L);
        programAim.setAimDescription("IM Aim1");
        programAim.setProgramId(253213532L);
        programAim.setProgramCode("IM");
        programAim.setUpdateBy("Paul");
        programAim.setUpdateTime(date);
        tProgramAimService.updateByPrimaryKey(programAim);
    }


    @Test
    public void testDelete() {
        tProgramAimService.deleteByPrimaryKey(12513241215L);
    }


    @Test
    public void testCount() {
        TProgramAim programAim = new TProgramAim();
        int a = tProgramAimService.countProgramAim(programAim);
        System.out.println("The number of the table of the program aim is " +a);
    }



}
