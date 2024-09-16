package com.avito.backend.controllers;

import com.avito.backend.data.Tender;
import com.avito.backend.services.TenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nimatullah
 */
@RestController
@RequestMapping("/api/tenders")
public class TenderController {

    @Autowired
    private TenderService tenderService;

    @GetMapping
    public List<Tender> getAllTenders() {
        return tenderService.getAllTenders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tender> getTenderById(@PathVariable String id) {
        Tender tender = tenderService.getTenderById(id);
        return tender != null ? ResponseEntity.ok(tender) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Tender createTender(@RequestBody Tender tender) {
        return tenderService.saveTender(tender);
    }
}
