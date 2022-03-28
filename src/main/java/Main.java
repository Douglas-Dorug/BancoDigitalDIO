import Entidades.Cliente;
import Entidades.Conta;
import Entidades.ContaCorrente;
import Entidades.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Cliente douglas = new Cliente();
        douglas.setNome("Douglas");

        Cliente dorug = new Cliente();
        dorug.setNome("Dorug");


        Conta contaCorrente = new ContaCorrente(douglas);
        Conta contaPoupança = new ContaPoupanca(dorug);

        contaCorrente.imprimirExtrato();
        contaPoupança.imprimirExtrato();
        System.out.println("_______");
        System.out.println("");

        contaCorrente.depositar(200);
        contaPoupança.depositar(100);

        contaCorrente.imprimirExtrato();
        contaPoupança.imprimirExtrato();
        System.out.println("_______");
        System.out.println("");

        contaCorrente.sacar(50);
        contaPoupança.sacar(10);

        contaCorrente.imprimirExtrato();
        contaPoupança.imprimirExtrato();
        System.out.println("_______");
        System.out.println("");

        contaCorrente.transferir(contaPoupança,15);

        contaCorrente.imprimirExtrato();
        contaPoupança.imprimirExtrato();
        System.out.println("_______");
        System.out.println("");

    }
}
