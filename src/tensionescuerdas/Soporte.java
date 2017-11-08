/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tensionescuerdas;

/**
 *
 * @author Turbo LTSB 64
 */
public class Soporte {
    private float tension;
    private int numCuerda;
    
    public Soporte(){
        tension = 0.0f;
    }

    public float getTension() {
        return tension;
    }

    public void setTension(float tension) {
        this.tension = tension;
    }

    public int getNumCuerda() {
        return numCuerda;
    }

    public void setNumCuerda(int numCuerda) {
        this.numCuerda = numCuerda;
    }
    
    public void mostrarTension(){
        System.out.println("La tension del soporte "+numCuerda+" es: "+tension+" Newtons");
    }
}
