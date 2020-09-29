package br.com.thesociety.controlles;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {


    @GetMapping("/formulario")
    public String formulario(){
        System.out.println("Formulario");
        return "pedido/formulario";
    }


}
