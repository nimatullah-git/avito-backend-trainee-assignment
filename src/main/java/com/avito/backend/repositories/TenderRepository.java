package com.avito.backend.repositories;

import com.avito.backend.data.Tender;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nimatullah
 */
public interface TenderRepository extends JpaRepository<Tender, String> {
}
