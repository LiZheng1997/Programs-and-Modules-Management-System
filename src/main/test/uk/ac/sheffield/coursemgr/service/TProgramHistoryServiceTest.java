package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramHistory;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramHistoryServiceTest {

    @Resource
    private TProgramHistoryService tProgramHistoryService;

    @Test
    public void testInsert() {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        TProgramHistory programHistory = new TProgramHistory();
        programHistory.setProgramId(125312412351L);
        programHistory.setId(CommonUtils.nextId());
        programHistory.setNote("ACS Aim 1");
        programHistory.setType("Program Aim");
        programHistory.setOperation("Update");
        programHistory.setCreateBy("Jack");
        programHistory.setCreateTime(date);
        programHistory.setElement("ACS");
        programHistory.setTypeId(124141514L);
        tProgramHistoryService.insert(programHistory);
    }

    @Test
    public void testSelectByProgram() {
        tProgramHistoryService.select(125312412351L);
    }





}
