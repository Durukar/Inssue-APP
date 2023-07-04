package app.inssue.Inssue.services;

import app.inssue.Inssue.dto.FichaDto;
import app.inssue.Inssue.entities.Ficha;
import app.inssue.Inssue.repositories.FichaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FichaService {

    @Autowired
    private FichaRepository repository;

    @Transactional(readOnly = true)
    public FichaDto findById(Long id) {
        Ficha entity = repository.findById(id).get();
        FichaDto dto = new FichaDto(entity);
        return dto;
    }

}
