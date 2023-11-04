package br.com.api.api_vagas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vagas")
@Getter
@Setter
public class VagasModelo {

    //* ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //* Dados pela empresa
    private String nome;
    private String tipo;
    private String descricao;
    private String cargo;
    private String local;
    private String turno;
    private String salario;

}