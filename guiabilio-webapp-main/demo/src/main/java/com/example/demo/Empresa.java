package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "RazaoSocial")
    private String razaosocial;

    @Column(name = "email")
    private String email;

}