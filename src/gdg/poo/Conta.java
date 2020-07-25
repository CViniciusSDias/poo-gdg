package gdg.poo;

public class Conta {
    private String cpfTitular;
    private double saldo;

    public Conta(String cpfTitular) {
        this.cpfTitular = cpfTitular;
        this.saldo = 0;
    }

    public void sacar(double valorASacar) {
        if (valorASacar > this.saldo) {
            return;
        }

        this.saldo -= valorASacar;
    }

    public void depositar(double valorADepositar) {
        if (valorADepositar < 0) {
            return;
        }

        this.saldo += valorADepositar;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public double getSaldo() {
        return saldo;
    }
}
