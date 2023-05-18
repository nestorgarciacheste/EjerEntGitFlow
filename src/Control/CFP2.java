/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Vista.Ventana2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oovv.Maex;
import oovv.ParImpar;

/**
 *
 * @author alumno
 */
public class CFP2 implements ActionListener {

    private Ventana2 finestra;
    private int[] array;

    public CFP2(Ventana2 finestra) {
        this.finestra = finestra;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Enviar": {
                try {
                    array = finestra.getArray();
                    finestra.muestraInfo("Los numeros pares son: \n" + ParImpar.Par(array) + "\n");
                    finestra.muestraInfo("Los numeros impares son: \n" + ParImpar.Impar(array) + "\n");
                    finestra.muestraInfo("El num más alto es: \n " + ParImpar.mostrarNumeroMasAlto(array) + "\n");
                    finestra.muestraInfo("El num más bajo es: \n " + ParImpar.mostrarNumeroMasBajo(array)+"\n");
                } catch (Maex ex) {
                    JOptionPane.showMessageDialog(finestra, ex);
                }
            }

            break;

        }
    }
}
