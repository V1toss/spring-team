package com.bank.application.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 28.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Data
@Entity
@Table(name = "base_entity")
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntityId {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Enumerated(EnumType.ORDINAL)
    private EntityType entityType;

    private Timestamp created;

    private Timestamp update;

    private User author;


}
