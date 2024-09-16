package com.avito.backend.services;

import com.avito.backend.data.Bid;
import com.avito.backend.repositories.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nimatullah
 */
@Service
public class BidService {

    @Autowired
    private BidRepository bidRepository;

    public List<Bid> getBidsByTenderId(String tenderId) {
        return bidRepository.findByTenderId(tenderId);
    }

    public Bid getBidById(String id) {
        return bidRepository.findById(id).orElse(null);
    }

    public Bid saveBid(Bid bid) {
        return bidRepository.save(bid);
    }
}
