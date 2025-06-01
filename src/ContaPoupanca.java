public class ContaPoupanca extends ContaBancaria {
    double taxa;

    public ContaPoupanca(String nome, double saldo, TipoDeConta tipo) {
        super(nome, saldo, tipo);
    }

    @Override
    public double depositar(double valor) {
        taxa = (valor * 5) / 100;
        return saldo += valor - taxa;
    }

    @Override
    public void consultarSaldo() {
        System.out.println(nome + " seu saldo atual na conta " + this.tipoDeConta + " é de: R$" + saldo);
    }

    @Override
    public boolean transferir(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean transferirPara(double valor, ContaBancaria contaDestino) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência: deve ser maior que zero.");
            return false;
        }
        if (transferir(valor)) {
            contaDestino.depositar(valor);
            System.out.println("O valor: R$" + valor + " foi transferido de conta " + this.tipoDeConta + " para " + contaDestino.tipoDeConta);
            return true;
        }
        System.out.println("Falha na transferência: saldo insuficiente.");
        return false;
    }
}
