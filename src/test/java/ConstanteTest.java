import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alumno on 29/09/16.
 */
public class ConstanteTest {

    @Test
    public void constanteClass(){

       Constante dos = new Constante(2);
       Constante cuatro = new Constante(4);
        Assert.assertEquals(2,dos.evaluar(),0);
        Assert.assertEquals(4,cuatro.evaluar(),0);

    }

    @Test
    public void constanteClass2(){
       Constante cuatro = new Constante(4);
       Constante dos = new Constante(2);
       Sumar sumaDosMasCuatro = new Sumar(dos, cuatro);
       Sumar sumaDeOperaciones = new Sumar (sumaDosMasCuatro, cuatro);
        Assert.assertEquals(6,sumaDosMasCuatro.evaluar(),0);
        Assert.assertEquals(10,sumaDeOperaciones.evaluar(),0);


    }

}
