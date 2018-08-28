package com.bank.application.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 28.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Getter @Setter
@Entity
@Table(name = "base_entity")
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseEntityId {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Enumerated(EnumType.ORDINAL)
    private EntityType entityType;



}