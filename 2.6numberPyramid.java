public class Main {
    public static void main (String...args) {
        int i , j , k ;
        int n = 5 ;
        int count = 1 ;
        for(i = 1 ; i <= n ; i++ ) {
            for(k = 1; k <= n-i ; k++) {
                System.out.print(" ");
            }
            for(j = 1 ; j <= i ; j++) {
                if(count < 10) {
                    System.out.print("0");
                }
                
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
