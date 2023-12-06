package encapsulamiento;
/**
  * Clase de un 'Avion'; hereda atributos del vehiculo.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class bicicletaElectrica extends Vehiculo{
    private int autonomiaKM;
    private boolean asistElectrica;
        //
    public bicicletaElectrica(String marca, String modelo, int año, String color, int autonomiaKM, boolean asistElectrica){
        super(marca, modelo, año, color);
        this.autonomiaKM = autonomiaKM;
        this.asistElectrica = asistElectrica;
    }
        //Atributos: de los kilimetros autonomos de la bicicleta.
    public int getAutonomiaKM(){
        return autonomiaKM;
    }
    public void setAutonomiaKM(int autonomiaKM){
        this.autonomiaKM = autonomiaKM;
    }
        //Atributos: para saber si la bicicleta es o no electrica.
    public boolean getAsistElectrica(){
        return asistElectrica;
    }
    public void setAsistElectrica(boolean asistElectrica){
        this.asistElectrica = asistElectrica;
    }
    public void mostrarDatos(){
        System.out.println("---Bicicleta Eléctrica---" + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() +
                           "\n Año: "+ getAño() + "\n Color: " + getColor() +
                           "\n Autonomia " + autonomiaKM + "\n Asistencia eléctrica: " + (asistElectrica ? "Si" : "No"));
    }
}
