/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Andressa Marques
 */
public class ConversorArm {
    
    double arm;

    public double getArm() {
        return arm;
    }
    
    void byteMega(double valor){
        arm = valor/(1024*1024);
    }
    
    void kiloMega(double valor){
        arm = valor/1024;
    }
    
    void megaGiga(double valor){
        arm = valor/1024;
    }
    
    void gigaTera(double valor){
        arm = valor/1024;
    }
    
    //gigaMega
    
    //megaKilo
    
}
