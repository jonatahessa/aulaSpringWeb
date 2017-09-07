package br.senac.tads4.dsw.exemplosspringjar.servercontroller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExemploController {

    @RequestMapping("/xpto")
    public String executar() {
        return "exemplo";
    }

    @RequestMapping("/xpto2")
    public String executar2(@RequestParam("nome") String nome,
            @RequestParam("idade") int idade,
            Model modelo) {
        modelo.addAttribute("nomeAttr", nome);
        modelo.addAttribute("idadeAttr", idade);
        return "exemplo2";
    }
    
    @RequestMapping("/produtos")
    public String listarProdutos(Model modelo) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto 1", new BigDecimal(9.99), new Date()));
        produtos.add(new Produto("Produto 2", new BigDecimal(5.99), new Date()));
        produtos.add(new Produto("Produto 3", new BigDecimal(6.99), new Date()));
        produtos.add(new Produto("Produto 4", new BigDecimal(7.99), new Date()));
        
        modelo.addAttribute("lista", produtos);
        return "lista";
    }
}
