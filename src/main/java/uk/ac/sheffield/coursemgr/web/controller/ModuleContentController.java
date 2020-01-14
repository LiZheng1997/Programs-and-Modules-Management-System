package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessment;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContent;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleLo;
import uk.ac.sheffield.coursemgr.service.TModuleContentService;
import uk.ac.sheffield.coursemgr.service.TModuleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * This is controller for dealing with all module contents. All business controls are implemented.
 */
@RestController
@RequestMapping("/api/content")
public class ModuleContentController {

    @Resource
    private TModuleContentService tModuleContentService;

    @Resource
    private TModuleService tModuleService;

    // insert a module content into the table.
    @PostMapping("/insert")
    public ResponseEntity<List<TModuleContent>> insert(@RequestBody List<TModuleContent> contents){
        List<TModuleContent> responseContents = new ArrayList<>();

        for (TModuleContent content: contents) {
            Long id = CommonUtils.nextId();
            content.setContentId(id);
            tModuleContentService.insert(content);
            responseContents.add(content);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseContents,responseHeaders, HttpStatus.OK);
    }

    //delete by id.
    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tModuleContentService.deleteByPrimaryKey(id);
    }

    //update a record
    @PutMapping("/update")
    public void update(@RequestBody List<TModuleContent> contents){
        for (TModuleContent content: contents) {
            tModuleContentService.update(content);
        }
    }

    //select a module content by id.
    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TModuleContent> selectByPrimaryKey(@PathVariable Long id){
        TModuleContent tModuleContent = tModuleContentService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tModuleContent,responseHeaders, HttpStatus.OK);
    }

    //select a connect content
    @GetMapping("/selectContent/{id}")
    public ResponseEntity<TModuleContent> selectModuleContentContent(@PathVariable Long id) {
        Long moduleId =  tModuleContentService.selectConnectContentById(id);
        TModuleContent tModuleContent = tModuleContentService.selectByPrimaryKey(moduleId);
       // List<TModuleContent> contentList = tModuleContentService.selectModuleContentContentById(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleContent ,responseHeaders,HttpStatus.OK);
    }

    //    Used for programme module page
//    Given a list of moduleId
//    Return
    @PostMapping("/selectPrerequisites")
    public ResponseEntity<List<List<Map<String, TModuleContent>>>> selectContentPrerequisite(@RequestBody List<Long> moduleIds){
        Map<String, TModuleContent> contentMap;
        List<Map<String, TModuleContent>> tempContent;
        List<List<Map<String, TModuleContent>>> contentPrerequisite = new ArrayList<>();

        for (Long moduleId: moduleIds){
            List<TModuleContent> moduleContents = tModuleService.selectContents(moduleId);
            tempContent = new ArrayList<>();
            for (TModuleContent moduleContent: moduleContents) {
                contentMap = new LinkedHashMap<>();
                TModuleContent connectContent = tModuleContentService.selectByPrimaryKey(moduleContent.getConnectContentId());
                contentMap.put("original", moduleContent);
                contentMap.put("connect", connectContent);
                tempContent.add(contentMap);
            }
            contentPrerequisite.add(tempContent);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(contentPrerequisite,responseHeaders,HttpStatus.OK);
    }

    //many to many method, select all LOs which contribute to all contents.
    @GetMapping("/selectContentLOs")
    public ResponseEntity<List<TModuleLo>> selectModuleAssessmentLos(){
        List<TModuleLo> tModuleLoList = tModuleContentService.selectContentLos();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleLoList,responseHeaders, HttpStatus.OK);
    }

    //select all LOs which contribute to this content.
    @GetMapping("/selectLOs/{id}")
    public ResponseEntity<List<TModuleLo>> selectLos(@PathVariable Long id){
        List<TModuleLo> moduleLos = tModuleContentService.selectLos(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleLos,responseHeaders,HttpStatus.OK);
    }

    //select all assessments which contribute to this content.
    @GetMapping("/selectAssessments/{id}")
    public ResponseEntity<List<TModuleAssessment>> selectAssessments(@PathVariable Long id){

        List<TModuleAssessment> moduleAssessments = tModuleContentService.selectAssessments(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleAssessments,responseHeaders,HttpStatus.OK);
    }
}
