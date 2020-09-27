package eu.crystal.system;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// domain model
// just a plain container for user data
// it doesn't implement any other behavior
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String email;

    // constructors / standard setters / getters
}
