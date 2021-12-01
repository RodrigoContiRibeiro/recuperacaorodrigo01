package com.example.rodrigocontiribeiro.service;

import com.example.rodrigocontiribeiro.model.Produto;

import java.util.List;

public interface ProdutoService {
    public boolean save(Produto produto);

    public List<Produto> list();

    public boolean existsByNome(String nome);
}
