import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o número da conta: ");
        int numeroConta = scan.nextInt();

        System.out.println("Qual o número da Agência: ");
        String agencia = scan.next();

        System.out.println("Nome do Titular da conta");
        String nome = scan.next();

        System.out.println("Sobrenome do Titular da conta");
        String sobreNome = scan.next();
        
        System.out.println("Entre com o saldo: ");
        double saldo = scan.nextDouble();

        System.out.println("Olá, " + nome + " " + sobreNome +
        ", obrigado por criar uma conta em nosso banco, sua agencia é: " + 
        agencia + ", conta: " + numeroConta + " e seu saldo R$ " + saldo + 
        " já está disponível para saque!");

    }
}
