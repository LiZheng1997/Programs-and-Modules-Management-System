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
import uk.ac.sheffield.coursemgr.service.TProgramService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * This is a controller for program,
 */
@RestController
@RequestMapping("/api/program")
public class ProgramController {

    @Resource
    private TProgramService programService;

    private static final Logger logger = LoggerFactory.getLogger(ProgramController.class);


    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody TProgram program){
        Long programId = CommonUtils.nextId();
        program.setProgramId(programId);
        programService.insert(program);
        //String recordId = LongIdToStringId.toStringId(programId);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(program,responseHeaders, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        programService.deleteByPrimaryKey(id);
    }

    @PutMapping("/update")
    public void updateByPrimaryKey(@RequestBody TProgram program){
        programService.updateByPrimaryKey(program);
    }

    @GetMapping("/select/{id}")
    public ResponseEntity<TProgram> select(@PathVariable Long id) {
        TProgram program = programService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(program,responseHeaders, HttpStatus.OK);

    }

    @GetMapping("/selectAll")
    public ResponseEntity<List<TProgram>> selectAllPrograms(){
        List<TProgram> programList = programService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programList,responseHeaders,HttpStatus.OK);
    }

    //select a part info
    @GetMapping("/selectPart")
    public ResponseEntity<List<Map<String, Object>>> selectPartPrograms(){
        List<Map<String, Object>> programList = programService.selectPartProgram();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programList,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectPartByAim/{aimId}")
    public ResponseEntity<List<Map<String, Object>>> selectPartProgramByAim(@PathVariable Long aimId){
        List<Map<String, Object>> programList = programService.selectPartProgramByProgramAim(aimId);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programList,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectPartByLo/{loId}")
    public ResponseEntity<List<Map<String, Object>>> selectPartModuleByLo(@PathVariable Long loId){
        List<Map<String, Object>> programList = programService.selectPartProgramByLo(loId);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programList,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectAims/{id}")
    public ResponseEntity<List<TProgramAim>> selectAims(@PathVariable Long id){
        List<TProgramAim> tProgramAims = programService.selectAims(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramAims,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectSkills/{id}")
    public ResponseEntity<List<TProgramSkill>> selectSkills(@PathVariable Long id){
        List<TProgramSkill> tProgramSkills = programService.selectSkills(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkills,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectKnowledge/{id}")
    public ResponseEntity<List<TProgramKnowledge>> selectKnowledge(@PathVariable Long id){
        List<TProgramKnowledge> tProgramKnowledge = programService.selectKnowledge(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledge,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectCores/{id}")
    public ResponseEntity<List<TModule>> selectCoreModules(@PathVariable Long id){
        List<TModule> tModules = programService.selectCores(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModules,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectOptionals/{id}")
    public ResponseEntity<List<TModule>> selectOptionalModules(@PathVariable Long id){
        List<TModule> tModules = programService.selectOptionals(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModules,responseHeaders,HttpStatus.OK);
    }
}
