package com.akulik.domain.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Accessors(chain = true)
@Document
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    private Integer id;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String firstname;
    @Indexed(direction = IndexDirection.ASCENDING)
    private String surname;

}
