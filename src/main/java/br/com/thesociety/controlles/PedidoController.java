package br.com.thesociety.controlles;


import br.com.thesociety.model.Cliente;
import br.com.thesociety.model.dto.ClienteDTO;
import br.com.thesociety.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {


    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/formulario")
    public String formulario(){
        System.out.println("Formulario");
        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(ClienteDTO request){

        Cliente cliente = request.toCadastroCliente();

            clienteRepository.save(cliente);
        return "pedido/formulario";
    }


}
