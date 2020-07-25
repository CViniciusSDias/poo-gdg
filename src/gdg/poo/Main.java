package gdg.poo;

public class Main {

    public static void main(String[] args) {
        Conta umaConta = new Conta("123.456.789-10");
        umaConta.depositar(500);

	    System.out.println("Conta do titular com CPF " + umaConta.getCpfTitular() + " possui " + umaConta.getSaldo() + " reais de saldo.");

	    umaConta.sacar(200);
	    System.out.println("Conta do titular com CPF " + umaConta.getCpfTitular() + " possui " + umaConta.getSaldo() + " reais de saldo.");
    }
}
