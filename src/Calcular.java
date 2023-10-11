/**
 * @author Ismael Alves
 */

public class Calcular {

    public static void main (String args[]) {
     calculoMedia();

    }

    public static void calculoMedia(){
        System.out.println("**** Calculando sua Media ****");

         int nota1 = 10;
         int nota2 = 7;
         int nota3 = 9;
         int nota4 = 10;
         //Essa e a formula que calcula a media
         int media = (nota1+nota2+nota3+nota4)/4;
         //Usei um Operador Relacionado, verificando se a media e maior ou menor que estabelecida
         boolean aprovado = media >5;
         boolean  reprovado = media <5;
         //Fazendo a leitura das notas e imprimindo na tela cada nota
         System.out.println("Primeira Nota: " + nota1);
         System.out.println("Segunda Nota: " + nota2);
         System.out.println("Terceira Nota: " + nota3);
         System.out.println("Quarta Nota: " + nota4);

        //Fazendo a leitura da media e imprimindo na tela
        System.out.println("Sua Media foi: " + media);
        //Fazendo a leitura da situação
        System.out.println("Aprovado: " + aprovado);
    }

}
