package com.lld.taxi.booking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
//Make classes Immutable: use only @Getter, you do not modify id/name of the rider often.
public class Rider {
    private String id;
    private String name;
}
