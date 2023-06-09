package com.mindhub.EjemploClases.DTO;

import com.mindhub.EjemploClases.models.Frase;
import com.mindhub.EjemploClases.models.Mentor;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

public class FraseDTO {
    private Long id;
    private String numeroFrase;
    private String frecuencia;
    private String texto;

    public FraseDTO(Frase frase) {
        this.id = frase.getId();
        this.numeroFrase = frase.getNumeroFrase();
        this.frecuencia = frase.getFrecuencia();
        this.texto = frase.getTexto();
    }

    public Long getId() {
        return id;
    }

    public String getNumeroFrase() {
        return numeroFrase;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public String getTexto() {
        return texto;
    }
}
