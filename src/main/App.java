package main;

public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for(int i = 0; i < arrayOrdenado.length; i++ ){
            if(arrayOrdenado[i] == num){  
                return 1;
            }
        }
        return 0;
    }

    public static int maior(int[] arrayDesordenado){
        return -1;
    }

    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }
}
