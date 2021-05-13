package ultimaminiprova;
import java.util.Scanner;
public class UltimaMiniProva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigo[] = new int[20]; 
        String titulo[] = new String[20];
        String genero[] = new String[20];
        String classificacao[] = new String[20];
        int maisVendido=0, menosVendido=100, contGen=0;
        
        System.out.println("CADASTRAMENTO");
        
        for(int i=1; i <= 5; i++){
            System.out.println("Filme "+i);
            
            System.out.println("Informe o código do filme: ");
            codigo[i] = sc.nextInt();
            
            System.out.println("Informe o título do filme: ");
            titulo[i] = sc.next();
                        
            System.out.println("Informe o gênero do filme. Este deve ser um destes: ");
            System.out.println("Romance - Suspense - Comédia - Terror - Drama");
            genero[i] = sc.next();  
            
            System.out.println("Dê uma classificação para o filme (Gold - R$ 16,99 ou Silver - R$ 11,99): ");
            classificacao[i] = sc.next();  
            
            if(genero[i].equals("Romance")){
                contGen++;
            } else if(genero[i].equals("Suspense")){
                contGen++;
            } else if(genero[i].equals("Comédia")){
                contGen++;
            } else if(genero[i].equals("Terror")){
                contGen++;
            } else if(genero[i].equals("Drama")){
                contGen++;
            }
                
            System.out.println("-----------------------------------------------------");
        } 
        
        System.out.println("VENDAS");
        
        // Saber mais vendido e menos vendido
        int parada=0, qtdFilmes=0, cod=0;        
        String tit=null, gen=null, clas=null;
        do{           
            // Qual o código
            System.out.println("Escolha um dos códigos");
            for(int i=0; i<5; i++){
                System.out.print(codigo[i] + " ");                
            }
            System.out.println();
            
            System.out.println("Qual o código do livro a ser comprado? ");
            cod = sc.nextInt();
            for(int i=0; i<codigo.length; i++){
                if(cod == codigo[i]){
                    System.out.println("Código do produto: "+codigo[i]);
                }
            }
            if(cod == -1){
                break;
            }
            // Qual título
            for(int i=0; i<titulo.length; i++){
                System.out.print(titulo[i] + " ");                
            }
            System.out.println();
            
            System.out.println("Qual o título do filme? ");
            tit = sc.next();
            for(int i=0; i<titulo.length; i++){
                if(tit.equals(titulo[i])){
                    System.out.println("O título é: "+titulo[i]);
                }
            }
            
            //Qual o gênero
             for(int i=0; i<genero.length; i++){
                System.out.print(genero[i] + " ");                
            }
            System.out.println();
            
            System.out.println("Qual o gênero do filme? ");
            gen = sc.next();
            for(int i=0; i<genero.length; i++){
                if(gen.equals(genero[i])){
                    System.out.println("O gênero é: "+genero[i]);
                }
            } 
            
            // Qual a classificação
            for(int i=0; i<classificacao.length; i++){
                System.out.print(classificacao[i] + " ");                
            }
            System.out.println();
            
            System.out.println("Qual a classificação do filme? ");
            clas = sc.next();
            for(int i=0; i<genero.length; i++){
                if(clas.equals(classificacao[i])){
                    System.out.println("A classificação é: "+genero[i]);
                }               
            }
            if(clas.equals("Gold")){
                System.out.println("O valor é R$ 16,99");
            }
            if(clas.equals("Silver")){
                System.out.println("O valor é R$ 11,99");
            }           
            
        }while(parada != -1);
        
        for(int i = 0; i<20; i++){
            if(codigo[i] > maisVendido){
                maisVendido = codigo[i];
            }
            if(codigo[i] < menosVendido){
                menosVendido = codigo[i];
            }
        }
        System.out.println("Mais vendido: "+ maisVendido);
        System.out.println("Menos vendido: "+ menosVendido);
        
    } // Fim método principal    
} // Fim classe
