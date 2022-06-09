package com;

public class Cachorro extends Animal
{

    public Cachorro (String nome, int idade)
    {
        super.setNome(nome);
        super.setIdade(idade);
    }



    public String som()
    {
        return "Au au!";
    }

    public String movimento()
    {
        return "Correndo no quintal!";
    }
}
