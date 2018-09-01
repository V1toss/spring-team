package com.bank.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.OffsetDateTime;

/**
 * News class.
 *
 * @author Baranov Roman
 * @version 1.00
 * @since 29.08.2018
 */
@Data
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Entity
@Table(name = "News", indexes = {
        @Index(name = "idx_news_type", columnList = "type"),
        @Index(name = "idx_news_source", columnList = "source")
})
public class News extends NewsLine {

    @Column(nullable = false)
    private NewsType type;
    @Column
    private String imgRelativePath;
    @Column
    private String content;
    @Column
    @Type(type = "OffsetDateTimeType")
    private OffsetDateTime timeAdded;
    @Column
    private String source;
}
