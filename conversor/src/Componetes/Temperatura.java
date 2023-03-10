package Componetes;

import javax.swing.*;

public class Temperatura {
    private double temp;
    private String tipo = "C";

    public Temperatura(){
        setTipo();
        if(!this.tipo.equals("Saida")){
            setTemp();
        }
        menuTemperatura();
    }

    public void setTemp(){
        while (true){
            try {
                temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor nulo coloque alguem valor numerico para conversão");
            }

        }
    }

    public void setTipo() {
        Object[] options = { "Celsius", "Fahrenheit" };
        int selectedValue = JOptionPane.showOptionDialog(null, "O valor esta em Celsius ou Fahrenheit", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        System.out.println(selectedValue);
        if(selectedValue == 0){
            this.tipo = "C";
        } else if(selectedValue == 1){
            this.tipo = "F";
        } else {
            this.tipo = "Saida";
        }
    }

    private void menuTemperatura(){

        if(this.tipo.equals("C")){
            transformeParaF();
        } else if(this.tipo.equals("F")) {
            transformeParaC();
        }
    }

    public void transformeParaF(){
        double tempF = (this.temp * 1.8) + 32;
        String texto = "Valor Atual em celcius: " + this.temp + "C - Valor em fahrenheit: " + tempF + "F";
        JOptionPane.showMessageDialog(null,texto,"Resultado",JOptionPane.WARNING_MESSAGE);
    }

    public void transformeParaC(){
        double tempC = (this.temp - 32)/1.8;
        String texto = "Valor Atual em fahrenheit: " + this.temp + "F - Valor em Celcius: " + tempC + "C";
        JOptionPane.showMessageDialog(null,texto,"Resultado",JOptionPane.WARNING_MESSAGE);
    }
}
