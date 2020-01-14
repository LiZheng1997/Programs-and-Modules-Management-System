package uk.ac.sheffield.coursemgr.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.*;
import uk.ac.sheffield.coursemgr.service.TModuleLoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This a controller for module LO.
 */
@RestController
@RequestMapping("/api/moduleLO")
public class ModuleLoController {

    @Resource
    private TModuleLoService tModuleLoService;

    private static final Logger logger = LoggerFactory.getLogger(ModuleLoController.class);

    //insert a module LO
    @PostMapping("/insert")
    public ResponseEntity<List<TModuleLo>> insert(@RequestBody List<TModuleLo> LOs){
        List<TModuleLo> responseLO = new ArrayList<>();

        for (TModuleLo LO: LOs) {
            Long id = CommonUtils.nextId();
            LO.setModuleLoId(id);
            tModuleLoService.insert(LO);
            responseLO.add(LO);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseLO,responseHeaders, HttpStatus.OK);
    }

    //delete a record.
    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tModuleLoService.deleteByPrimaryKey(id);
    }

    //update a record.
    @PutMapping("/update")
    public void update(@RequestBody List<TModuleLo> LOs){
        for (TModuleLo LO: LOs) {
            tModuleLoService.update(LO);
        }
    }

    //select a module LO by id.
    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TModuleLo> selectByPrimaryKey(@PathVariable Long id){
        TModuleLo tModuleLo = tModuleLoService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tModuleLo,responseHeaders, HttpStatus.OK);
    }

    //select all assessments which contribute to one module LO.
    @GetMapping("/selectAssessments/{id}")
    public ResponseEntity<List<TModuleAssessment>> selectAssessmentLo(@PathVariable Long id) {
        List<TModuleAssessment> tModuleLoList = tModuleLoService.selectModuleAssessmentLo(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tModuleLoList,responseHeaders, HttpStatus.OK);

    }

    //select all contents which contribute to one module LO.
    @GetMapping("/selectContents/{id}")
    public ResponseEntity<List<TModuleContent>> selectModuleContentLo(@PathVariable Long id) {
        List<TModuleContent> tModuleContentList = tModuleLoService.selectModuleContentLo(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tModuleContentList,responseHeaders, HttpStatus.OK);
    }

    //select all program skills which contribute to one module LO.
    @GetMapping("/selectSkills/{id}")
    public ResponseEntity<List<TProgramSkill>> selectSkills(@PathVariable Long id){
        List<TProgramSkill> tProgramSkillList = tModuleLoService.selectProgramSkillLo(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkillList,responseHeaders, HttpStatus.OK);
    }

    //select all program skills which contribute to all skills.
    @GetMapping("/selectSkills")
    public ResponseEntity<List<TProgramSkill>> selectLoToSkill(){
        List<TProgramSkill> tProgramSkillList = tModuleLoService.selectLoToSkill();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkillList,responseHeaders, HttpStatus.OK);
    }

    //select all knowledge which contribute to one module LO.
    @GetMapping("/selectKnowledge/{id}")
    public ResponseEntity<List<TProgramKnowledge>> selectKnowledge(@PathVariable Long id){
        List<TProgramKnowledge> tProgramKnowledgeList = tModuleLoService.selectProgramKnowledgeLo(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledgeList,responseHeaders, HttpStatus.OK);
    }

    //select all knowledge which contribute to all module LOs.
    @GetMapping("/selectKnowledge")
    public ResponseEntity<List<TProgramKnowledge>> selectLoToKnowledge(){
        List<TProgramKnowledge> tProgramKnowledgeList = tModuleLoService.selectLoToKnowledge();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledgeList,responseHeaders, HttpStatus.OK);
    }
}
