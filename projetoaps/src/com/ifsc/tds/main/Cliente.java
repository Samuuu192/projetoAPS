package com.ifsc.tds.main;

public class Cliente {

  int clienteId;
  String nome;
  Endereco endereco;
  
  int getClienteId(){return this.clienteId}
  void setClienteId(int id){this.clienteId = id}
  
  String getNome(){return this.nome}
  void setNome(String nome){this.nome = nome}
  
  Endereco getEndereco(){return this.endereco}
  void setEndereco(Endereco endereco){this.endereco = endereco}
  
  String toString(){
  }
}
