/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gitflow2;

import Control.CFPrincipal;
import Vista.FPrincipal;

/**
 *
 * @author alumno
 */
public class GitFlow2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FPrincipal f = new FPrincipal();
        CFPrincipal c = new CFPrincipal();
        f.setOidor(c);
        f.setVisible(true);
    }

}
