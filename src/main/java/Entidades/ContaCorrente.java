package Entidades;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---Extrato Entidades.Conta Corrente---");
        super.InformacoesExtrato();
    }

}
