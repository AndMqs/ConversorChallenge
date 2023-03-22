package conversor;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andresa Marques
 */
public class ConversorMoedas {
    
    Double moeda;

    public Double getMoeda() {
        return moeda;
    }
    
    
    //Convertendo Reais para Dolar
    void converterRealParaDolar(double valor){
        moeda = valor/5.28;
 
    }
    
    //Convertendo Reais para Euro
    void converterRealParaEuro(double valor){
        moeda = valor/5.63;
        
    }
    
    //Convertendo Reais para Libras Esterlinas
    void converterRealParaLibraE(double valor){
        moeda = valor/6.43;
        
    }
    
    //Convertendo Reais para Peso Argentino
    void converterRealParaPesoA(double valor){
        moeda = valor/0.026;
    
        
    }
    
    //Convertendo Reais para Peso Chileno
    void converterRealParaPesoC(double valor){
        moeda = valor/0.0064;     
        
    }
    
    void dolarParaReal(double valor){
        moeda = valor*5.28;     
        
    }
    
    void euroParaReal(double valor){
        moeda = valor*5.63;

        
    }
    
    void librasParaReal(double valor){
        moeda = valor*6.43;

        
    }
    
    void pesoAParaReal(double valor){
        moeda = valor*0.026;
      
    }
    
    void pesoCParaReal(double valor){
        moeda = valor*0.0064;


    }
       
    
}
