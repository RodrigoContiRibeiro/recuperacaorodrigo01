package com.example.rodrigocontiribeiro.service;

import com.example.rodrigocontiribeiro.model.Produto;
import com.example.rodrigocontiribeiro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public boolean save(Produto produto) {
        try {
            produtoRepository.save(produto);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<Produto> list() {
        return produtoRepository.findAll();
    }

    @Override
    public boolean existsByNome(String nome) {
        return produtoRepository.existsByNome(nome);
    }
}
