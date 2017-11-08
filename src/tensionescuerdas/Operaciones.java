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
public class Operaciones {
    private float resultado;
    
    public Operaciones(){
        resultado = 0.0f;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public void calculoTensiones(Soporte t3,Angulo angle,Angulo angle2){
        Angulo aux = new Angulo ();
        Angulo aux2= new Angulo ();
        
        aux.setValorAngulo(angle.getValorAngulo()+90);
        aux2.setValorAngulo(angle2.getValorAngulo());
        /*System.out.println("Angulo alterno 1: "+aux.getValorAngulo());
        System.out.println("Angulo alterno 2: "+aux2.getValorAngulo());*/
        aux.setValorAngulo((aux.getValorAngulo()*(float)Math.PI)/180);
        aux2.setValorAngulo((aux2.getValorAngulo()*(float)Math.PI)/180);

        resultado=(t3.getTension()*(float)Math.sin(aux.getValorAngulo()))/(float)Math.sin(aux2.getValorAngulo());
    }
    
    public float tensionesEquilibradas(Lampara lampara){
        resultado=lampara.getPeso();
        return (resultado);
    }
    
    public float transformarPeso(Lampara lampara){
        double gravedad;
        float peso;
        
        gravedad = 9.8;
        peso = (lampara.getPeso()/1000)*(float)gravedad;
        return (peso);
    }
    
}
