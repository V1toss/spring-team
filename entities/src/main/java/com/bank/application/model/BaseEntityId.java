package com.bank.application.model;

import com.bank.application.listeners.CreatedDate;
import com.bank.application.listeners.EntityListener;
import com.bank.application.listeners.UpdateDate;
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
@EntityListeners(EntityListener.class)
public class BaseEntityId {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Enumerated(EnumType.STRING)
    private EntityType entityType;

    @CreatedDate
    @Type(type = "org.hibernate.type.OffsetDateTimeType")
    private OffsetDateTime created;

    @UpdateDate
    @Type(type = "org.hibernate.type.OffsetDateTimeType")
    private OffsetDateTime update;

    private User author;


}