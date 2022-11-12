package br.com.bluetech.estacionamentoapi.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bluetech.estacionamentoapi.model.Usuario;
import br.com.bluetech.estacionamentoapi.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;


    public List<Usuario> listAll() {
        return repository.findAll();
    }

    public void salvar(@Valid Usuario user) {
        repository.save(user);
    }

    public Optional<Usuario> getById(Long id) {
        return repository.findById(id);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public void update(Usuario user) {
        repository.save(user);
    }
    
}
