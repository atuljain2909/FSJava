public class Q4_StarPattern {
    static void q4TrianglePattern(int n){
        for (int i=1;i<2*n;i++){
            for(int j=1; j<=n;j++){
                if (i<=n){
                    if (j<=i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else {
                    if (j<=(2*n-i))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
