package com.bank.application.model;

import lombok.Data;
import org.hibernate.annotations.Type;
import javax.persistence.*;
import java.time.OffsetDateTime;

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

    @Enumerated(EnumType.STRING)
    private EntityType entityType;

    @Type(type = "org.hibernate.type.OffsetDateTimeType")
    private OffsetDateTime created;

    @Type(type = "org.hibernate.type.OffsetDateTimeType")
    private OffsetDateTime update;

    private User author;


}
