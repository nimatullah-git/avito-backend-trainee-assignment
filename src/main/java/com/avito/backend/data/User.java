package com.avito.backend.data;

import lombok.Data;
import javax.persistence.*;

/**
 * @author nimatullah
 */
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String organizationId;
}
