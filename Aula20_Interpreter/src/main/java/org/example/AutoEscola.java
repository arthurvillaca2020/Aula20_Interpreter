package org.example;

public class AutoEscola {
    public static String formula = "nota1 + nota2 / 2 + 1";

    public static double calcularNota(double nota1, double nota2) {
        String expressao;
        expressao = formula.replace("nota1", Double.toString(nota1));
        expressao = expressao.replace("nota2", Double.toString(nota2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
