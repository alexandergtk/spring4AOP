package com.estudo.aspectj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.estudo.service.Cliente;

@SpringBootApplication(scanBasePackages ="com.estudo")
public class Spring4AopApplication {

    public static void main(String[] args) throws Exception {
        
        ApplicationContext ctx = SpringApplication.run(Spring4AopApplication.class, args);
        Cliente cliente = ctx.getBean(Cliente.class);
//        cliente.addCliente();
        cliente.addClienteReturnValue();
//        cliente.addClienteAround("Cliente");
//        cliente.addClienteThrowException();
 
    }
}
