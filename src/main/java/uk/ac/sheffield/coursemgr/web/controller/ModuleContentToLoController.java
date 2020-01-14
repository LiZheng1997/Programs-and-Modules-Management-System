package uk.ac.sheffield.coursemgr.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TModuleContentToLo;
import uk.ac.sheffield.coursemgr.service.TModuleContentToLoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for the relation between the content to LO.
 */
@RestController
@RequestMapping("/api/moduleContentLO")
public class ModuleContentToLoController {

    @Resource
    private TModuleContentToLoService tModuleContentToLoService;

    //delete a record.
    @DeleteMapping("/delete")
    public void deleteModuleContentLoById( @RequestBody TModuleContentToLo tModuleContentToLo){
        Long LoId  = tModuleContentToLo.getModuleLoId();
        tModuleContentToLoService.deleteModuleContentLoById(LoId);
    }

    // insert all relations through a id list.
    @PostMapping("/insert/{contentId}")
    public ResponseEntity<List<TModuleContentToLo>> insertModuleContentLo(@PathVariable Long contentId,@RequestBody List<TModuleContentToLo> tModuleContentToLo){
        // First: Delete all LOs belonged to this content
        tModuleContentToLoService.deleteModuleContentLoById(contentId);
        List<TModuleContentToLo> tModuleContentToLos = new ArrayList<>();
        for (TModuleContentToLo Relation:tModuleContentToLo) {
            Long id = CommonUtils.nextId();
            Relation.setId(id);
            // Second: Insert new relation
            tModuleContentToLoService.insertModuleContentLo(Relation);
            tModuleContentToLos.add(Relation);
        }
//        String recordId = LongIdToStringId.toStringId(id);
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tModuleContentToLos,responseHeaders, HttpStatus.OK);
    }
}
