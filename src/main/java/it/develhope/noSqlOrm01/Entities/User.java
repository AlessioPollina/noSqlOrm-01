package it.develhope.noSqlOrm01.Entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {

    @Id
    private String id;
    private String lastName;
    private String firstName;
    private String cityOfBirth;
    private String yearOfBirth;
}
