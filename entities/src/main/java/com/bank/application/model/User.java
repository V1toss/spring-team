package com.bank.application.model;


import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Hincu Andrei (andreih1981@gmail.com)on 28.08.2018.
 * @version $Id$.
 * @since 0.1.
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
    @Enumerated(EnumType.ORDINAL)
    private TypeAccess typeAccess;

    /**
     * Активирован
     */
    private boolean activated;
    /**
     * Согласен с условиями использования
     */
    private boolean agreeTerms;
    /**
     * Заблокирован
     */
    private boolean locked;

    /**
     * Код активации
     */
    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "activation_code_id")
    private ActivationCode code;

    /**
     * Права пользователя
     */
    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "access_id")
    private Access access;

    /**
     * Настройки пуш сообщений
     */
    @OneToOne
    @JoinColumn(referencedColumnName = "id", name = "pushSettings_id")
    private PushSettings pushSettings;

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
}



