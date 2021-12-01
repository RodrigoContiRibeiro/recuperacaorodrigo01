package com.example.rodrigocontiribeiro;

import com.example.rodrigocontiribeiro.model.Produto;
import com.example.rodrigocontiribeiro.service.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitialData implements CommandLineRunner {
    @Autowired
    ProdutoServiceImpl produtoService;

    @Override
    public void run(String... args) throws Exception {
        Produto p1 = new Produto("Pão", 10.55);
        Produto p2 = new Produto("Espaguete", 5.67);
        Produto p3 = new Produto("Lasanha", 0.8);
        Produto p4 = new Produto("Capeletti", 1.90);
        Produto p5 = new Produto("Linguine", 5.55);
        Produto p6 = new Produto("Fusilli", 6.66);

        if (produtoService.existsByNome("Pão")) {
            // If there already has one of those products,
            // doesn't save anything
            System.out.println("Initial batch of products is already persisted");
            return;
        } else {
            List<Produto> produtos = new ArrayList<>();
            produtos.add(p1);
            produtos.add(p2);
            produtos.add(p3);
            produtos.add(p4);
            produtos.add(p5);
            produtos.add(p6);

            for (Produto produto : produtos) {
                produtoService.save(produto);
            }
            System.out.println("Persisted the initial batch of products");
        }
    }
}
