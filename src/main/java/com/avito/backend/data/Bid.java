package com.avito.backend.data;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

/**
 * @author nimatullah
 */
@Data
@Entity
@Table(name = "bids")
public class Bid {
    @Id
    private String id;
    private String tenderId;
    private String userId;
    private double amount;
    private Date submittedAt;

    @ManyToOne
    @JoinColumn(name = "tenderId", insertable = false, updatable = false)
    private Tender tender;
}
