package br.com.thesociety.model.dto;

import br.com.thesociety.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClienteDTO {

    @NotBlank
    private String nome;

    private String cpf;

    private String dataNascimento;

    private String sexo;

    private String telefone;

    private String endereco;

    private String cep;

    public Cliente toCadastroCliente() {
        Cliente cliente = new Cliente();
        cliente.setCep(cep);
        cliente.setCpf(cpf);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        cliente.setDataNascimento(LocalDate.parse(dataNascimento,formatador));
        cliente.setEndereco(endereco);
        cliente.setNome(nome);
        cliente.setSexo(sexo);
        cliente.setTelefone(telefone);
        return cliente;
    }
}
