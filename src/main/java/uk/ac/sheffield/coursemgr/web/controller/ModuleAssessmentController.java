package uk.ac.sheffield.coursemgr.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessment;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.service.TModuleAssessmentService;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for dealing with module assessments, all logic business controls have been implemented.
 */
@RestController
@RequestMapping("/api/assessment")
public class ModuleAssessmentController {

    @Resource
    private TModuleAssessmentService tModuleAssessmentService;

    //insert a module assessment record into the table.
    @PostMapping("/insert")
    public ResponseEntity<List<TModuleAssessment>> insert(@RequestBody List<TModuleAssessment> assessments){
        List<TModuleAssessment> responseAssessment = new ArrayList<>();

        for (TModuleAssessment assessment: assessments) {
            Long assessmentId = CommonUtils.nextId();
            assessment.setAssessmentId(assessmentId);
            tModuleAssessmentService.insert(assessment);
            responseAssessment.add(assessment);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseAssessment,responseHeaders, HttpStatus.OK);
    }

    //delete a module assessment record by id.
    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tModuleAssessmentService.deleteByPrimaryKey(id);
    }

    //update a record.
    @PutMapping("/update")
    public void update(@RequestBody List<TModuleAssessment> assessments){
        for (TModuleAssessment assessment: assessments) {
            tModuleAssessmentService.update(assessment);
        }
    }

    //select a module assessment from the table.
    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TModuleAssessment> selectByPrimaryKey(@PathVariable Long id){
        TModuleAssessment tModuleAssessment = tModuleAssessmentService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tModuleAssessment,responseHeaders, HttpStatus.OK);
    }

    //many to many method
    @GetMapping("/selectAssessmentLOs")
    public ResponseEntity<List<TModuleLo>> selectModuleAssessmentLos(){
        List<TModuleLo> tModuleLoList = tModuleAssessmentService.selectAssessmentLos();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleLoList,responseHeaders, HttpStatus.OK);
    }

    //many to many method, select all aims which contribute to all assessments
    @GetMapping("/selectAssessmentAims/{id}")
    public ResponseEntity<List<TModuleAim>> selectModuleAssessmentAims(){
        List<TModuleAim> tModuleAimList = tModuleAssessmentService.selectAssessmentAims();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleAimList,responseHeaders, HttpStatus.OK);
    }

    //one to many method, left join select info from aims.
    @GetMapping("/selectAims/{id}")
    public ResponseEntity<List<TModuleAim>> selectAssessmentAims(@PathVariable Long id){
        List<TModuleAim> tModuleAimList = tModuleAssessmentService.selectAims(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleAimList,responseHeaders, HttpStatus.OK);
    }

    //one to many method, select all LOs which contribute to this module assessment.
    @GetMapping("/selectLOs/{id}")
    public ResponseEntity<List<TModuleLo>> selectLOs(@PathVariable Long id){
        List<TModuleLo> tModuleLoList = tModuleAssessmentService.selectLOs(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleLoList,responseHeaders, HttpStatus.OK);
    }

    //one to many method, select all contents which contribute to a assessment.
    @GetMapping("/selectContents/{id}")
    public ResponseEntity<List<TModuleContent>> selectContents(@PathVariable Long id){
        List<TModuleContent> moduleContents = tModuleAssessmentService.selectContents(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleContents,responseHeaders,HttpStatus.OK);
    }
}
