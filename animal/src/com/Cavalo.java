package com;

public class Cavalo extends Animal
{
    public Cavalo (String nome, int idade)
    {
        super.setNome(nome);
        super.setIdade(idade);
    }

    public String som()
    {
        return "Rinronronr√≥!";
    }

    public String movimento()
    {
       return "Correndo pelos pastos!";
    }
}
