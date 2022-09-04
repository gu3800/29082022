package pkg29082022;

public class Main {
    public static void main(String[] args) {
        int tabuada;
        int coluna [] = new int [11];
        int linha [] = new int [11];
        for(int i = 1; i < coluna.length; i++){
            for(int j = 1; j < linha.length; j++){
                tabuada = i*j;               
                System.out.println(tabuada);
            }               
        }
    } 
}
