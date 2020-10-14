package br.com.thesociety.controlles;


import br.com.thesociety.model.Professor;
import br.com.thesociety.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("agenda")
public class AgendaProfessorController {


    @Autowired
    private ProfessorRepository professorRepository;


    @GetMapping("/agendaProfessor")
    public String cronograma() {
        System.out.println("Agenda");
        return "pedido/agendaProfessor";
    }



    @GetMapping(value =  "/professor" )
    public String selectOptionExample1Page(Model model) {

      //  model.addAttribute("professor", new Professor());

        List<Professor> professors = professorRepository.findAll();
        model.addAttribute("professor", professors);

        return "pedido/agendaProfessor";
    }




}
