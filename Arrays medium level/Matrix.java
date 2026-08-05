import java.util.*;
 public class Matrix{
    public  static void setZeroes(int[][] matrix) {
        // Your code goes here
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
            for(int i=0;i<row.length;i++){
                 if(row[i]){
                for(int j=0;j<matrix[0].length;j++){
                   
                        matrix[i][j]=0;
                    }
                }
            }
                for(int i=0;i<col.length;i++){
                    if(col[i]){
                        for(int j=0;j<matrix.length;j++){
                            matrix[j][i]=0;
                        }
                    }
                }
            }



            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int m=sc.nextInt();
                int n=sc.nextInt();
                int[][] matrix=new int[m][n];
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        matrix[i][j]=sc.nextInt();
                    }
                }
                  setZeroes(matrix);
                  for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        System.out.print(matrix[i][j]+" ");
                    }
                  }
                  System.out.println();

            }
     
    
}