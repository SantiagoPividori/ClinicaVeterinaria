package com.pividori.Veterinaria.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pet {

    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "The name cannot be empty")
    private String name;
    @NotNull(message = "The birthday cannot be empty")
    private LocalDate birthday;
    @NotBlank(message = "The status cannot be empty")
    private String status;
    @NotNull(message = "The owner cannot be empty")
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Client owner;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
