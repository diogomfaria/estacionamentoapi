package br.com.bluetech.estacionamentoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bluetech.estacionamentoapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
