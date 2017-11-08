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
public class TensionesCuerdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dependencias Obj1, Obj2, Obj3;
        
        Obj1 = new Dependencias();
        Obj2 = new Dependencias();
        Obj3 = new Dependencias();
        
        //Seteo Datos con los Similares al deber
        
        Obj1.pedirUbicacion();
        Obj1.setearLampara(490);
        Obj1.setearAngulo(Obj1.getAngulo1(), 30);
        Obj1.setearAngulo(Obj1.getAngulo2(), 45);
        Obj1.setearAngulo(Obj1.getAngulo3(), 180-Obj1.getAngulo1().getValorAngulo()-Obj1.getAngulo2().getValorAngulo());
        Obj1.setearSoporte(Obj1.getSoporte3(), Obj1.getOperacion().tensionesEquilibradas(Obj1.getLampara()));
        Obj1.getOperacion().calculoTensiones(Obj1.getSoporte3(), Obj1.getAngulo2(), Obj1.getAngulo3());
        Obj1.setearSoporte(Obj1.getSoporte1(), Obj1.getOperacion().getResultado());
        Obj1.getOperacion().calculoTensiones(Obj1.getSoporte3(), Obj1.getAngulo1(), Obj1.getAngulo3());
        Obj1.setearSoporte(Obj1.getSoporte2(), Obj1.getOperacion().getResultado());
        Obj1.mostrarDatos();
        
        //CON INGRESO DE DATOS
        
        Obj2.pedirDatos(Obj2.getAngulo1(), Obj2.getAngulo2(), Obj2.getAngulo3());
        Obj2.setearLampara(Obj2.getOperacion().transformarPeso(Obj2.getLampara()));
        Obj2.setearSoporte(Obj2.getSoporte3(), Obj2.getOperacion().tensionesEquilibradas(Obj2.getLampara()));
        Obj2.getOperacion().calculoTensiones(Obj2.getSoporte3(), Obj2.getAngulo2(), Obj2.getAngulo3());
        Obj2.setearSoporte(Obj2.getSoporte1(), Obj2.getOperacion().getResultado());
        Obj2.getOperacion().calculoTensiones(Obj2.getSoporte3(), Obj2.getAngulo1(), Obj2.getAngulo3());
        Obj2.setearSoporte(Obj2.getSoporte2(), Obj2.getOperacion().getResultado());
        Obj2.mostrarDatos();
    }
}