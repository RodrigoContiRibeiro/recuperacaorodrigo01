package com.example.rodrigocontiribeiro.controller;

import com.example.rodrigocontiribeiro.service.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
    @Autowired
    ProdutoServiceImpl produtoService;

    @GetMapping("/produtos")
    public String list(Model model) {
        model.addAttribute("produtos", produtoService.list());

        return "list";
    }
}
