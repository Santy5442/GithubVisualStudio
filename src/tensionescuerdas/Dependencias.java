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
public class Dependencias {
    private String ubicacion;
    private Lampara lampara = new Lampara();
    private Soporte soporte1 = new Soporte();
    private Soporte soporte2 = new Soporte();
    private Soporte soporte3 = new Soporte();
    private Angulo angulo1 = new Angulo();
    private Angulo angulo2 = new Angulo();
    private Angulo angulo3 = new Angulo();
    private Operaciones operacion = new Operaciones();
    
    public Dependencias(){
        ubicacion="";
        lampara.setPeso(0);
        soporte1.setTension(0);
        soporte2.setTension(0);
        soporte3.setTension(0);
        soporte1.setNumCuerda(1);
        soporte2.setNumCuerda(2);
        soporte3.setNumCuerda(3);
        angulo1.setValorAngulo(0);
        angulo2.setValorAngulo(0);
        angulo3.setValorAngulo(0);
        operacion.setResultado(0);
    }
    
    public void pedirUbicacion(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la ubicación de la dependencia: ");
        ubicacion=leer.nextLine();
    }

    public void setearLampara(float valor){
        lampara.setPeso(valor);
    }
    
    public void pedirDatosLampara(){
        lampara.pedirPeso();
    }
    
    public void pedirDatosAngulo(Angulo angle,int identificador){
        angle.pedirAngulo(identificador);
    }
    
    public void pedirDatos(Angulo angle1,Angulo angle2, Angulo angle3){
        pedirUbicacion();
        pedirDatosLampara();
        pedirDatosAngulo(angle1,1);
        pedirDatosAngulo(angle2,2);
        pedirDatosAngulo(angle3,3);
    }
    
    public void setearSoporte (Soporte support, float valor){
        support.setTension(valor);
    }
    
    public void setearAngulo (Angulo angle, float valor){
        angle.setValorAngulo(valor);
    }

    public Operaciones getOperacion() {
        return operacion;
    }

    
    
    public Soporte getSoporte1() {
        return soporte1;
    }

    public Soporte getSoporte2() {
        return soporte2;
    }

    public Soporte getSoporte3() {
        return soporte3;
    }

    public Angulo getAngulo1() {
        return angulo1;
    }

    public Angulo getAngulo2() {
        return angulo2;
    }

    public Angulo getAngulo3() {
        return angulo3;
    }

    public Lampara getLampara() {
        return lampara;
    }
    
    public void mostrarDatos(){
        System.out.println("La ubicacion de la dependecia es: "+ubicacion);
        lampara.mostrarPeso();
        angulo1.mostrarAngulo(1);
        angulo2.mostrarAngulo(2);
        angulo3.mostrarAngulo(3);
        soporte1.mostrarTension();
        soporte2.mostrarTension();
        soporte3.mostrarTension();
    }
}
