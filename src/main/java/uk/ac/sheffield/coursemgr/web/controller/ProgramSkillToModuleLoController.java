package uk.ac.sheffield.coursemgr.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.sheffield.coursemgr.common.utils.CommonUtils;
import uk.ac.sheffield.coursemgr.common.utils.LongIdToStringId;
import uk.ac.sheffield.coursemgr.domain.pojo.TProgramSkillToModuleLo;
import uk.ac.sheffield.coursemgr.service.TProgramSkillToModuleLoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a controller for the relation between the program skill and LO.
 */
@RestController
@RequestMapping("/api/programSkillLo")
public class ProgramSkillToModuleLoController {

    @Resource
    private TProgramSkillToModuleLoService tProgramSkillToModuleLoService;

    @DeleteMapping("/delete/{skillId},{loId}")
    public void deleteProgramSkillLoById(@PathVariable Long skillId, @PathVariable Long loId){
        tProgramSkillToModuleLoService.deleteProgramSkillLoById(loId);
    }

//    @PutMapping("/insert")
//    public ResponseEntity insert(@RequestBody TProgramSkillToModuleLo tProgramSkillToModuleLo){
//        Long id = CommonUtils.nextId();
//        tProgramSkillToModuleLo.setId(id);
//        tProgramSkillToModuleLoService.insert(tProgramSkillToModuleLo);
//        //String recordId = LongIdToStringId.toStringId(id);
//        HttpHeaders responseHeaders = new HttpHeaders();
//        return new ResponseEntity<>(tProgramSkillToModuleLo,responseHeaders, HttpStatus.OK);
//    }
@PostMapping("/insert/{loId}")
    public ResponseEntity insert(@PathVariable Long loId, @RequestBody List<TProgramSkillToModuleLo> tProgramSkillToModuleLo){

        // First: Delete all Skills belonged to this content
        tProgramSkillToModuleLoService.deleteProgramSkillLoById(loId);
        List<TProgramSkillToModuleLo> tProgramSkillToModuleLos = new ArrayList<>();
        for (TProgramSkillToModuleLo Relation:tProgramSkillToModuleLo) {
            Long id = CommonUtils.nextId();
            Relation.setId(id);
            // Second: Insert new relation
            tProgramSkillToModuleLoService.insert(Relation);
            tProgramSkillToModuleLos.add(Relation);
        }
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>(tProgramSkillToModuleLos,responseHeaders, HttpStatus.OK);
    }
}
