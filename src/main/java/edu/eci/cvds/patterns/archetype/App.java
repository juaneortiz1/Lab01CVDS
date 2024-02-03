package edu.eci.cvds.patterns.archetype;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0){
            String saludo = args[0];
            System.out.println("El saludo es " +  saludo);

        }
        else{
            System.out.println("No hay saludo");
        }
    }
}
