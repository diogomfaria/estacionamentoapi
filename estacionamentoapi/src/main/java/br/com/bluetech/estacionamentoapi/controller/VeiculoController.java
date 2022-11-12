package br.com.bluetech.estacionamentoapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bluetech.estacionamentoapi.model.Veiculo;
import br.com.bluetech.estacionamentoapi.repository.VeiculoRepository;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository service;

    @GetMapping
    public List<Veiculo> service(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Veiculo> save(@RequestBody @Valid Veiculo obj) {
        service.save(obj);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(obj);

    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Veiculo> consultar(@PathVariable("id") Long id) {
        return service.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    
}
