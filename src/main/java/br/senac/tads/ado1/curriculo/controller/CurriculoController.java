package br.senac.tads.ado1.curriculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/curriculo")
public class CurriculoController {
    @GetMapping("/getCurriculo")
    public ModelAndView saudar2() {
        ModelAndView mv = new ModelAndView("Curriculo");
        mv.addObject("nome", "Isabela Midori Minami Rodrigues Mesquita");
        mv.addObject("skil", "HTML, CSS, Javascript, React");
        mv.addObject("email", "isabela_rodrigues97@gmail.com");
        mv.addObject("telefone", "(11) 94539-0855");
        mv.addObject("idade", "26 Anos");
        mv.addObject("civil", "Casada");

        mv.addObject("objetivo", "Desenvolver-me continuamente na área de Tecnologia da Informação focanddo principalmente " +
                "em desenvolvimento web");
        mv.addObject("cursos", "Inglês - Ilac, " +
                "Análise e Desenvilvimento de Sistemas - Senac");
        mv.addObject("idioma", "Inglês: Avaçado.");
        mv.addObject("github", "https://github.com/isamidori");

        return mv;
    }

}
