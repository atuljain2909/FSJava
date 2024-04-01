public class LoopingConcepts1 {
    public static void main(String[] args){
        /*
        ------------
        Program to print the following pattern:
        *****
        ****
        ***
        **
        *
        ------------
         */
        int i,j;
        for(i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
