package com.bank.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.time.OffsetDateTime;

/**
 * Broadcast class.
 *
 * @author Baranov Roman
 * @version 1.00
 * @since 29.08.2018
 */
@Data
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@Entity
@Table(name = "Brodadcast")
public class Brodadcast extends NewsLine {

    @Column
    @Type(type = "OffsetDateTimeType")
    private OffsetDateTime startTime;
    @Column
    @Type(type = "OffsetDateTimeType")
    private OffsetDateTime finishTime;
}
