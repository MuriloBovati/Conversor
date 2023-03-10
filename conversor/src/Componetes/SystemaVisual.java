package Componetes;

import javax.swing.*;

public class SystemaVisual {
    public static void menu(){
        do {
            Object result = menuInit();
            if (result == "Conversor de moeda") {
                new Moeda();
            } else if (result == "Conversor de Temperatura") {
                new Temperatura();
            }
        } while (!continuarSistema());
        saidaSistema();
    }

    public static Object menuInit(){
        Object[] itens = { "Conversor de moeda", "Conversor de Temperatura" };
        return JOptionPane.showInputDialog(null,
                "Escolha um item", "Opçao",
                JOptionPane.INFORMATION_MESSAGE, null,
                itens, itens [0]); //
    }

    public static boolean continuarSistema(){
        Object[] options = { "Sim", "Não" };
        int escolha = JOptionPane.showOptionDialog(null, "Deseja continuar", "Aviso",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        System.out.println(escolha);
        return escolha == 1 || escolha == -1;
    }

    public static void saidaSistema(){
        JOptionPane.showMessageDialog(null,"Saindo do sistema", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
}
