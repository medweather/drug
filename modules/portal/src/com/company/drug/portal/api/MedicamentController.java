package com.company.drug.portal.api;

import com.company.drug.entity.Medicament;
import com.company.drug.entityApi.MedicamentInfo;
import com.company.drug.service.MedicamentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
@RequestMapping("medicament")
public class MedicamentController {

    @Inject
    protected MedicamentService medicamentService;

    @GetMapping("/all")
    @ResponseBody
    public ResponseEntity getAllMedicament() {
        return new ResponseEntity<>(medicamentService.getAllMedicamentInfo(), HttpStatus.OK);
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity createMedicament(@RequestBody MedicamentInfo medicamentInfo) {
        Medicament medicament = medicamentService.createMedicament(medicamentInfo);
        return medicament != null ? new ResponseEntity(HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete/{uuid}")
    @ResponseBody
    public ResponseEntity deleteMedicament(@PathVariable String uuid) {
        medicamentService.deleteMedicament(uuid);
        return new ResponseEntity(HttpStatus.OK);
    }
}
