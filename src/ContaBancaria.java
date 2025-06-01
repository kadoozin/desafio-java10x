public abstract class ContaBancaria implements Conta {
    protected String nome;
    protected double saldo;
    protected TipoDeConta tipoDeConta;

    public ContaBancaria(String nome, double saldo, TipoDeConta tipoDeConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
    }

    public boolean transferir(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

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
        System.out.println(nome + " seu saldo atual: R$" + saldo);
    }

    public double depositoSemTaxa(double valor) {
        return saldo += valor;
    }
}
