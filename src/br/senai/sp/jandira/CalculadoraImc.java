package br.senai.sp.jandira;

import java.util.Scanner;

public class CalculadoraImc {
	
    public static void main(String[] args) {
    	
        Scanner medidas = new Scanner(System.in);
        
        System.out.println("Qual é o seu nome");
        String nome = medidas.next();
        System.out.println("--------------------");
        System.out.print("Digite seu peso em kg: ");
        double peso = medidas.nextDouble();
        System.out.println("--------------------");
        System.out.print("Digite sua altura em cm: ");
        double altura = medidas.nextDouble() / 100; // converte altura para metros
        System.out.println("--------------------");
        double imc = peso / (altura * altura);
        System.out.println("--------------------");
        System.out.printf(nome + " seu IMC é:%.2f " , imc);
       
    }
}