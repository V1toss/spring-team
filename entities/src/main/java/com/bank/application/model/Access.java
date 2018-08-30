package com.bank.application.model;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.*;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 30.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Entity
@Data
@Table(name = "access")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Access extends BaseEntityId {

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private boolean administrator;
    private boolean contentManager;
}
