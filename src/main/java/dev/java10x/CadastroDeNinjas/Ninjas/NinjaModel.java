package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missaoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// JPA = Java Persistence API
// Entity transforma uma classe em uma entidade do DB
@Entity
@Table(name = "tb_cadastro") // Table serve pra nomear a tabela e como boa pratica se começa com tb e com snack case
public class NinjaModel {

    @Id //Usado pra indicar que o atributo abaixo dele é o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // passa uma estrategia de como gerar o id
    private Long id;
    private String nome;
    private int idade;
    private String email;
    //@ManyToOne representa que um ninja só pode ter uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // fereing key ou chave estrangeira
    private MissoesModel missoes;



    public NinjaModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    public NinjaModel(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


