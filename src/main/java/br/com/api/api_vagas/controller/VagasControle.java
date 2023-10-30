package br.com.api.api_vagas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.api_vagas.Service.VagasServico;
import br.com.api.api_vagas.model.RespostaModelo;
import br.com.api.api_vagas.model.VagasModelo;

@RestController
@CrossOrigin(origins = "*")
public class VagasControle {

    @Autowired
    private VagasServico vs;

    @DeleteMapping("/remover/{id}")
    public ResponseEntity<RespostaModelo> remover(@PathVariable long id){
        return vs.remover(id);
    }
 
    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody VagasModelo vm) {
        return vs.cadastrarAlterar(vm, "alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody VagasModelo vm) {
        return vs.cadastrarAlterar(vm, "cadastrar");
    }

    @GetMapping("/listar")
    public Iterable<VagasModelo> listar() {
        return vs.listarVagas();
    }
    
    @GetMapping("/")
    public String rota() {
        return "API vagas funcionando!";
    }

}
