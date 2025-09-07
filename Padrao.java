import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*TUDO QUE EU USEI ATE AGORA */

public class Padrao {

    public static void main (String[] args) {
    
    /*Definir variavel para entrada de dados e entrada de dados*/
    Scanner sca = new Scanner(System.in); 
    String teste;
    System.out.println("Digite algo: ");
    teste = sca.nextLine(); /*nextInt, nextFloat .. */  
    System.out.println("Aqui esta oque voce digitou: " + teste); /* ln é quebra linha*/        




    /*Estruturas de repetição, lista e metodos*/
    int saida = 0;/*se o metodo .equals encontrar o 's', saida ganha +1 e encerra o looping while */
    String palavra= ""; 
    List<String> lista = new ArrayList<>(); /*dentro de < > definimos o tipo da lista, integer, string..*/

    while (saida == 0){

    System.out.println("Digite uma palavra: ('s' para sair do loop )");

    palavra = sca.nextLine();
    
     if (palavra.equals("s")){

       saida +=1; 
    } else{

        lista.add(palavra);/*Jogando o valor da variavel teste para a lista*/

    } /*Fim if e else */

    }/*Fim do While*/
     
 

   
    /*A variavel que receber os valores da lista deve ter o mesmo tipo (string, int, etc ..) */
    System.out.println("Nomes na lista: ");
    for (String nom : lista){
        
    System.out.println(nom);/*nom recebe o valor da posição da lista que o for estar e depois imprimindo aqui */

    }  


    /*Com o get conseguimos imprimir um valor que esta na lista(No caso imprimindo oque esta na posição 0)*/
    System.out.println("Aqui esta a primeira coisa digitada: " + lista.get(0));


    /*Com o remove excluimos uma posição da lista (No caso excluindo a posição 0) e em seguida a lista ira se reorganizar */
    lista.remove(0);
    /*Confira que a posição 0 saiu */
    for (String nom : lista){
        
    System.out.println(nom);/*nom recebe o valor da posição da lista que o for estar e depois imprimindo aqui */

    }  



    /*com o indexof conseguir a posição do elemento na lista e se não achar retorna -1 */
    int posicao;

    System.out.println("Digite um nome: ");

    palavra = sca.nextLine();

    posicao = lista.indexOf(palavra);/*Procurando o valor dado a variavel palavra dentro da lista, e atribuindo sua posição na variavel "posicao"*/

    System.out.println(posicao);

    sca.close(); /*fechando o sca */

     /*TESTE GITHUB */

}/*FIM VOID */
}/*FIM PUBLIC CLASS */
