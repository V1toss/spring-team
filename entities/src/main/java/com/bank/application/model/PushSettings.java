package com.bank.application.model;

import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 30.08.2018.
 * @version $Id$.
 * @since 0.1.
 */
@Entity
@Data
@Table(name = "push_settings")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class PushSettings extends BaseEntityId {

    private boolean news;
    private boolean message;
}
