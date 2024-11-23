package br.com.fiap.distribuidoras.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Distribuidora {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = true, length = 60)
    private String razaoSocial;

    @Column(nullable = true, length = 25)
    private String cnpj;

    @Column(nullable = true, length = 100)
    private String endereco;

    @Column(nullable = true)
    private Long porc_energia_limpa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getrazaoSocial() {
        return razaoSocial;
    }

    public void setrazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getPorc_energia_limpa() {
        return porc_energia_limpa;
    }

    public void setPorc_energia_limpa(Long porc_energia_limpa) {
        this.porc_energia_limpa = porc_energia_limpa;
    }


    

}