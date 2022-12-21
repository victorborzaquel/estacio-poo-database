package com.victor.estaciopoodatabase.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "ALUNO")
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.NONE)
    @Column(name = "MATRICULA", unique = true, length = 36)
    private String matricula;
    @Column(name = "NOME", length = 40)
    private String nome;
    @Column(name = "ENTRADA")
    private Integer entrada;
}
