package br.com.thesociety.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String sexo;

    @Column
    private String endereco;

    @Column
    private String telefone;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String periodoAula;

    @Column
    private String tipoAula;

    @Column
    private String NumeroCref;


}
