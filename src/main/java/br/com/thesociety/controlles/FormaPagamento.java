package br.com.thesociety.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class FormaPagamento {

    @GetMapping("/formaPagamento")
    public String home() {
        System.out.println("Forma de pagamento");
        return "planoPagamento";
    }

}
