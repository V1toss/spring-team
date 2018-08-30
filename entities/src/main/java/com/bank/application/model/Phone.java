package com.bank.application.model;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 28.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Data
@Entity
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Phone extends BaseEntityId {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String telefonNumder1;
    private String telefonNumder2;
    private String telefonNumder3;

}
