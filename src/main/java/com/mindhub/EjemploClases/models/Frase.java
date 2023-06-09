package com.mindhub.EjemploClases.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;
    private String numeroFrase;
    private String frecuencia;
    private String texto;
    @ManyToOne(fetch = FetchType.EAGER)
    private Mentor mentor;

    public Frase() {
    }

    public Frase(String numeroFrase, String frecuencia, String texto) {
        this.numeroFrase = numeroFrase;
        this.frecuencia = frecuencia;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public String getNumeroFrase() {
        return numeroFrase;
    }

    public void setNumeroFrase(String numeroFrase) {
        this.numeroFrase = numeroFrase;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }
}
