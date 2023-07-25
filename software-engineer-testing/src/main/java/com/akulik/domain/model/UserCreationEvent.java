package com.akulik.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class UserCreationEvent {

    private Integer id;
    private String firstname;
    private String surname;

}
