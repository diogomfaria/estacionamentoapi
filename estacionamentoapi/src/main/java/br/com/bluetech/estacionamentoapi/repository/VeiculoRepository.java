package br.com.bluetech.estacionamentoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bluetech.estacionamentoapi.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {


    
}
