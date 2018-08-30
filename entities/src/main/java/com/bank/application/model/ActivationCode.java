package com.bank.application.model;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 30.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Data
@Entity
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class ActivationCode {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String code;
    private Timestamp created;

}
