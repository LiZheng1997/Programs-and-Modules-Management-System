package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramSkillToModuleLoServiceTest {

    @Resource
    private TProgramSkillToModuleLoService tProgramSkillToModuleLoService;

    @Resource
    private TModuleLoService tModuleLoService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TProgramSkillToModuleLo programSkillToModuleLo = new TProgramSkillToModuleLo();
        programSkillToModuleLo.setId(CommonUtils.nextId());
        programSkillToModuleLo.setSkillId(4357348474547L);
        programSkillToModuleLo.setLoId(570124653887672320L);
        programSkillToModuleLo.setNumber(0);
        programSkillToModuleLo.setCreateBy("Jack");
        programSkillToModuleLo.setCreateTime(date);
        tProgramSkillToModuleLoService.insert(programSkillToModuleLo);
    }

    @Test
    public void testDeleteById() {
        tProgramSkillToModuleLoService.deleteProgramSkillLoById(570124653887672320L);
    }

    @Test
    public void testCount() {
        TProgramSkillToModuleLo programSkillToModuleLo = new TProgramSkillToModuleLo();
        int a = tProgramSkillToModuleLoService.countProgramSkillLo(programSkillToModuleLo);
        System.out.println("The number of the table of the program skill to module lo is " +a);
    }



}
