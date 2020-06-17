/*Arkanabytes*/
package ejemplofibonacci;
public class EjemploFibonacci {
    int fib (int n){
        //los parentesis se declara la variable n y le
        //ordenamos que devueva como un entero
     if (n<2)
//condicional si n es menor que 2 devolvera n
        return n;
     else
//sino devolvemos el fibonacci de
         return fib(n+1)+fib (n-2);//es el algoritmo de fibonacci
    // es decir el algoritmo consiste en la suma de dos
    //numero fibonacci anteriores ejempplo 
    //0+1=1 el siguiente 1+1=2 siguiente 2+3=5
     
    // return situado al final del programa principal
    //para que concluya el programa
        
    }

    public static void main(String[] args){
      System.out.println("El fib(5) es: " + (5));
    }//La funcion main hace un llamado al ejercicio 
    
}
