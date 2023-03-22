/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author Andressa Marques
 */
public class ConversorTemp {
    
    double temp;

    public double getTemp() {
        return temp;
    }
    
    
    void celParaFah(double valor){
       temp = (valor*1.8)+32;
        
    }
    
    void celParaKel(double valor){
        temp = valor + 273.15;
    }
    
    void fahParaCel(double valor){
        temp = (valor-32)/1.8;
    }
    
    void fahParaKel(double valor){
        temp = (valor-32)*5/9 + 273.15;
    }
    
    void kelParaCel(double valor){
        temp = valor - 273.15;
        
    }
    
    void kelParaFah(double valor){
        temp = (valor - 273.15)*1.8 + 32;
    }
    
}
