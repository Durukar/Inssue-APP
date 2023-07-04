package app.inssue.Inssue.controllers;

import app.inssue.Inssue.dto.FichaDto;
import app.inssue.Inssue.entities.Ficha;
import app.inssue.Inssue.repositories.FichaRepository;
import app.inssue.Inssue.services.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ficha")
public class FichaController {
    @Autowired
    private FichaService service;

    @GetMapping(value = "/{id}")
    public FichaDto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping(value ="/{id}")
    public void deletaFicha(@PathVariable Ficha ficha) {
        FichaService.delete(id);
    }
}