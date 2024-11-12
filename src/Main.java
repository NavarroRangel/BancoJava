import model.Compra;
import model.ContaBancaria;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria novaConta = new ContaBancaria();
        novaConta.setNumeroDaConta(213123);
        novaConta.setTitular("Robinho");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o  limite do cartão: ");
        novaConta.setLimiteDoCartao(scanner.nextDouble());
        int sair = 1;
        while (sair != 0) {
            Compra compra = new Compra();
            System.out.println("Digite o valor da compra: ");
            compra.setValorDaCompra(scanner.nextDouble());

            System.out.println("Digite a descrição da compra: ");
            compra.setDescricaoDaCompra(scanner.nextLine());
            var  compraRealizada =novaConta.lancaCompra(compra.getDescricaoDaCompra(), compra.getValorDaCompra());
               System.out.println("Digite 1 para sair e 0 para continuar");
               sair = scanner.nextInt();
        }

    }
}

