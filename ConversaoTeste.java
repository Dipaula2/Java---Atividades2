
package Temperatura;


public class ConversaoTeste {

    
    public static void main(String args[]) {
       
       double Celsius = 22.5;
       double Fahrenheit = 63.0;
       double Kelvin  = 315.78;
       double Reaumur = 17.6;
       double Rankine = 567.42;
       
       
   
        double transCF = ConversaoDeUnidades.transCF(Celsius, Fahrenheit);
        System.out.println(transCF);
        
        double transFC = ConversaoDeUnidades.transFC(Fahrenheit, Celsius);
        System.out.println(transFC);
 
        double transCK = ConversaoDeUnidades.transCK(Celsius, Kelvin);
        System.out.println(transCK);
        
        double transKC = ConversaoDeUnidades.transKC(Kelvin, Celsius);
        System.out.println(transKC);
        
        double transCRe = ConversaoDeUnidades.transCRe(Celsius, Reaumur);
        System.out.println(transCRe);
        
        double transReC = ConversaoDeUnidades.transReC(Reaumur,Celsius);
        System.out.println(transReC);
        
        double transKR = ConversaoDeUnidades.transKR(Kelvin, Rankine);
        System.out.println(transKR);
        
        double transRK = ConversaoDeUnidades.transRK(Rankine, Kelvin);
        System.out.println(transRK);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
