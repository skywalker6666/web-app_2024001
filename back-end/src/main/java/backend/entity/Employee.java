package backend.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String email;

}