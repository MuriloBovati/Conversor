package Componetes;

import javax.swing.*;


public class Moeda {
    double valor = 0;
    public Moeda() {
        conversor((String) menuMoeda());
    }
    public static Object menuMoeda(){
        Object[] itens = { "Converter de Reais para Dólar",
                "Converter de Reais para Euro",
                "Converter de Reais para Libra Esterlinas",
                "Converter de Reais para Peso argentino",
                "Converter de Reais para Peso Chileno",
                "Converter de Dolar para Reais",
                "Converter de Euro para Reais",
                "Converter de Libra Esterlina para Reais",
                "Converter de Peso argentino para Reais",
                "Converter de Peso Chileno para Reais"};

        return JOptionPane.showInputDialog(null,
                "Escolha a conversão", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]);
    }
    public void conversor(String conversao){
        while(true){
            String valorEntrada = JOptionPane.showInputDialog("Digite o valor que deseja " + conversao.toLowerCase());
            if (valorEntrada.equals("")) {
                JOptionPane.showMessageDialog(null,"Valor invalido coloque um valor numerico","Aviso",JOptionPane.ERROR_MESSAGE);
            } else {
                try{
                    valor = Double.parseDouble(valorEntrada);
                    break;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Valor invalido deve ser colocar apenas valores numericos","Aviso",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        switch (conversao) {
            case "Converter de Reais para Dólar" -> realDolar("real");
            case "Converter de Reais para Euro" -> realEuro("real");
            case "Converter de Reais para Libra Esterlinas" -> realLibraEsterlina("real");
            case "Converter de Reais para Peso argentino" -> realPesoArgentino("real");
            case "Converter de Reais para Peso Chileno" -> realPesoChinelo("real");
            case "Converter de Dolar para Reais" -> realDolar("dolar");
            case "Converter de Euro para Reais" -> realEuro("euro");
            case "Converter de Libra Esterlina para Reais" -> realLibraEsterlina("esterlina");
            case "Converter de Peso argentino para Reais" -> realPesoArgentino("peso argentino");
            case "Converter de Peso Chileno para Reais" -> realPesoChinelo("peso Chileno");
        }
    }
    private void realDolar(String moeda){
        if(moeda.equals("real")){
            double valorConvertido =  this.valor / 5.15;
            String resposta = "O valor de R$" + valor + " convertido para Dolar $" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        } else {
            double valorConvertido =  this.valor * 5.15;
            String resposta = "O valor de $" + valor + " convertido para Reais R$" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        }
    }
    private void realEuro(String moeda){
        if(moeda.equals("real")){
            double valorConvertido =  this.valor / 5.45;
            String resposta = "O valor de R$" + valor + " convertido para Euro €" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        } else {
            double valorConvertido =  this.valor * 5.45;
            String resposta = "O valor de €" + valor + " convertido para Reais R$" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        }
    }
    private void realLibraEsterlina(String moeda){
        if(moeda.equals("real")){
            double valorConvertido =  this.valor / 6.14;
            String resposta = "O valor de R$" + valor + " convertido para Libra £" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        } else {
            double valorConvertido =  this.valor * 6.14;
            String resposta = "O valor de £" + valor + " convertido para Reais R$" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        }
    }
    private void realPesoArgentino(String moeda){
        if(moeda.equals("real")){
            double valorConvertido =  this.valor / 0.026;
            String resposta = "O valor de R$" + valor + " convertido para peso argentino $" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        } else {
            double valorConvertido =  this.valor * 0.026;
            String resposta = "O valor de $" + valor + " convertido para Reais R$" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        }
    }
    private void realPesoChinelo(String moeda){
        if(moeda.equals("real")){
            double valorConvertido =  this.valor / 0.0064;
            String resposta = "O valor de R$" + valor + " convertido para peso chileno $" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        } else {
            double valorConvertido =  this.valor * 0.0064;
            String resposta = "O valor de $" + valor + " convertido para Reais R$" + valorConvertido;
            JOptionPane.showMessageDialog(null, resposta);
        }
    }
}
