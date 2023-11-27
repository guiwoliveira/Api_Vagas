package br.com.api.api_vagas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;

    private int cpf;
    private int cnpj;
    private String email;
    private String nome;
    private String senha;
    private int tipo_conta;

}
