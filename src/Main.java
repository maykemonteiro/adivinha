import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cont = 0;
        Scanner leitura = new Scanner(System.in);
        int palpite=0;
        int numRand = new Random().nextInt(100);

        System.out.println("Vc tem 5 tentativas para adivinhar o número gerado de 0 a 100: ");
         while(cont <5 || palpite == numRand){
             cont++;
             System.out.println("Tentativa "+cont);
             palpite = leitura.nextInt();
             if(palpite == numRand){
                 System.out.println("Parabéns você acertou!");
             }else{
                 if(cont != 5){
                     if (palpite<numRand){
                         System.out.println("É MAIS!");
                     }else {
                         System.out.println("É MENOS!");
                     }
                     System.out.println("Errou, restam "+(5-cont) + "tentativas!");
                 }else{
                     System.out.println("Tentativas Esgotadas");
                 }
             }
         }
        System.out.println("Numero sorteado: "+numRand);
    }
}