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
@Table(name = "panel_access")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class PanelAccess {

    /**
     * Имя набора
     */
    private String name;
    /**
     * Доступ к редактированию новостей
     */
    private boolean news;
    /**
     * Доступ к столовой
     */
    private boolean diningRoom;
    /**
     * Доступ к редактированию заказа еды
     */
    private boolean orderFood;
    /**
     * Доступ к редактированию заказа такси
     */
    private boolean taxiOrder;
    /**
     * Доступ к редактированию бонусной программы
     */
    private boolean bonusProgramm;

}
