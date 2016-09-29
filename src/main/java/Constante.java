/**
 * Created by alumno on 29/09/16.
 */
public class Constante implements Expresiones {
    double valor;

    public Constante(double numero) {

        this.valor = numero;

    }

    public double evaluar(){

        return valor;

    }
}
