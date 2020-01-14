package uk.ac.sheffield.coursemgr.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramKnowledgeToModuleLo;
import uk.ac.sheffield.coursemgr.service.TProgramKnowledgeToModuleLoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for the relation between program knowledge and the LO>
 */
@RestController
@RequestMapping("/api/programKnowledgeLo")
public class ProgramKnowledgeToModuleLoController {

    @Resource
    private TProgramKnowledgeToModuleLoService tProgramKnowledgeToModuleLoService;

    @DeleteMapping("/delete/{knowledgeId},{loId}")
    public void deleteProgramKnowledgeLoById(@PathVariable Long knowledgeId, @PathVariable Long loId){
        tProgramKnowledgeToModuleLoService.deleteProgramKnowledgeLoById(loId);
    }

    @PostMapping("/insert/{loId}")
    public ResponseEntity insert(@PathVariable Long loId, @RequestBody List<TProgramKnowledgeToModuleLo> tProgramKnowledgeToModuleLo){

        // First: Delete all Skills belonged to this content
        tProgramKnowledgeToModuleLoService.deleteProgramKnowledgeLoById(loId);
        List<TProgramKnowledgeToModuleLo> tProgramKnowledgeToModuleLos = new ArrayList<>();
        for (TProgramKnowledgeToModuleLo Relation:tProgramKnowledgeToModuleLo) {
            Long id = CommonUtils.nextId();
            Relation.setId(id);
            // Second: Insert new relation
            tProgramKnowledgeToModuleLoService.insert(Relation);
            tProgramKnowledgeToModuleLos.add(Relation);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramKnowledgeToModuleLos,responseHeaders, HttpStatus.OK);
    }
}
