package com.example.tenderbid.data;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author nimatullah
 */
@Data
@Entity
@Table(name = "tenders")
public class Tender {
    @Id
    private String id;
    private String name;
    private String description;
    private String serviceType;
    private String status;
    private String organizationId;
    private int version;
    private Date createdAt;

    @OneToMany(mappedBy = "tender")
    private List<Bid> bids;
}
