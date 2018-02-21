package com.dev.upsilon.dto;

import com.dev.upsilon.entity.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * @author Andriy Kuzmin
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class UserDTO extends User {

    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String firstName;
    @NotNull
    @NotBlank
    private String lastName;
    @NotNull
    @NotBlank
    private String userName;

    public UserDTO(User user) {
        this.setId(user.getId());
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setUserName(user.getUserName());
    }

    public UserDTO() {
    }
}
