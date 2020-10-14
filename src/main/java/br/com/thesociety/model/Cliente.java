package br.com.thesociety.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private LocalDate dataNascimento;

    @Column
    private String sexo;

    @Column
    private String telefone;

    @Column
    private String endereco;

    @Column
    private String cep;


}
