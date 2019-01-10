
package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        int valor1=2;
        int valor2=4;
        int salida;
        
        Suma sum=new Suma();
        Resta rest=new Resta();
        Multiplicacion mult= new Multiplicacion();
        Division div=new Division();
        Impresora imp=new Impresora();
        
        
        salida=sum.sumar(valor1, valor2);
        imp.imprimir(Integer.toString(salida));
        
        salida=rest.restar(valor1, valor2);
        imp.imprimir(Integer.toString(salida));
        
        salida=mult.multiplicar(valor1, valor2);
        imp.imprimir(Integer.toString(salida));
        
        salida=div.dividir(valor1, valor2);
        imp.imprimir(Integer.toString(salida));

    }
    
}
