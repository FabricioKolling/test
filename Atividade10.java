package com.mycompany.atividade10;

//Faça um programa em JAVA que solicite 2 números inteiros e efetuea adição; caso o resultado seja maior que 10, apresentá-lo:

import javax.swing.JOptionPane;

public class Atividade10 {

    public static void main(String[] args) {
        int num1, num2, soma;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número: "));

        soma = num1 + num2;
        
        if (soma > 10) {
            JOptionPane.showMessageDialog(null, "A soma é: " + soma);
        }
    }
}
