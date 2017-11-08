/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tensionescuerdas;

import java.util.Scanner;

/**
 *
 * @author Turbo LTSB 64
 */
public class Lampara {
    private float peso;
    
    public Lampara(){
        peso = 0.0f;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void pedirPeso(){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el peso de la lámpara: ");
        peso=leer.nextFloat();
    }
    
    public void mostrarPeso(){
        System.out.println("El peso de la lampara es: "+peso+" Newtons");
    }    
}
