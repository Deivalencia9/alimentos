
/**
 * Write a description of class alimentos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    // Tipos de macronutrientes de los que estan constituidos los alimentos por cada 100 gramos.
    private String nombre;
    private float proteinas;
    private float carbohidratos;
    private float grasas;
    private float calorias;

    /**
     * Constructor for objects of class alimentos
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas)
    {
        // Cantidad de calorias que contiene 1 gramo de cada macronutriente
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        calorias = (proteinas*4) + (carbohidratos*4) + (grasas*9);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void muestraDatos()
    {
        // Indica 
        System.out.println("Nombre:" +nombre);
        System.out.println("proteinas:" +proteinas);
        System.out.println("carbohidratos:" +carbohidratos);
        System.out.println("grasas:" +grasas);
        System.out.println("calorias:" +calorias);
    }
}
