package Interfaces;

import Entidades.Conta;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta contadestino, double valor);
    void imprimirExtrato();
}
