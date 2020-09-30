package br.com.thesociety.model.dto;

import br.com.thesociety.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClienteDTO {

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
        cliente.setDataNascimento(LocalDate.parse(dataNascimento));
        cliente.setEndereco(endereco);
        cliente.setNome(nome);
        cliente.setSexo(sexo);
        cliente.setTelefone(telefone);
        return cliente;
    }
}
