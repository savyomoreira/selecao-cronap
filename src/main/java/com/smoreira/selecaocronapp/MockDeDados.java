package com.smoreira.selecaocronapp;

import com.smoreira.selecaocronapp.model.TipoPessoaEnum;
import com.smoreira.selecaocronapp.model.entity.Pessoa;
import com.smoreira.selecaocronapp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class MockDeDados {

    List<Pessoa> pessoaList = Arrays.asList(
            new Pessoa("Teste 1", new Date(), TipoPessoaEnum.PESSOA_FISICA, "123456789"),
            new Pessoa("Teste 2", new Date(), TipoPessoaEnum.PESSOA_JURIDICA, "123456789"),
            new Pessoa("Teste 3", new Date(), TipoPessoaEnum.PESSOA_FISICA,"123456789")
    );

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostConstruct
    public void init(){

        pessoaList.forEach( pessoa -> {
            pessoaRepository.save(pessoa);
        });
    }
}
