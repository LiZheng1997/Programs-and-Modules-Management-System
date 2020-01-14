package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleHistory;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramHistory;
import uk.ac.sheffield.coursemgr.service.TCoreModuleService;
import uk.ac.sheffield.coursemgr.service.TModuleHistoryService;
import uk.ac.sheffield.coursemgr.service.TProgramHistoryService;

import javax.annotation.Resource;
import java.util.List;

/**
 * This is a controller for program histories and module histories. Deleting control and inserting control
 * have been implemented.
 */
@RestController
@RequestMapping("/api/history")
public class HistoryController {

    @Resource
    private TProgramHistoryService tProgramHistoryService;

    @Resource
    private TModuleHistoryService tModuleHistoryService;

    //insert a program history into the table.
    @PostMapping("/insertProgram")
    public ResponseEntity insertProgram(@RequestBody TProgramHistory tProgramHistory){
        Long id = CommonUtils.nextId();
        tProgramHistory.setId(id);
        tProgramHistoryService.insert(tProgramHistory);
        //String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramHistory,responseHeaders, HttpStatus.OK);
    }

    //select a history by id and typeId.
    @GetMapping("/selectProgram/{id}")
    public ResponseEntity<List<TProgramHistory>> selectProgram(@PathVariable Long id){
        List<TProgramHistory> tProgramHistory = tProgramHistoryService.select(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tProgramHistory,responseHeaders, HttpStatus.OK);
    }

    //select all program histories
    @GetMapping("/selectAllProgram")
    public ResponseEntity<List<TProgramHistory>> selectAllProgramHistory(){
        List<TProgramHistory> tProgramHistory = tProgramHistoryService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramHistory,responseHeaders,HttpStatus.OK);
    }

    //insert one module history into the table
    @PostMapping("/insertModule")
    public ResponseEntity insertModule(@RequestBody TModuleHistory tModuleHistory){
        Long id = CommonUtils.nextId();
        tModuleHistory.setId(id);
        tModuleHistoryService.insert(tModuleHistory);
        //String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleHistory,responseHeaders, HttpStatus.OK);
    }

    //select one module history by typeId and module id
    @GetMapping("/selectModule/{id}")
    public ResponseEntity<List<TModuleHistory>> selectModule(@PathVariable Long id){
        List<TModuleHistory> tModuleHistory = tModuleHistoryService.selectByModuleId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tModuleHistory,responseHeaders, HttpStatus.OK);
    }

    //select all module histories.
    @GetMapping("/selectAllModule")
    public ResponseEntity<List<TModuleHistory>> selectAllModuleHistory(){
        List<TModuleHistory> tModuleHistory = tModuleHistoryService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleHistory,responseHeaders,HttpStatus.OK);
    }
}
