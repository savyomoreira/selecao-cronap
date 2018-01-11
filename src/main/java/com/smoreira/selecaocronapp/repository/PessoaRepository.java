package com.smoreira.selecaocronapp.repository;

import com.smoreira.selecaocronapp.model.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findByNome(@Param("nome")String nome);
}
