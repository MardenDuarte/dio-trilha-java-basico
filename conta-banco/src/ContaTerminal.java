import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e Importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        //Corrgir os dados caso tenha erros de digitação

        

        System.out.println("Seja bem vindo ao Banco TANA (Teu Atraso Nossa Alegria)");

        Scanner scanner = new Scanner(System.in);

        boolean contaCerta = false;
        while(contaCerta == false){

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("Digite Nome da sua Agência: ");
        String agenciaNome = scanner.next();

        System.out.println("Digite sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe o valor para depositar: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Confirma os dados acima");
        System.out.println ("[1]-Sim, [2]-Não");
        int simOuNao = scanner.nextInt();
        System.out.println("Informe novamente os dados, por favor.");

        if(simOuNao == 1){
            contaCerta = true;
        System.out.println("Cliente: " + nome + " " + sobrenome);
        System.out.println("Número da sua Agência: " + agenciaNome);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Meu valor para deposito inicial é R$ " + saldoConta);

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta no TANA, sua agência é " + agenciaNome + ", Conta " + numeroConta + " e seu saldo de R$ " + saldoConta + " já está disponivel para saque.");
        }
        }


        
    }
}
