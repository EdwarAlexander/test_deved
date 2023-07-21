package com.deved.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Person {

    private Long id;

    private String name;

    private int age;
}
