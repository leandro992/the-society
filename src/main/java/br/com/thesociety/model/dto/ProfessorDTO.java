package br.com.thesociety.model.dto;


import br.com.thesociety.model.Professor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProfessorDTO {

    private String nome;

    private String cpf;

    private String sexo;

    private String endereco;

    private String telefone;

    private String dataNascimento;

    private String periodoAula;

    private String tipoAula;

    private String numeroCref;


    public Professor toCadastroProfessor(){
        Professor professor = new Professor();
        professor.setCpf(cpf);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        professor.setDataNascimento(LocalDate.parse(dataNascimento,formatador));
        professor.setEndereco(endereco);
        professor.setNome(nome);
        professor.setNumeroCref(numeroCref);
        professor.setPeriodoAula(periodoAula);
        professor.setSexo(sexo);
        professor.setTelefone(telefone);
        professor.setTipoAula(tipoAula);
        return professor;
    }


}
