package com.ocs.medilabo_patient.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;


    @Column(name = "prenom")
    @NotBlank(message= " Le prénom est obligatoire")
    private String prenom;


    @Column(name = "nom")
    @NotBlank(message= " Le nom est obligatoire")
    private String nom;


    @Column(name = "date_de_naissance")
    private LocalDate dateDeNaissance;


    @Column(name = "genre")
    @Enumerated(EnumType.STRING)
    @NotNull(message= " Le genre est obligatoire")
    private Genre genre;

    @Column(name = "adresse_postale")
    private String adressePostale;

    @Column(name = "numero_telephone")
    private String numeroTelephone;


}