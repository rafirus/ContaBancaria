import java.util.Scanner;

public class Conta {
    
    public static void main(String[] args) {
        int opcao1;
        Scanner entrada = new Scanner(System.in);

        Banco Banco = new Banco();
        System.out.println("Bem vindo ao Banco X. Opções Disponíveis: 1. Abrir Conta");
        Scanner scanner = new Scanner(System.in);
        opcao1 = scanner.nextInt();
        if (opcao1 == 1){
            Banco.getAbrirConta();
        } else {
            System.out.println("Opção inválida!");
        }
        while (true) {
        System.out.println("Opções Disponíveis: 1. Fechar conta, 2. Depositar, 3. Transferência, 4. Sacar, 5. Sair do Sistema.");
        int opcoes = entrada.nextInt();
        switch (opcoes){
            case 1:
            Banco.getFecharConta();
            break;
            case 2:
            Banco.getDepositar();
            break;
            case 3:
            Banco.getTransferencia();
            break;
            case 4:
            Banco.getSacar();
            break;
            case 5:
            System.out.println("Saindo do sistema.");
            entrada.close();
            return;
            default:
            System.out.println("Opção inválida! Tente novamente.");
        }

    }
    
}

}
