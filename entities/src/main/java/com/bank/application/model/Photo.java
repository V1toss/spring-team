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
@Table(name = "photo")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class Photo extends BaseEntityId {

    private String smallPhotoUrl;
    private String bigPhotoUrl;

}
