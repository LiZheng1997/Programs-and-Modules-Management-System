package uk.ac.sheffield.coursemgr.web.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleAim;
import uk.ac.sheffield.coursemgr.service.TModuleAimService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for module aims, all basic business methods have implemented in his controller.
 */
@RestController
@RequestMapping("/api/moduleAim")
public class ModuleAimController {

    @Resource
    private TModuleAimService tModuleAimService;

    //insert a module aim into the table.
    @PostMapping("/insert")
    public ResponseEntity<List<TModuleAim>> insert(@RequestBody List<TModuleAim> aims){
        List<TModuleAim> responseAims = new ArrayList<>();
        for (TModuleAim aim: aims) {
            Long id = CommonUtils.nextId();
            aim.setAimId(id);
            tModuleAimService.insert(aim);
            responseAims.add(aim);
        }
//        String recordId = LongIdToStringId.toStringId(id);//discarded
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(responseAims,responseHeaders, HttpStatus.OK);
    }

    //delete a record by Id.
    @DeleteMapping("/delete/{id}")
    public void deleteByPrimaryKey(@PathVariable Long id){
        tModuleAimService.deleteByPrimaryKey(id);
    }

    //update a module aim.
    @PutMapping("/update")
    public void update(@RequestBody List<TModuleAim> aims){
        for (TModuleAim aim: aims) {
            tModuleAimService.update(aim);
        }
    }

    //select one module aim by id.
    @GetMapping("/selectOne/{id}")
    public ResponseEntity<TModuleAim> selectByPrimaryKey(@PathVariable Long id){
        TModuleAim moduleAim = tModuleAimService.selectByPrimaryKey(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        //responseHeaders.add("select", "Welcome");
        return  new ResponseEntity<>(moduleAim,responseHeaders, HttpStatus.OK);
    }

    //select all records from the module aim table.
    @GetMapping("/selectAll")
    public ResponseEntity<List<TModuleAim>> selectAllModules(){
        List<TModuleAim> moduleAims = tModuleAimService.selectAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(moduleAims,responseHeaders,HttpStatus.OK);
    }
}
