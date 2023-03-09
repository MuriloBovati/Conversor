package Componetes;

import javax.swing.*;

public class Temperatura {
    private double temp = 0;
    private String tipo = "C";

    public void setTemp() {
        this.temp = this.temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));
    }

    public void setTipo() {
        Object[] options = { "Celsius", "Fahrenheit" };
        int selectedValue = JOptionPane.showOptionDialog(null, "O valor esta em Celsius ou Fahrenheit", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        if(selectedValue == 0){
            this.tipo = "C";
        } else {
            this.tipo = "F";
        }
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temp=" + temp +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Temperatura(){
        setTipo();
        setTemp();
        menuTemperatura();
    }

    private void menuTemperatura(){
        double valor;
        if(this.tipo == "C"){
            transformeParaF();
        } else {
            transformeParaC();
        }
    }

    public void transformeParaF(){
        String texto = "";
        double tempF = (this.temp * 1.8) + 32;
        texto = "Valor Atual em celcius: " + this.temp + "C - Valor em fahrenheit: " + tempF + "F";
        JOptionPane.showMessageDialog(null,texto,"Resultado",JOptionPane.WARNING_MESSAGE);
    }

    public void transformeParaC(){
        String texto = "";
        double tempC = (this.temp - 32)/1.8;
        texto = "Valor Atual em fahrenheit: " + this.temp + "F - Valor em Celcius: " + tempC + "C";
        JOptionPane.showMessageDialog(null,texto,"Resultado",JOptionPane.WARNING_MESSAGE);
    }
}
