package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkill;
import uk.ac.sheffield.coursemgr.service.TProgramService;
import uk.ac.sheffield.coursemgr.service.TProgramSkillService;

import javax.annotation.Resource;
import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for program skill .
 */
@RestController
@RequestMapping("/api/programSkill")
public class ProgramSkillController {

    @Resource
    private TProgramSkillService tProgramSkillService;


    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody TProgramSkill tProgramSkill){
        Long id = CommonUtils.nextId();
        tProgramSkill.setSkillId(id);
        tProgramSkillService.insert(tProgramSkill);
        String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkill,responseHeaders, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tProgramSkillService.deleteByPrimaryKey(id);
    }

    @PutMapping("/update")
    public void updateByPrimaryKey(@RequestBody  TProgramSkill tProgramSkill){
        tProgramSkillService.updateByPrimaryKey(tProgramSkill);
    }

    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TProgramSkill> selectByPrimaryKey(@PathVariable Long id){
        TProgramSkill tProgramSkill = tProgramSkillService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tProgramSkill,responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/selectAll")
    public ResponseEntity<List<TProgramSkill>> selectAllSkill(){
        List<TProgramSkill> programSkill = tProgramSkillService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programSkill,responseHeaders,HttpStatus.OK);
    }


    @GetMapping("/selectLo")
    public ResponseEntity<List<TModuleLo>> selectSkillToLo(){
        List<TModuleLo> tProgramSkillList = tProgramSkillService.selectSkillToLo();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkillList,responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/selectLo/{id}")
    public ResponseEntity<List<TModuleLo>> selectModuleLoSkill(@PathVariable Long id){
        List<TModuleLo> tProgramSkillList = tProgramSkillService.selectModuleLoSkill(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkillList,responseHeaders, HttpStatus.OK);
    }
}
