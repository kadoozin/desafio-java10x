# 💻 Projeto: Simulação de Contas Bancárias (Prática)

> **⚠️ Aviso:** Este projeto é apenas uma **Prática** de programação com Java, voltado para praticar conceitos como orientação a objetos, herança, polimorfismo e uso de `enums`.

## 📋 Descrição

Este projeto simula um funcionamento básico de contas bancárias (Conta Corrente e Conta Poupança), permitindo realizar operações como:

- Depósito
- Consulta de saldo
- Transferência entre contas

O sistema é dividido entre contas do tipo **Corrente** e **Poupança**, com regras específicas para cada tipo.

---

## 🧠 Conceitos praticados

- Interfaces (`Conta`)
- Classes abstratas (`ContaBancaria`)
- Herança (`ContaCorrente`, `ContaPoupanca`)
- Polimorfismo (métodos sobrescritos)
- `enum` (`TipoDeConta`)
- Encapsulamento de lógica de transferência e depósito

---

## ▶️ Exemplo de execução

```java
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
```

---

## 📚 Autor

- Feito por **Kaio Cesar** como **exercício de treino em Java**.
