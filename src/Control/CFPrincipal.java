/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Vista.Ventana1;
import Vista.Ventana2;
import Vista.Ventana3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alumno
 */
public class CFPrincipal implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Ventana1":
                Ventana1 v1 = new Ventana1();
                CFP1 c1 = new CFP1(v1);
                v1.setOidor(c1);
                v1.setVisible(true);
                break;
            case "Ventana2":
                Ventana2 v2 = new Ventana2();
                CFP2 c2 = new CFP2(v2);
                v2.setOidor(c2);
                v2.setVisible(true);
                break;
            case "Ventana3":
                Ventana3 v3 = new Ventana3();
                CFP3 c3 = new CFP3();
                v3.setOidor(c3);
                v3.setVisible(true);
                break;
        }
    }

}
