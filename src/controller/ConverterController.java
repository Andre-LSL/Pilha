package controller;

import pilhaint.PilhaInt;

public class ConverterController {

    public ConverterController() {
        super();
    }

    public String decToBin(int decimal) {
        PilhaInt pilha = new PilhaInt();
        String binario = "";

        while (decimal > 0) {
            int resto = decimal % 2;
            pilha.push(resto);
            decimal /= 2;
        }

        while (!pilha.isEmpty()) {
            try {
                binario += pilha.pop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return binario.isEmpty() ? "0" : binario;
    }
}
