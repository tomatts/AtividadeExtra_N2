package com.example;

import java.util.Scanner;

import com.example.Models.Bicicleta;
import com.example.Abstractions.IBicicleta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner = Scanner = new Scanner(System.in);
        Bicicleta bicicleta = new Bicicleta();
        int option;
    
    do {
        System.out.println( "Escolha a opção desejada:\n 1 - Acelerar | 2 - Frear | 3 - Exibir status atual | 4 - Sair");
        option = scanner.nextInt();
        scanner.nextLine(); //buff clean

        switch(option){
            case 1:
            System.out.println(bicicleta.acelerar());
            break;
        }
        
    }
    }
}
