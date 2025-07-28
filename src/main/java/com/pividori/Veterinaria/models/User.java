package com.pividori.Veterinaria.models;

import com.pividori.Veterinaria.util.Gender;
import com.pividori.Veterinaria.util.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The name cannot be empty")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "The lastname cannot be empty")
    @Column(nullable = false)
    private String lastname;

    @NotBlank(message = "The address cannot be empty")
    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phoneNumber;

    @NotBlank(message = "The email cannot be empty")
    @Email(message = "The email must be in a valid format")
    private String email;

    @NotNull(message = "The gender cannot be empty")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    private LocalDateTime createdAt = LocalDateTime.now();

    @NotNull(message = "The rol cannot be empty")
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @PositiveOrZero(message = "The salary cannot be less than 0")
    @Column(nullable = false)
    private BigDecimal salary;

    @NotBlank(message = "The username cannot be empty")
    @Size(min = 2, max = 50)
    @Column(nullable = false, unique = true)
    private String username;

    @NotBlank(message = "The password cannot be empty")
    @Size(min = 5, max = 50)
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "The nationality cannot be empty")
    private String nationality;

    @NotBlank(message = "The DNI cannot be empty")
    @Size(min = 6, max = 9)
    private String nationalId;

    @NotNull(message = "The birthday cannot be empty")
    private LocalDate birthdate;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Token> tokenList;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
