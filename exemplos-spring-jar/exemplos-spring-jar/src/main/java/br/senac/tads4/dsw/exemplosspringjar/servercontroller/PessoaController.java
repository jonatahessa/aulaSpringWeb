/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads4.dsw.exemplosspringjar.servercontroller;

import br.senac.tads4.dsw.exemplosspringjar.modelo.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author jonata.hmoliveira
 */
@Controller
@RequestMapping("/Pessoa")
public class PessoaController {
    
    @RequestMapping("/input")
    public ModelAndView mostrarFormulario() {
       ModelAndView resultado = new ModelAndView("formulario");
       resultado.addObject("Pessoa", new Pessoa());
       return resultado;
    }
    
    @RequestMapping("/input/{id}")
    public ModelAndView mostrarFormularioEdicao(
    @PathVariable("id") Long id) {
        Pessoa p = new Pessoa();
        p.setNome("Thales");
        p.setIdade(24);
        p.setSexo(2);
        p.setPreferencias(new String[] {"Viagens", "Gastronomia"});
        p.setContato(true);
        
        return new ModelAndView("formulario").addObject("Pessoa", p);
        
    }
    
    @RequestMapping(value = "/salvar", method = RequestMethod.POST)
    public ModelAndView salvar(@ModelAttribute Pessoa p, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("Pessoa", p);
        return new ModelAndView("redirect:/Pessoa/resultado");
    }
    
    @RequestMapping("/resultado")
    public ModelAndView mostrarResultado() {
        return new ModelAndView("resultado");
    }
}
