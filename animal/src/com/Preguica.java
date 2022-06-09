package com;

public class Preguica extends Animal
{
    public Preguica (String nome, int idade)
    {
        super.setNome(nome);
        super.setIdade(idade);
    }

    public String som()
    {
        return "ZzzZzZ!";
    }

    public String movimento()
    {
       return "Subindo a árvore!";
    }
}
