import java.util.Arrays;
public class Matrics {
    int n, m;
    int arr[][];
    Matrics(int n) {
        this.n = n;
        this.m = 1;
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = (int) (Math.random() * 11)+1;
            }
        }
    }
    Matrics(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                arr[i][k] = (int) (Math.random() * 11)+1;
            }
        }
    }
    public void View(){
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }
   int[][] Add(int A[][], int B[][], int size) {
        int C[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    int[][] Minus(int A[][], int B[][], int size) {
        int C[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }
    int[][] multiplyMatrices(int firstMatrix[][], int secondMatrix[][]) {
        int result[][] = new int[firstMatrix.length][secondMatrix[0].length];
        int cell = 0;
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                for (int i = 0; i < secondMatrix.length; i++) {
                    cell += firstMatrix[row][i] * secondMatrix[i][col];
                }
                result[row][col] = cell;
                cell = 0;
            }
        }

        return result;
    }
    /****************Task_13*****************/
    void Variable_1(int...v){
        for(int x : v){
            System.out.print(x + " ");
        }
    }
    int Variable_2(int...v){
        int sum = 0;
        for(int x : v){
            System.out.print(x + " ");
            sum += x;
        }
        return sum;
    }
    int Variable_3(int...v){
        int res = 1;
        for(int x : v){
            System.out.print(x + " ");
            res *= x;
        }
        return res;
    }
    void Variable_4(int...v){
        Arrays.sort(v);
        for(int x : v){
            System.out.print(x + " ");
        }
    }
    /***************************************************/
}