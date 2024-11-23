package br.com.fiap.distribuidoras.dtos;

import org.modelmapper.ModelMapper;

import br.com.fiap.distribuidoras.model.Distribuidora;

public class DistribuidoraRequestCreateDto {

    private Long id;
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private Long porc_energia_limpa;

    public static final ModelMapper modelMapper = new ModelMapper();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
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

    public Distribuidora toModel() {
        return modelMapper.map(this, Distribuidora.class);
    }


    
    
}
