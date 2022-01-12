package com.eventosapp.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Evento implements Serializable {
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long codigo;
    private static  final long serialVersion  = 1L;
    private String nome;
    private String local;
    private String data;
    private String horario;
    @OneToMany
    private List<Convidado> convidado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}