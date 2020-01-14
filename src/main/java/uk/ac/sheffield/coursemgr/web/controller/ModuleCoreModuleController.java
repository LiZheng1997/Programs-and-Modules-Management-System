package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TCoreModule;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.service.TCoreModuleService;
import uk.ac.sheffield.coursemgr.service.TModuleAimService;

import javax.annotation.Resource;
import java.util.List;

/**
 * This is a controller for the program core module .
 */
@RestController
@RequestMapping("/api/programCore")
public class ModuleCoreModuleController {

    @Resource
    private TCoreModuleService tCoreModuleService;

    @PostMapping("/insert")
    public ResponseEntity insert(@RequestBody TCoreModule tCoreModule){
        Long id = CommonUtils.nextId();
        tCoreModule.setId(id);
        tCoreModuleService.insert(tCoreModule);
        //String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tCoreModule,responseHeaders, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{programId}&{coreModuleId}")
    public void delete(@PathVariable Long programId, @PathVariable Long coreModuleId){
        tCoreModuleService.delete(programId, coreModuleId);
    }

    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TCoreModule> selectByPrimaryKey(@PathVariable Long id){
        TCoreModule tCoreModule = tCoreModuleService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(tCoreModule,responseHeaders, HttpStatus.OK);
    }

    @GetMapping("/selectAll")
    public ResponseEntity<List<TCoreModule>> selectAllModules(){
        List<TCoreModule> tCoreModules = tCoreModuleService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tCoreModules,responseHeaders,HttpStatus.OK);
    }
}
