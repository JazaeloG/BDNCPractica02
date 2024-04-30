package org.uv.BDNCPractica02;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryPersona extends MongoRepository<Persona, String> {
    
}
