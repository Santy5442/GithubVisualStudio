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
public class Angulo {
    private float valorAngulo;
    
    public Angulo(){
        valorAngulo=0.0f;
    }

    public float getValorAngulo() {
        return valorAngulo;
    }

    public void setValorAngulo(float valorAngulo) {
        this.valorAngulo = valorAngulo;
    }
    
    public void pedirAngulo(int identificador){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el angulo "+identificador+": ");
        valorAngulo = leer.nextFloat();
    }
    
    public void mostrarAngulo(int identificador){
        System.out.println("El angulo "+identificador+" es: "+valorAngulo+" grados");
    }
}
