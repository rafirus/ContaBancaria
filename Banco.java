import java.util.Scanner;

public class Banco {
    public int numConta; 
    protected String tipo;
    private String dono;
    private float saldo = 0;
    private boolean status;
    public String resposta;
    public float transferencia, valor, deposito;
    private float mensalidade;

    Scanner scanner = new Scanner(System.in);

    public void getAbrirConta(){
        status = true;
        System.out.print("Digite o tipo de conta. [Corrente, Poupanca] ");
        tipo = scanner.next();
        if (tipo.equals("Corrente"))  {
            saldo = saldo + 50;
            System.out.print("Sua conta é Corrente e seu saldo inicial é de: " + saldo);
        } else if (tipo.equals("Poupanca")) {
            saldo = saldo + 150;
            System.out.println("Sua conta é Poupança e seu saldo inicial é de: " + saldo );
        }
    }
    public void getFecharConta(){
        if (saldo != 0){
            System.out.println("Você não pode fechar a conta com dinheiro na conta!");
        }  if (saldo == 0){
            status = false;
            System.out.println("Conta fechada com sucesso, o status da conta é: " + status);
        }
    }
    public void getTransferencia(){
        
      System.out.println("Para transferir, você precisa digitar a o número da conta.");
        numConta = scanner.nextInt();
        System.out.println("O titular da conta agora. ");
        dono = scanner.next();
        System.out.println("O titular da conta é "+ dono + " e o número da conta é " + numConta + "? [S/N]");
        resposta = scanner.next();
        if (resposta == "N"){
            System.out.println("Digite as informações corretas.");
            
        } else {
            System.out.print("Digite o valor da transferencia: ");
            transferencia = scanner.nextFloat();
        }if (saldo < transferencia) {
            System.out.println("Você não pode fazer o depósito, seu saldo é inferior ao depósito solicitado.");

        } else {
            saldo = saldo - transferencia;
            System.out.println("Seu novo saldo após o depósito é: " + saldo);
        }
         
    }
    public void getDepositar(){
        if (status == true) {
        System.out.println("Digite o valor que você quer depositar em sua conta.");
        deposito = scanner.nextFloat();
        saldo += deposito;
        System.out.println("Seu novo saldo é:" + saldo);
        } else if (status == false) {
            System.out.println("Sua conta está inativa. Não é possível fazer depósitos.");
        }
    }
    public void getSacar(){
         
        System.out.println("Quanto você deseja sacar? Saldo disponível: " + saldo);
        valor = scanner.nextFloat();
        saldo -= valor;
        System.out.println("Saque concluído com sucesso! Seu novo saldo é de: " + saldo);
    
}
    public void getPagarMensal(){
        
        if (tipo.equals("Corrente")){
            mensalidade = 12; 
            saldo -= mensalidade;
        } else if (tipo.equals("Poupanca")){
            mensalidade =  20;
            saldo -= mensalidade;
        }
        System.out.println("Sua conta é do tipo "+ tipo + " e a mensalidade é " + mensalidade);
    
    }
    public void getStatus(){
        System.out.println("O status da conta é " + status);
       
}
}