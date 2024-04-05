package in.podtest.bootcamp;

public class Q3_StarPattern {

    static void printIsoscelesTrianglePattern(int n){
        for (int i=1;i<=n;i++){
            for(int j=1; j<2*n;j++){
                if ((j>=(n-(i-1))) && (j<=(n+(i-1))))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
