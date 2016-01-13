package com.estudo.service;

import org.springframework.stereotype.Component;

@Component
public class Cliente{

	public void addCliente(){
		System.out.println("addCliente() em execução");
	}
	
	public String addClienteReturnValue(){
		System.out.println("addClienteReturnValue() em execução");
		return "Cliente add ";
	}
	
	public void addClienteThrowException() throws Exception {
		System.out.println("addClienteThrowException() em execução");
		throw new Exception("Erro genérico");
	}
	
	public void addClienteAround(String name){
		System.out.println("addClienteAround() em execução, args : " + name);
	}
}