package com.smoreira.selecaocronapp.model.entity;

import com.smoreira.selecaocronapp.model.TipoPessoaEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PESSOA")
public class Pessoa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;

    private Date dataNascimento;

    private TipoPessoaEnum tipoPessoaEnum;

    private String cpfCnpj;

    public Pessoa() {
    }

    public Pessoa(String nome, Date dataNascimento, TipoPessoaEnum tipoPessoaEnum, String cpfCnpj) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.tipoPessoaEnum = tipoPessoaEnum;
        this.cpfCnpj = cpfCnpj;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public TipoPessoaEnum getTipoPessoaEnum() {
        return this.tipoPessoaEnum;
    }

    public void setTipoPessoaEnum(TipoPessoaEnum tipoPessoaEnum) {
        this.tipoPessoaEnum = tipoPessoaEnum;
    }

    public String getCpfCnpj() {
        return this.cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return this.id == pessoa.id;
    }

    @Override
    public int hashCode() {
        return (int) (this.id ^ (this.id >>> 32));
    }
}
