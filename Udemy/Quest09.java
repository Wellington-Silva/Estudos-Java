package matrizes;
import java.util.Random;
public class Quest09 {
    public static void main(String[] args){
        Random random = new Random();
        
        String M[][] = new String[12][12];
        
        for (int i = 0; i < M.length; i++){
            for (int j=0; j< M.length; j++){
                M[i][j] = "#";
                System.out.print(M[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        int cont = M.length-1;
        for (int i = 0; i<M.length-1; i++ ){
            for (int j = 0; j < cont; j++){
                M[i][j] = "#";
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
            cont--;
        }
        
        cont = M.length -1;
        for(int i=0; i<M.length -1; i++){
            for(int j = 0; j < cont; j++){
                M[i][j] = "#";
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
            cont--;
        }
    }
}
