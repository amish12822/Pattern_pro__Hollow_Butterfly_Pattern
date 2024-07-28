/**
 * hollow_butterfly_pattern
 */
public class hollow_butterfly_pattern {

    public static void main(String[] args) {
        
        int n = 5;

        for (int  i=1; i<=n; i++){

            // first part
            
            for (int j=1; j<=1; j++){
                System.out.print("*");
            }
        
            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }

            if ( i>=2 ){
                for (int j=1; j<=1; j++){
                    System.out.print("*");
                }
            }
            
            // space 
            int space = ( n-i )*2;
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            if ( i>=2 ){
                for (int j=1; j<=1; j++){
                    System.out.print("*");
                }
            }

            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // down side

        for (int  i=n; i>=1; i--){

            // first part

            for (int j=1; j<=1; j++){
                System.out.print("*");
            }
        
            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }

            if ( i>=2 ){
                for (int j=1; j<=1; j++){
                    System.out.print("*");
                }
            }
            
            // space 
            int space = ( n-i )*2;
            for (int j=1; j<=space; j++){
                System.out.print(" ");
            }

            if ( i>=2 ){
                for (int j=1; j<=1; j++){
                    System.out.print("*");
                }
            }

            for (int j=3; j<=i; j++){
                System.out.print(" ");
            }

            for (int j=1; j<=1; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}