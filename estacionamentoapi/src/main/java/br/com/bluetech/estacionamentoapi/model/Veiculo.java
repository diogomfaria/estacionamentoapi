package br.com.bluetech.estacionamentoapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "TB_VEICULO")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "ds_tipo")
    private String tipo;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "dt_entrada")
    private LocalDateTime entrada;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "dt_saida")
    private LocalDateTime saida;

    public Long getId() {
        return id;
    }

    public Veiculo(Long id, String tipo, LocalDateTime entrada, LocalDateTime saida) {
        this.id = id;
        this.tipo = tipo;
        this.entrada = entrada;
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "Veiculo [id=" + id + ", tipo=" + tipo + ", entrada=" + entrada + ", saida=" + saida + "]";
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    
    
    
}
