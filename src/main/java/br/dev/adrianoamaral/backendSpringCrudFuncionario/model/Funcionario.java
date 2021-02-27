package br.dev.adrianoamaral.backendSpringCrudFuncionario.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nome;
    private String email;
    private String funcao;
    private String telefone;
    private String urlImagem;
    @Column(nullable = false, updatable = false)
    private String linguagem;

    public Funcionario(){}

    public Funcionario(String nome, String email, String funcao, String telefone, String urlImagem, String linguagem) {
        this.nome = nome;
        this.email = email;
        this.funcao = funcao;
        this.telefone = telefone;
        this.urlImagem = urlImagem;
        this.linguagem = linguagem;
    }

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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUrlImagem() {
        return urlImagem;
    }
    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getLinguagem() {
        return linguagem;
    }
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", funcao='" + funcao + '\'' +
                ", telefone='" + telefone + '\'' +
                ", urlImagem='" + urlImagem + '\'' +
                ", linguagem='" + linguagem + '\'' +
                '}';
    }
}
