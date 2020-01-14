package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleHistory;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramHistory;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TModuleHistoryServiceTest {

    @Resource
    private TModuleHistoryService tModuleHistoryService;

    @Test
    public void testInsert() {
        Timestamp date = new Timestamp(System.currentTimeMillis());
        TModuleHistory moduleHistory = new TModuleHistory();
        moduleHistory.setModuleId(34634354363451L);
        moduleHistory.setId(CommonUtils.nextId());
        moduleHistory.setNote("Test Processing Aim 1");
        moduleHistory.setType("Test Processing Aim");
        moduleHistory.setOperation("Delete");
        moduleHistory.setCreateBy("Jack");
        moduleHistory.setCreateTime(date);
        moduleHistory.setElement("Test Processing");
        moduleHistory.setTypeId(153254236252L);
        tModuleHistoryService.insert(moduleHistory);
    }

    @Test
    public void testSelectByProgram() {
        tModuleHistoryService.selectByModuleId(34634354363451L);
    }

}
