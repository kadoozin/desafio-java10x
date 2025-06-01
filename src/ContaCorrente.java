public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(String nome, double saldo, TipoDeConta tipo) {
        super(nome, saldo, tipo);
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

    @Override
    public double depositar(double valor) {
        return saldo += valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println(nome + " seu saldo atual na conta " + this.tipoDeConta + " e de: R$" + saldo);
    }

    public double depositoSemTaxa(double valor) {
        return saldo += valor;
    }
}
