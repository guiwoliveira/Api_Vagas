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

    //* Implicito
    private String nome_empresa;

    //* Dados pela empresa
    private String tipo_vaga;
    private String descricao;
    private String cargo;
    private String local;
    private String turno;
    private String salario;

}