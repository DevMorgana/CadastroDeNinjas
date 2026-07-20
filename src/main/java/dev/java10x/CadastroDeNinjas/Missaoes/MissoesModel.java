package dev.java10x.CadastroDeNinjas.Missaoes;

import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity   //representa algo no banco de dados
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    // a anotação abaixo quer dizer que ONE(uma) TO(da) missoes MANY(varios) vai ter varios ninjas
    @OneToMany(mappedBy="missoes") //aqui vamos mapear, assim conectando com uma chave estrangeira
    private List<NinjaModel> ninjas;


}
