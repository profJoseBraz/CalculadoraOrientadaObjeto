/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraorientadaaobjeto;

import java.util.Scanner;

/**
 *
 * @author 10156
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica cc = new CalculadoraCientifica();
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("Informe o primeiro valor: ");
//        float num1 = scanner.nextFloat();
//        
//        System.out.println("Informe o segundo valor: ");
//        float num2 = scanner.nextFloat();
//        
//        System.out.println("===============RESULTADOS===============");
//        System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
//        System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
//        System.out.println("Resultado da multiplicação: " + calculadora.multipicar(num1, num2));
//        System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));

        System.out.println("Resultado: " + cc.potencia(10, 2)); 
    }
}
