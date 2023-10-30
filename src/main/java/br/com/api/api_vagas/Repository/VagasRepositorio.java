package br.com.api.api_vagas.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import br.com.api.api_vagas.model.VagasModelo;

@Repository
public interface VagasRepositorio extends CrudRepository<VagasModelo, Long> {
    
}
