package com.company;

public class Reserva {
    private String Nome;
    private String Email;
    private int Quarto;


    public Reserva(String nome, String email, int quarto) {
        Nome = nome;
        Email = email;
        Quarto = quarto;
    }

    public String getNome() { return Nome; }

    public String getEmail() {
        return Email;
    }

    public int getQuarto() {
        return Quarto;
    }


}
