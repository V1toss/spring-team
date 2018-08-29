package com.bank.model;

import lombok.*;

import java.sql.Timestamp;

/**
 * News class.
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
public class News extends NewsLine {

    private NewsType type;
    private byte[] titleImage;
    private String content;
    private Timestamp timeAdded;
    private String source;
}
