package com.avito.backend.validators;

import com.avito.backend.data.Bid;
import org.springframework.stereotype.Component;

/**
 * @author nimatullah
 */
@Component
public class BidValidator {

    public boolean isValid(Bid bid) {
        return bid.getAmount() > 0;
    }
}
