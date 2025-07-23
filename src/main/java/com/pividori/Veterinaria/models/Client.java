package com.pividori.Veterinaria.models;

import com.pividori.Veterinaria.enums.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Client {

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
    @NotBlank(message = "The phone number cannot be empty")
    @Column(nullable = false)
    private String phoneNumber;
    @Email(message = "The email must be in a valid format")
    private String email;
    @NotNull(message = "The gender cannot be empty")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Builder.Default
    private LocalDateTime createdAt;
    @ElementCollection
    private List<LocalDate> visit;
    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
