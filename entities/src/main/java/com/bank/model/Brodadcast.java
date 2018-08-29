package com.bank.model;

import lombok.*;

import java.sql.Timestamp;

/**
 * Broadcast class.
 *
 * @author Baranov Roman
 * @version 1.00
 * @since 29.08.2018
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Brodadcast extends NewsLine {

    private Timestamp startTime;
    private Timestamp finishTime;
}
