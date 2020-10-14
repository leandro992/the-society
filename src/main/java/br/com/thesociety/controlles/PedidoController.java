package br.com.thesociety.controlles;


import br.com.thesociety.model.Cliente;
import br.com.thesociety.model.Professor;
import br.com.thesociety.model.dto.ClienteDTO;
import br.com.thesociety.model.dto.ProfessorDTO;
import br.com.thesociety.repository.ClienteRepository;
import br.com.thesociety.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/formulario")
    public String formulario() {
        System.out.println("Formulario");
        return "pedido/formulario";
    }

    @PostMapping("/novo")
    public String novo(@Valid ClienteDTO request, BindingResult result) {
        if (result.hasErrors()) { return "pedido/formulario"; }
        Cliente cliente = request.toCadastroCliente();
        clienteRepository.save(cliente);
        return "pedido/formulario";
    }


    @PostMapping("/novoProfessor")
    public String novoProfessor(ProfessorDTO professorDTO) {
        System.out.println("formularioProfessor");
        Professor professor = professorDTO.toCadastroProfessor();
        professorRepository.save(professor);
        return "pedido/formularioProfessor";
    }


    @GetMapping("/formularioProfessor")
    public String formularioProfessor() {
        System.out.println("formularioProfessor");
        return "pedido/formularioProfessor";
    }

}
