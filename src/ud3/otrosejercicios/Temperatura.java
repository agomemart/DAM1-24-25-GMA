package ud3.otrosejercicios;

public class Temperatura {
    private double tF, tC;
    
    public double celsiusFarenheit() {
        return 1.8 * tC + 32; 
    }
    
    public double farenheitCelsius() {
        return (tF - 32) / 1.8;
    }

    public void setTemperaturaCelsius(double celsius) {
        tC = celsius;
    } 
    
    public void setTemperaturaFarenheit(double farenheit) {
        tF = farenheit;
    } 
}
