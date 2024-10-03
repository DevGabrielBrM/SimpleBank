import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nomeCliente, tipoConta;
        double saldo;
        
        System.out.println("Olá\n Bem Vindo ao Banco do Povo!\nPor Favor insira os seus dados...\n");
        System.out.print("Digite o seu nome: ");
        nomeCliente = leitor.nextLine();
        System.out.print("Digite o tipo de conta: ");
        tipoConta = leitor.nextLine();
        System.out.print("Digite o saldo inicial: ");
        saldo = leitor.nextDouble();

        System.out.printf("""
                \n********************************************
                Dados iniciais do cliente:

                Nome:               %s
                Tipo de conta:      %s
                Saldo inicial:      R$ %.2f
                ********************************************\n
                """,nomeCliente,tipoConta,saldo);

                
                int opcao = 1;

                while (opcao >= 1 && opcao <= 4){
                    System.out.printf("""
                            \nOperações
    
                            1- Consultar Saldo
                            2- Receber Valor
                            3- Transferir valor
                            4- Sair
                            """);
    
                        System.out.print("\nOpção desejada --> ");
                        opcao = leitor.nextInt();
                    switch(opcao){
                        case 1:
                            System.out.println("\nSaldo Atual R$ " + saldo+"\n");
                            break;
                        case 2:
                            System.out.println("\nDigite o valor a ser recebido...");
                            System.out.print("\nValor R$ ");
                            double deposito = leitor.nextDouble();
                            saldo = saldo + deposito;
                            System.out.println("\nSaldo Atualizado\n\n$$$ Você possui R$ "+ saldo+" $$$");
                            break;
                        case 3:
                            System.out.println("\nDigite o valor a ser Transferido...");
                            System.out.print("\nValor R$ ");
                            double transferencia = leitor.nextDouble();
                            
                            if (transferencia > saldo){
                                System.out.println("\nInfelizmente o seu saldo é insuficiente para realizar esta Transferência");
                                System.out.println("\nSeu saldo atual é de R$ "+saldo);
                            }else{
                                saldo = saldo - transferencia;
                                System.out.println("\nVocê acabou de transferir R$ "+ transferencia);
                                System.out.println("\nSaldo Atualizado\nVocê possui R$ "+ saldo);
                            }
                            break;
                        case 4:
                            opcao = 0;                     
                    }
                    if (opcao == 0){
                        break;
                    }else if (opcao > 4 || opcao < 1){
                        System.out.println("\nOpção Invalida, redirecionando para o menu... \n");
                        System.out.printf("""
                            \nOperações
    
                            1- Consultar Saldo
                            2- Receber Valor
                            3- Transferir valor
                            4- Sair
                            """);
    
                        System.out.print("\nOpção desejada --> ");
                        opcao = leitor.nextInt();
                    }
            }

        
    }
    
}
