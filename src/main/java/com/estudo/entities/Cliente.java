package com.estudo.entities;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name="NOME")
    private String nome;

    @Column(name="TELEFONE")
    private String telefone;

    @Column(name="EMAIL")
    private String email;

    @Column(name="CPF")
    private String cpf;

    @Column(name="SEXO")
    private String sexo;

    @OneToOne(mappedBy = "id")
    private TipoCliente tipoCliente;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
