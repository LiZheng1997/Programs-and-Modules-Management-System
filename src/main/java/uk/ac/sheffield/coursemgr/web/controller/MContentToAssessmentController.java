package uk.ac.sheffield.coursemgr.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.domain.pojo.TMContentToAssessment;
import uk.ac.sheffield.coursemgr.service.TMContentToAssessmentService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for dealing with the relations between the content and the assessment.
 * all basic business methods have implemented in his controller.
 */
@RestController
@RequestMapping("/api/MContentToAssessment")
public class MContentToAssessmentController {

    @Resource
    private TMContentToAssessmentService tmContentToAssessmentService;

    //delete a relation by PK
    @DeleteMapping("/delete")
    public void deleteByPrimaryKey(@PathVariable Long id){
            tmContentToAssessmentService.deleteByPrimaryKey(id);
    }

    //insert a record by through two ids.
    @PostMapping("/insert/{contentId}")
    public ResponseEntity<List<TMContentToAssessment>> insert(@PathVariable Long contentId,@RequestBody TMContentToAssessment record){
        List<Long> assessmentIds = record.getIds();
        List<TMContentToAssessment> tmContentToAssessmentList = new ArrayList<>();
        for (Long assessmentId:assessmentIds
             ) {
            Long id = CommonUtils.nextId();
            record.setId(id);
            record.setContentId(contentId);
            record.setAssessmentId(assessmentId);
            tmContentToAssessmentService.insert(record);
            tmContentToAssessmentList.add(record);
        }
//        String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tmContentToAssessmentList,responseHeaders, HttpStatus.OK);
    }
}
