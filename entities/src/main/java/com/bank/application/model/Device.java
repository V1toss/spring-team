package com.bank.application.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 28.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Entity
@Data
@Table(name = "device")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Device extends BaseEntityId {

    private String uuid;
    private String activationCode;
    private String token;
}
