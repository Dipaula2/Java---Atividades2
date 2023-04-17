
package Temperatura;


public class ConversaoDeUnidades {
    
    private double Celsius;
    private double Fahrenheit;
    private double Kelvin;
    private double Reaumur;
    private double Rankine;
    
           
    public static double transCF(double Celsius, double Fahrenheit ){
        
        double transCF = ((9 * Celsius/5)+32);
        return transCF;
    }
    
    public static double transFC( double Fahrenheit,double Celsius ){
        
        double transFC = (Fahrenheit - 32) * +5/9;
        return transFC;
    }
    
    public static double transCK(double Celsius, double Kelvin ){
        
        double transCK = Celsius + 273.15;
        return transCK;
    }
    
    public static double transKC( double Kelvin,double Celsius ){
        
        double transKC = Kelvin - 273.15;
        return transKC;
    }
    
    public static double transCRe(double Celsius, double Reaumur ){
        
        double transCRe = Celsius *4/5;
        return transCRe;
    }
    
    public static double transReC( double Reaumur,double Celsius ){
        
        double transReC = Reaumur *5/4;
        return transReC;
    }
    
    public static double transKR(double Kelvin, double Rankine ){
        
        double transKR = Kelvin * 1.8;
        return transKR;
    }
    
    public static double transRK( double Rankine,double Kelvin ){
        
        double transRK = Rankine/1.8;
        return transRK;
    }
    
    
    
    
    
    
    
    
    
}
