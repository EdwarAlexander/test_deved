package com.deved.api.Response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PersonDTO {
    private Long id;
    private String name;
    private int age;
}
