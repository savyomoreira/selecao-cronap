package com.smoreira.selecaocronapp.model;

public enum TipoPessoaEnum {

    PESSOA_FISICA(""),
    PESSOA_JURIDICA("");

    String descricao;

    TipoPessoaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
