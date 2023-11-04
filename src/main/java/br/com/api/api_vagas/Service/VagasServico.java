package br.com.api.api_vagas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.api_vagas.Repository.VagasRepositorio;
import br.com.api.api_vagas.model.RespostaModelo;
import br.com.api.api_vagas.model.VagasModelo;

@Service
public class VagasServico {
    
    @Autowired
    private VagasRepositorio vr;

    @Autowired
    private RespostaModelo rm;

    // Método para listar todos as vagas
    public Iterable<VagasModelo> listarVagas() {
        return vr.findAll();
    }

    // Método para cadastrar vagas
    public ResponseEntity<?> cadastrarAlterar(VagasModelo vm, String acao){

        if(vm.getNome().equals("")){
            rm.setMensagem("O nome é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if(vm.getTipo().equals("")){
            rm.setMensagem("O tipo da vaga é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if(vm.getDescricao().equals("")){
            rm.setMensagem("A descrição é obrigatória!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if(vm.getCargo().equals("")){
            rm.setMensagem("O cargo é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if(vm.getLocal().equals("")){
            rm.setMensagem("O local é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if(vm.getTurno().equals("")){
            rm.setMensagem("O turno é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else if(vm.getSalario().equals("")){
            rm.setMensagem("O salario é obrigatório!");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);
        } else {
            if(acao.equals("cadastrar")){
                return new ResponseEntity<VagasModelo>(vr.save(vm), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<VagasModelo>(vr.save(vm), HttpStatus.OK);
            }
        }

    }

    // Método para remover vagas
    public ResponseEntity<RespostaModelo> remover(long id){

        vr.deleteById(id);
        
        rm.setMensagem("A vaga foi removida com sucesso!");
        return new ResponseEntity<RespostaModelo>(rm, HttpStatus.OK);

    }

}
