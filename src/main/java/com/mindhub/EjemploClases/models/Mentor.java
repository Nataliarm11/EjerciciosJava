package com.mindhub.EjemploClases.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String nombre;
    private String apellido;

    private Modulo modulo;

    private byte edad;

    private float altura;

    private boolean prueba;

    @OneToMany(mappedBy = "mentor", fetch = FetchType.EAGER)
    private List<Frase> frases = new ArrayList<>();

    public Mentor(){
    }


    public Mentor(String nombre, String apellido, Modulo modulo, byte edad, float altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.modulo = modulo;
        this.edad = edad;
        this.altura = altura;

    }

    public void addFrase(Frase frase) {
        frase.setMentor(this);
        frases.add (frase);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void addFrase(List<Frase> frases){
        frases.forEach(frase -> this.addFrase(frase));
    }

    public long getId() {
        return id;
    }

    public boolean isPrueba() {
        return prueba;
    }

    public List<Frase> getFrases() {
        return frases;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", modulo='" + modulo + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", prueba=" + prueba +
                '}';
    }
}
