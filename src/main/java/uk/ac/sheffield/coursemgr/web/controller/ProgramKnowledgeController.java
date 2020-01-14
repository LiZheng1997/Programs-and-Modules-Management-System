package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledge;
import uk.ac.sheffield.coursemgr.service.TProgramKnowledgeService;
import uk.ac.sheffield.coursemgr.service.TProgramService;


import javax.annotation.Resource;
import java.util.List;

/**
 * This is a controller for program knowledge, all logic business controls have been implemented.
 */
@RestController
@RequestMapping("/api/programKnowledge")
public class ProgramKnowledgeController {

    @Resource
    private TProgramKnowledgeService tProgramKnowledgeService;

    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody TProgramKnowledge tProgramKnowledge){
        Long id = CommonUtils.nextId();
        tProgramKnowledge.setKnowledgeId(id);
        tProgramKnowledgeService.insert(tProgramKnowledge);
        //String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledge,responseHeaders, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tProgramKnowledgeService.deleteByPrimaryKey(id);
    }

    @PutMapping("/update")
    public void updateByPrimaryKey(@RequestBody  TProgramKnowledge tProgramKnowledge){
        tProgramKnowledgeService.updateByPrimaryKey(tProgramKnowledge);
    }

    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TProgramKnowledge> selectByPrimaryKey(@PathVariable Long id){
        TProgramKnowledge tProgramKnowledge = tProgramKnowledgeService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tProgramKnowledge,responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/selectAll")
    public ResponseEntity<List<TProgramKnowledge>> selectAllKnowledge(){
        List<TProgramKnowledge> programKnowledge = tProgramKnowledgeService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programKnowledge,responseHeaders,HttpStatus.OK);
    }

    @GetMapping("/selectLo")
    public ResponseEntity<List<TModuleLo>> selectKnowledgeToLo(){
        List<TModuleLo> tProgramKnowledgeList = tProgramKnowledgeService.selectKnowledgeToLo();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledgeList,responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/selectLo/{id}")
    public ResponseEntity<List<TModuleLo>> selectModuleLoKnowledge(@PathVariable Long id){
        List<TModuleLo> tProgramKnowledgeList = tProgramKnowledgeService.selectModuleLoKnowledge(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledgeList,responseHeaders, HttpStatus.OK);
    }
}
