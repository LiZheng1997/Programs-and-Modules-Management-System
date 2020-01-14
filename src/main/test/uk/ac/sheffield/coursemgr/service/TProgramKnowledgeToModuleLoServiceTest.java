package uk.ac.sheffield.coursemgr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.ac.sheffield.coursemgr.BootstrapApplication;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledgeToModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootstrapApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class TProgramKnowledgeToModuleLoServiceTest {

    @Resource
    private TProgramKnowledgeToModuleLoService tProgramKnowledgeToModuleLoService;

    @Resource
    private TModuleLoService tModuleLoService;

    @Test
    public void testInsert() {
        LocalDateTime date = LocalDateTime.now();
        TProgramKnowledgeToModuleLo programKnowledgeToModuleLo = new TProgramKnowledgeToModuleLo();
        programKnowledgeToModuleLo.setId(CommonUtils.nextId());
        programKnowledgeToModuleLo.setKnowledgeId(1251243135216L);
        programKnowledgeToModuleLo.setLoId(570124653887672320L);
        programKnowledgeToModuleLo.setNumber(0);
        programKnowledgeToModuleLo.setCreateBy("Jack");
        programKnowledgeToModuleLo.setCreateTime(date);
        tProgramKnowledgeToModuleLoService.insert(programKnowledgeToModuleLo);
    }


    @Test
    public void testDeleteById() {
        tProgramKnowledgeToModuleLoService.deleteProgramKnowledgeLoById(570124653887672320L);
    }

    @Test
    public void testCount() {
        TProgramKnowledgeToModuleLo programKnowledgeToModuleLo = new TProgramKnowledgeToModuleLo();
        int a = tProgramKnowledgeToModuleLoService.countProgramKnowledgeLo(programKnowledgeToModuleLo);
        System.out.println("The number of the table of the program knowledge to module lo is " +a);
    }


}
