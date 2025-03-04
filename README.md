# Desafio Banco - Orientação a Objetos em Java

Este é um projeto que simula um banco com duas modalidades de conta: **Conta Corrente** e **Conta Poupança**. O objetivo do desafio é aplicar conceitos de **Orientação a Objetos (OO)**, incluindo **Abstração**, **Encapsulamento**, **Herança** e **Polimorfismo**, utilizando a linguagem **Java**.

## Funcionalidades

- **Depósito**: Possibilidade de realizar depósitos em contas.
- **Saque**: Permite realizar saques das contas.
- **Transferência**: Permite transferir valores entre contas da mesma instituição.
- **Exibição de extrato**: Imprime as informações básicas de cada conta, como saldo e dados do titular.

O sistema permite a criação de clientes e contas, e demonstra como as operações bancárias são realizadas.

## Estrutura do Projeto

O projeto é dividido em várias classes responsáveis por diferentes aspectos do sistema bancário:

- **Cliente**: Representa um cliente do banco.
- **Conta**: Classe abstrata que define as operações bancárias comuns a todas as contas.
- **ContaCorrente**: Classe que implementa os detalhes específicos de uma conta corrente.
- **ContaPoupanca**: Classe que implementa os detalhes específicos de uma conta poupança.
- **Banco**: Classe que mantém a lista de contas.
