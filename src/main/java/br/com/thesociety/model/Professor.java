package br.com.thesociety.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_professor")
public class Professor {

    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
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
