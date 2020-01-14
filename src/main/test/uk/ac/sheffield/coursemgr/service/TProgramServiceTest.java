package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgram;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramServiceTest {

    @Resource
    private TProgramService tProgramService;

    @Test
    public void testInsert() {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        TProgram program = new TProgram();
        program.setProgramId(124215115214L);
        program.setProgramCode("ACS");
        program.setProgramTitle("Advanced Computer Science");
        program.setCreateBy("Jack");
        program.setCreateTime(date);
        tProgramService.insert(program);
    }

    @Test
    public void testSelect() {
        tProgramService.selectByPrimaryKey(124215115214L);
    }

    @Test
    public void testUpdate() {
        LocalDateTime date = LocalDateTime.now();
        TProgram program = new TProgram();
        program.setProgramId(124215115214L);
        program.setProgramTitle("Information Management");
        program.setProgramCode("IM");
        program.setUpdateBy("Paul");
        program.setUpdateTime(date);
        tProgramService.updateByPrimaryKey(program);
    }

    @Test
    public void testDelete() {
        tProgramService.deleteByPrimaryKey(124215115214L);
    }



    @Test
    public void testCount() {
        TProgram program = new TProgram();
        int a = tProgramService.countProgram(program);
        System.out.println("The number of the table of the program is " +a);
    }



}
