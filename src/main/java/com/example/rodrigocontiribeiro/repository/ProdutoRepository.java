package com.example.rodrigocontiribeiro.repository;

import com.example.rodrigocontiribeiro.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    public boolean existsByNome(String nome);
}
