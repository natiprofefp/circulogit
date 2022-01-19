package circulo;
/**
 * Clase <code>Circulo</code> para pruebas en NetBeans 
 */
public class Circulo {
	/**
	 *  valor de x
	 */
    private int x;
    private int y;
    private double radio;


    
    /**
     * Constructor para la clase Circulo que asigna los valores de las
     * coordenadas x, y y el valor del radio
     * @param valorX  vakir de CX
     * @param valorY  valor de y
     * @param valorRadio vaoro
     */

    public Circulo(int valorX, int valorY, double valorRadio) {
    	
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }
  

	 /**
	  * Establece el valor de X con la variable que se le pasa 
	  * @param valorX valor da variable X
	  * @since funcion añadida en la version 2.0
	  */
    public void establecerX(int valorX) {
        x=valorX;
    }

    public int obtenerX() {
        return x;
    }

    
    /**
     * 
     * @param valorY
     * @deprecated esta funcion debería de no emplearse en nuevos proyectos
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    public int obtenerY() {
        return y;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return radio * 2;
    }

    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    public double obtenerArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}
