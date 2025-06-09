package com.example.Models;

import com.example.Abstractions.IBicicleta;

public class Bicicleta implements IBicicleta {
    private int velocidade;
    private int marcha;

    // Construtor padrão
    public Bicicleta() {
        this.velocidade = 0;
        this.marcha = 0;

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

}