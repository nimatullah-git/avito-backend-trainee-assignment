package com.avito.backend.data;

import lombok.Data;
import javax.persistence.*;

/**
 * @author nimatullah
 */
@Data
@Entity
@Table(name = "organizations")
public class Organization {
    @Id
    private String id;
    private String name;
}
