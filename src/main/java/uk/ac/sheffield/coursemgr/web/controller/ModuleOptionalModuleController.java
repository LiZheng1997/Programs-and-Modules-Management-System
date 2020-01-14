package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TOptionalModule;
import uk.ac.sheffield.coursemgr.service.TCoreModuleService;
import uk.ac.sheffield.coursemgr.service.TOptionalModuleService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for the program optional module, all business controls have been implemented.
 */
@RestController
@RequestMapping("/api/programOptional")
public class ModuleOptionalModuleController {

    @Resource
    private TOptionalModuleService tOptionalModuleService;

    //insert a optional module
    @PostMapping("/insert")
    public ResponseEntity<List<TOptionalModule>> insert(@RequestBody List<TOptionalModule> tOptionalModules){
        List<TOptionalModule> responseOptionalModule = new ArrayList<>();

        for (TOptionalModule tOptionalModule: tOptionalModules) {
            Long id = CommonUtils.nextId();
            tOptionalModule.setId(id);
            tOptionalModuleService.insert(tOptionalModule);
            responseOptionalModule.add(tOptionalModule);
        }

        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseOptionalModule,responseHeaders, HttpStatus.OK);
    }

    //delete a record by two ids.
    @DeleteMapping("/delete/{programId}&{optionalModuleId}")
    public void delete(@PathVariable Long programId, @PathVariable Long optionalModuleId){
        tOptionalModuleService.delete(programId, optionalModuleId);
    }

    //select a optional module by id.
    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TOptionalModule> selectByPrimaryKey(@PathVariable Long id){
        TOptionalModule tOptionalModule = tOptionalModuleService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tOptionalModule,responseHeaders, HttpStatus.OK);
    }

    //select all optional modules.
    @GetMapping("/selectAll")
    public ResponseEntity<List<TOptionalModule>> selectAllModules(){
        List<TOptionalModule> tOptionalModules = tOptionalModuleService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tOptionalModules,responseHeaders,HttpStatus.OK);
    }
}
