package in.podtest.bootcamp;

public class Q5_NumberPattern {
    static void printNumberPattern(int n) {

        int rowColCount=2*n-1;
        int[][] arr = new int[rowColCount][rowColCount];
        int startIndex=0;
        int endIndex=rowColCount-1;

        while(n>0){
            for (int i=startIndex;i<=endIndex;i++){
                for (int j=startIndex;j<=endIndex;j++){
                    if (i==startIndex || j==startIndex || i==endIndex || j==endIndex) {
                        arr[i][j] = n;
                    }
                }
            }
            startIndex++;
            endIndex--;
            n--;
        }

        for (int i = 0; i <rowColCount; i++) {
            for (int j = 0; j < rowColCount; j++) {
                    System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
