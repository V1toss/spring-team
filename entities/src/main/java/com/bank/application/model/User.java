package com.bank.application.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 28.08.2018.
 * @version $Id$.
 * @since 0.2.
 */
@Data
@Entity
@Table(name = "users", indexes = {
        @Index(name = "users_email", columnList = "email", unique = true)
})
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
public class User extends BaseEntityId {

    /**
     * Емаил.
     */
    private String email;

    /**
     * Тип пользователя внутренний или наружный
     */
    @Enumerated(EnumType.STRING)
    private TypeAccess typeAccess;

    /**
     * Активирован
     */
    private Boolean activated;
    /**
     * Согласен с условиями использования
     */
    private Boolean agreeTerms;
    /**
     * Заблокирован
     */
    private Boolean locked;

    /**
     * Права пользователя
     */
   @Enumerated(EnumType.STRING)
    private Access access;

    /**
     * Фамилия (на языке ввода)
     */
    private String lastNameLocal;

    /**
     * Фамилия (на лат.)
     */
    private String lastNameLatin;
    /**
     * Имя (на языке ввода)
     */
    private String nameLocal;
    /**
     * Имя (на лат.)
     */
    private String nameLatin;
    /**
     * Отчечтво (на языке ввода)
     */
    private String patronymicLocal;
    /**
     * Отчечтво (на лат.)
     */
    private String patronymicLatin;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Phone> phones = new ArrayList<>();

    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "id_photo")
    private Photo photo;

    /**
     * Тип доступа пользователя
     */
    public enum TypeAccess {
        INTERNAL, EXTERNAL
    }


    public enum Access {
        ADMINISTRATOR, CONTENT_MANAGER
    }
}



