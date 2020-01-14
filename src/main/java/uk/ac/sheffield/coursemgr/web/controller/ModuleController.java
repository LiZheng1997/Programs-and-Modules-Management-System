package uk.ac.sheffield.coursemgr.web.controller;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.*;
import uk.ac.sheffield.coursemgr.service.TModuleLoService;
import uk.ac.sheffield.coursemgr.service.TModuleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This is a controller for modules, all business controls have been implemented.
 */
@RestController
@RequestMapping("/api/module")
public class ModuleController {

    @Resource
    private TModuleService moduleService;

    @Resource
    private TModuleLoService tModuleLoService;

    private static final Logger logger = LoggerFactory.getLogger(ModuleController.class);

    //insert a record.
    @PostMapping("/insert")
    public ResponseEntity insertModule(@RequestBody TModule module){
        Long id = CommonUtils.nextId();
        module.setModuleId(id);
        moduleService.insert(module);
//        String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(module,responseHeaders, HttpStatus.OK);
    }

    //delete a record.
    @DeleteMapping("/delete/{id}")
    public int deleteByPrimaryKey(@PathVariable Long id){
        moduleService.deleteByPrimaryKey(id);
        return 1;
    }

    //update a record.
    @PutMapping("/update")
    public void update(@RequestBody TModule tModule){
        moduleService.update(tModule);
    }

    //select a module by ID.
    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TModule> selectModule(@PathVariable Long id) {
        TModule module = moduleService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(module,responseHeaders, HttpStatus.OK);

    }

    //select all modules from the table.
    @GetMapping("/selectAll")
    public ResponseEntity<List<TModule>> selectAllModules(){

        List<TModule> moduleList = moduleService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleList,responseHeaders,HttpStatus.OK);
    }

    //select a part info from the module table.
    @GetMapping("/selectPart")
    public ResponseEntity<List<Map<String, Object>>> selectPartModules(){

        List<Map<String, Object>> moduleList = moduleService.selectPartModule();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleList,responseHeaders,HttpStatus.OK);
    }

    //select a part info by aimId.
    @GetMapping("/selectPartByAim/{aimId}")
    public ResponseEntity<List<Map<String, Object>>> selectPartModuleByAim(@PathVariable Long aimId){

        List<Map<String, Object>> moduleList = moduleService.selectPartModuleByAim(aimId);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleList,responseHeaders,HttpStatus.OK);
    }

    //select a part info by loId.
    @GetMapping("/selectPartByLo/{loId}")
    public ResponseEntity<List<Map<String, Object>>> selectPartModuleByLo(@PathVariable Long loId){

        List<Map<String, Object>> moduleList = moduleService.selectPartModuleByLo(loId);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleList,responseHeaders,HttpStatus.OK);
    }

    //select all aims by module id.
    @GetMapping("/selectAims/{id}")
    public ResponseEntity<List<TModuleAim>> selectAims(@PathVariable Long id){

        List<TModuleAim> moduleAims = moduleService.selectAims(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleAims,responseHeaders,HttpStatus.OK);
    }

    //select all LOs which contribute a module.
    @GetMapping("/selectLOs/{id}")
    public ResponseEntity<List<Map<String, Object>>> selectLos(@PathVariable Long id){
        List<Map<String, Object>> responseLOs = new ArrayList<>();

        List<TModuleLo> moduleLos = moduleService.selectLos(id);
        List<TProgramSkill> tempSkillList;
        List<TProgramKnowledge> tempKnowledgeList;
        Map<String, Object> tempLO;
        for (TModuleLo moduleLo: moduleLos) {
            tempLO = new HashMap<>();
            tempSkillList = tModuleLoService.selectProgramSkillLo(moduleLo.getModuleLoId());
            tempKnowledgeList = tModuleLoService.selectProgramKnowledgeLo(moduleLo.getModuleLoId());
            tempLO.put("moduleLoId", moduleLo.getModuleLoId());
            tempLO.put("loTitle", moduleLo.getLoTitle());
            tempLO.put("context", moduleLo.getContext());
            tempLO.put("toSkillSelect", tempSkillList);
            tempLO.put("toKnowledgeSelect", tempKnowledgeList);

            responseLOs.add(tempLO);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseLOs,responseHeaders,HttpStatus.OK);
    }

    //select all assessments which contribute to a module.
    @GetMapping("/selectAssessments/{id}")
    public ResponseEntity<List<TModuleAssessment>> selectAssessments(@PathVariable Long id){

        List<TModuleAssessment> moduleAssessments = moduleService.selectAssessments(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleAssessments,responseHeaders,HttpStatus.OK);
    }

    //select all contents which contribute to a module.
    @GetMapping("/selectContents/{id}")
    public ResponseEntity<List<TModuleContent>> selectContents(@PathVariable Long id){

        List<TModuleContent> moduleContents = moduleService.selectContents(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleContents,responseHeaders,HttpStatus.OK);
    }
}
