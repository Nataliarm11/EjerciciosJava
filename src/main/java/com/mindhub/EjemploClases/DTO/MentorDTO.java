package com.mindhub.EjemploClases.DTO;

import com.mindhub.EjemploClases.models.Frase;
import com.mindhub.EjemploClases.models.Mentor;
import com.mindhub.EjemploClases.models.Modulo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MentorDTO {

    private long id;

    private String nombreCompleto;

    private Modulo modulo;

    private byte edad;

    private float altura;

    private List<FraseDTO> frases;

    private List<String> fraseMentor;




    public MentorDTO(Mentor mentor) {
        this.id = mentor.getId();
        this.nombreCompleto = mentor.getNombre() + " " + mentor.getApellido();
        this.modulo = mentor.getModulo();
        this.edad = mentor.getEdad();
        this.fraseMentor= mentor.getFrases()
                .stream()
                .map(frase -> frase.getTexto())
                .collect(Collectors.toList());
        this.altura = mentor.getAltura();
        this.frases = mentor.getFrases()
                .stream()
                .map(frase -> new FraseDTO(frase))
                .collect(Collectors.toList());
    }

    public List<String> getFraseMentor() {
        return fraseMentor;
    }

    public long getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public byte getEdad() {
        return edad;
    }

    public float getAltura() {
        return altura;
    }

    public List<FraseDTO> getFrases() {
        return frases;
    }
}
