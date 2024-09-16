package com.avito.backend.repositories;

import com.avito.backend.data.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nimatullah
 */
public interface BidRepository extends JpaRepository<Bid, String> {
    List<Bid> findByTenderId(String tenderId);
}
