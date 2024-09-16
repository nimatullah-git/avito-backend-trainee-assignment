package com.avito.backend.controllers;

import com.avito.backend.data.Bid;
import com.avito.backend.services.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nimatullah
 */
@RestController
@RequestMapping("/api/bids")
public class BidController {

    @Autowired
    private BidService bidService;

    @GetMapping("/tender/{tenderId}")
    public List<Bid> getBidsByTenderId(@PathVariable String tenderId) {
        return bidService.getBidsByTenderId(tenderId);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bid> getBidById(@PathVariable String id) {
        Bid bid = bidService.getBidById(id);
        return bid != null ? ResponseEntity.ok(bid) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Bid createBid(@RequestBody Bid bid) {
        return bidService.saveBid(bid);
    }
}
