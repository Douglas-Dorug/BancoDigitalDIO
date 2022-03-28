package Entidades;

import lombok.Getter;

@Getter
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---Extrato Entidades.Conta Poupança---");
        super.InformacoesExtrato();
    }
}
