package com.company;

public class Funcionario {
    private int IdFuncionario;
    private String Nome;
    private double Salario;

    public int getIdFuncionario() {
        return IdFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        IdFuncionario = idFuncionario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void AumentarSalario(double salario) {
        Salario = salario + Salario;
    }

    public Funcionario(int idFuncionario, String nome, double salario) {
        IdFuncionario = idFuncionario;
        Nome = nome;
        Salario = salario;
    }
}
