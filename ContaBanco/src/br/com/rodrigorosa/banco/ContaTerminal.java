package br.com.rodrigorosa.banco;

public class ContaTerminal {
  private int numero;
  private String agencia;
  private String nomeCliente;
  private double saldo;

  // Getters
  public int getNumero() {
    return numero;
  }

  public String getAgencia() {
    return agencia;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public double getSaldo() {
    return saldo;
  }

  // Setters
  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
}