package com.bank.model;

import lombok.Data;

import javax.persistence.*;

/**
 * NewsLine class.
 *
 * @author Baranov Roman
 * @version 1.00
 * @since 29.08.2018
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "NewsLine", indexes = {
        @Index(name = "idx_newsLine_id_title", columnList = "id, title")
})
public class NewsLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String title;
    @Column
    private String link;
    @Column
    private String lang;
}
