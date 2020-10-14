package br.com.thesociety.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "tb_professor")
public class LoginForm {

    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column
    private String nome;

    @Column
    private String senha;

}
