package com.smoreira.selecaocronapp.controller;

import com.smoreira.selecaocronapp.model.entity.Pessoa;
import com.smoreira.selecaocronapp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(pessoaRepository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{nome}" ,method = RequestMethod.GET)
    public ResponseEntity<?> getByName(@PathVariable String nome){
        return new ResponseEntity(pessoaRepository.findByNome(nome), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Pessoa pessoa){
        return new ResponseEntity(pessoaRepository.save(pessoa), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<?> remove(@PathVariable Long id){
        pessoaRepository.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
