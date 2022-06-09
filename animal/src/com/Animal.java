package com;

public abstract class Animal
{
    private String nome;
    private int idade;

    public abstract String som();

    public abstract String movimento();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdade()
    {
        return idade;
    }
}


