package org.springframework.samples.petclinic.care;


import lombok.AccessLevel;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@Entity
public class CareProvision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Pattern(regexp = "^Care rated with [0-9] stars.*$")
    String userRating;

    @ManyToOne(optional = true)
    Visit visit;

    @ManyToOne
    @NotNull
    Care care;

}
