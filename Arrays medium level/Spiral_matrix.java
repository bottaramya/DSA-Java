 import java.util.*;
 public class Spiral_matrix{
    public  static List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
    List <Integer> ans=new ArrayList<>();
    while(top<=bottom&&left<=right){
        for(int i=left;i<=right;i++){
            ans.add(matrix[top][i]);
        }
            top++;
        
        for(int i=top;i<=bottom;i++){
            ans.add(matrix[i][right]);
                
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                ans.add(matrix[bottom][i]);
               
            }
             bottom--;
            }
            
           if(left<=right){
            for(int i=bottom;i>=top;i--){
                ans.add(matrix[i][left]);
               
            }
             left++;
            
           }
    }
        return ans;
    
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
                 List<Integer> ans=spiralOrder(matrix);
                  System.out.println("Spiral Order:");
                  System.out.println(ans);

            }
     
    
}