package com.avito.backend.services;

import com.avito.backend.data.Tender;
import com.avito.backend.repositories.TenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nimatullah
 */
@Service
public class TenderService {

    @Autowired
    private TenderRepository tenderRepository;

    public List<Tender> getAllTenders() {
        return tenderRepository.findAll();
    }

    public Tender getTenderById(String id) {
        return tenderRepository.findById(id).orElse(null);
    }

    public Tender saveTender(Tender tender) {
        return tenderRepository.save(tender);
    }
}
