package uk.ac.sheffield.coursemgr.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAssessmentToLo;
import uk.ac.sheffield.coursemgr.service.TModuleAssessmentToLoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/moduleAssessmentLO")
public class ModuleAssessmentToLoController {

    @Resource
    private TModuleAssessmentToLoService tModuleAssessmentToLoService;


    @DeleteMapping("/delete/{id}")
    public void deleteModuleAssessmentLoById( @PathVariable Long id){
        tModuleAssessmentToLoService.deleteModuleAssessmentLoById(id);
    }
    //insert some records by a id list.
    @PostMapping("/insert/{contentId}")
    public ResponseEntity<List<TModuleAssessmentToLo>> insertModuleAssessmentLo(@PathVariable  Long contentId, @RequestBody List<TModuleAssessmentToLo> tModuleAssessmentToLo){
        // First: Delete all LOs belonged to this content
        tModuleAssessmentToLoService.deleteModuleAssessmentLoById(contentId);
        List<TModuleAssessmentToLo> tModuleAssessmentToLos = new ArrayList<>();
        for (TModuleAssessmentToLo Relation:tModuleAssessmentToLo) {
            Long id = CommonUtils.nextId();
            Relation.setId(id);
            // Second: Insert new relation
            tModuleAssessmentToLoService.insertModuleAssessmentLo(Relation);
            tModuleAssessmentToLos.add(Relation);
        }
//        String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleAssessmentToLos,responseHeaders, HttpStatus.OK);
    }
}
