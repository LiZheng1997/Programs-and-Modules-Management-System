package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramAim;
import uk.ac.sheffield.coursemgr.service.TProgramAimService;

import javax.annotation.Resource;
import java.util.List;

/**
 * This is a controller for program aims.
 */
@RestController
@RequestMapping("/api/programAim")
public class ProgramAimController {

    @Resource
    private TProgramAimService tProgramAimService;

    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody TProgramAim aim){
        Long aimId = CommonUtils.nextId();
        aim.setAimId(aimId);
        tProgramAimService.insert(aim);
        //String recordId = LongIdToStringId.toStringId(aimId);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(aim,responseHeaders, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tProgramAimService.deleteByPrimaryKey(id);
    }

    @PutMapping("/update")
    public void updateByPrimaryKey(@RequestBody TProgramAim tProgramAim){
        tProgramAimService.updateByPrimaryKey(tProgramAim);
    }

    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TProgramAim> selectByPrimaryKey(@PathVariable Long id){
        TProgramAim programAim = tProgramAimService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(programAim,responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/selectAll")
    public ResponseEntity<List<TProgramAim>> selectAllModules(){
        List<TProgramAim> programAims = tProgramAimService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(programAims,responseHeaders,HttpStatus.OK);
    }
}
