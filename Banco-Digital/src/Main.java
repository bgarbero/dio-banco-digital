public class Main {
    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno Garbero");

        iConta cc = new ContaCorrente(bruno);
        iConta poupanca = new ContaPoupanca(bruno);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
