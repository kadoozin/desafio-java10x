public class Main {
    public static void main(String[] args) {
        ContaPoupanca poupanca = new ContaPoupanca("Kaio Cesar",1000, TipoDeConta.POUPANCA);
        ContaCorrente corrente = new ContaCorrente("Kaio Cesar",1000, TipoDeConta.CORRENTE);

        System.out.println("------- CONTA POUPANÇA -------");
        poupanca.depositar(100); //aplica uma taxa de 5% sobre o valor depositado!
        poupanca.consultarSaldo();

        System.out.println("\n------- CONTA CORRENTE -------");
        corrente.depositar(200);
        corrente.consultarSaldo();

        System.out.println("\n------- TENTATIVAS INVÁLIDAS -------");
        poupanca.transferirPara(0, corrente); // tentativa de transferência inválida (valor 0)
        corrente.transferirPara(0, poupanca);
        poupanca.consultarSaldo();
        corrente.consultarSaldo();
    }
}