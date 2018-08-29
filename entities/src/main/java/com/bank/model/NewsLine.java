package com.bank.model;

import lombok.*;

/**
 * NewsLine class.
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
@EqualsAndHashCode
@ToString
public class NewsLine {

    private long id;
    private String title;
    private String link;
    private String lang;
}
