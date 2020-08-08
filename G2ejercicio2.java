 import java.util.Scanner;

public class G2ejercicio2{
    public static void main(String[] args) {
        double resultado, radio, areaCirculo, areaCuadrado;
        
        System.out.print("Programa para calcular el area sombreada entre el circulo y el cuadrado \n Digite el radio del circulo en centimetros" + "\n\n");
        
        Scanner teclado = new Scanner(System.in);
        radio = teclado.nextDouble();
        
        //hallamos el area del circulo
        areaCirculo =  Math.PI * Math.pow(radio, 2);
        
        //hallamos el area del cuadrado
        areaCuadrado = 2.0 * Math.pow(radio, 2);
        
        resultado = areaCirculo - areaCuadrado;
        
        System.out.print("El area sombreada es igual a " + String.format("%.4f", resultado) + " centimetros cuadrados");
        
    }
}