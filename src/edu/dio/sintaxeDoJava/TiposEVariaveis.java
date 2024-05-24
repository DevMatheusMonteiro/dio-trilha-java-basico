package edu.dio.sintaxeDoJava;

public class TiposEVariaveis {
    public byte idade = 123;
    public short ano = 2021;
    public int cep = 2075080; // se começar com zero talvez tenh que ser de um outro tipo "String", por exemplo
    public long cpf = 1234567890L; // se começar com zero talvez tenh que ser de um outro tipo "String", por exemplo.
    public float pi = 3.14f;
    public double salario = 50000.63;

    public short numeroCurto = 1;
    public int numeroNormal = numeroCurto;
    public short numeroCurto2 = (short) numeroNormal;
}
