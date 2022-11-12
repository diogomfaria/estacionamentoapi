package br.com.bluetech.estacionamentoapi.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bluetech.estacionamentoapi.model.Veiculo;
import br.com.bluetech.estacionamentoapi.repository.VeiculoRepository;

@Service
public class VeiculoSevice {

    @Autowired
    VeiculoRepository veiculoRepository;

    public List<Veiculo> listAll() {
        return veiculoRepository.findAll();
    }

    public void save(@Valid Veiculo veiculo) {
        veiculoRepository.save(veiculo);
    }
    
    public Optional<Veiculo> getById(Long id) {
        return veiculoRepository.findById(id);
    }
}
