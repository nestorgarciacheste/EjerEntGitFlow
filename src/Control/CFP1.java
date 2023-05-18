/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Vista.Ventana1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import oovv.Maex;
import oovv.OrdenaArray;

/**
 *
 * @author alumno
 */
public class CFP1 implements ActionListener{
    
    private Ventana1 finestra;

    public CFP1(Ventana1 finestra) {
        this.finestra = finestra;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Ordena" -> {
                String cad = finestra.getTextArea();
                int[] ordenada = null;
            try {
                ordenada = OrdenaArray.ordenar(cad.split(" "));
            } catch (Maex ex) {
                Logger.getLogger(CFP1.class.getName()).log(Level.SEVERE, null, ex);
            }
                String ordenado = "";
                for (int i : ordenada) {
                    ordenado += i + " ";
                }
                finestra.mostra(ordenado);
            }
            default -> throw new AssertionError();
        }
    }
    
}
