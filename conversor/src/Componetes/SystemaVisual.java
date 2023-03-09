package Componetes;

import javax.swing.*;

public class SystemaVisual {

    public static double inputValue(String mesagemInput){
        String value;
        value = JOptionPane.showInputDialog(mesagemInput);
        return Double.parseDouble(value);
    }

    public static void mostrarMensagem(String message,String tipo){
        String tipoDeMensagem = tipo;
        int emoteMensagem = JOptionPane.ERROR_MESSAGE;
        switch(tipo){
            case "WARNING":
                emoteMensagem = JOptionPane.WARNING_MESSAGE;
                break;

            case "QUESTION":
                emoteMensagem = JOptionPane.QUESTION_MESSAGE;
                break;

            case "PLAIN":
                emoteMensagem = JOptionPane.PLAIN_MESSAGE;
                break;
        }

        JOptionPane.showMessageDialog(null, message,tipoDeMensagem,emoteMensagem);
    }

    public static void resposta(){
        JOptionPane.showConfirmDialog(null, "Teste");
    }

    public static void option1(){
        Object[] options = {"OK","Cancelar"};
        JOptionPane.showOptionDialog(null, "Clique em ok para continuar", "Aviso", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
    }

    public static void menu(){
        Object result = menuInit();
        if(result == "Conversor de moeda"){
            menuMoeda();
        } else {
            Temperatura temp = new Temperatura();
        }
    }

    public static Object menuInit(){
        Object[] itens = { "Conversor de moeda", "Conversor de Temperatura" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um item", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]); //
        return selectedValue;
    }


    public static Object menuMoeda(){
        Object[] itens = { "Converter de Reais para Dólar",
                "Converter de Reais para Euro",
                "Converter de Reais para Libra Esterlinas",
                "Converter de Reais para Peso argentino",
                "Converter de Reais para Peso Chileno"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha a conversão", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]); //
        return selectedValue;
    }

}
