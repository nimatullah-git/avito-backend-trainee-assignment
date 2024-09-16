package com.avito.backend.validators;

import com.avito.backend.data.Tender;
import org.springframework.stereotype.Component;

/**
 * @author nimatullah
 */
@Component
public class TenderValidator {

    public boolean isValid(Tender tender) {
        return tender.getName() != null && !tender.getName().isEmpty() &&
                tender.getServiceType() != null && !tender.getServiceType().isEmpty();
    }
}
