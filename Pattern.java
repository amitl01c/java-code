import java.util.*;
class Pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a= sc.nextInt();

       // Pattern(a);
        //Pattern1(a);
        Pattern3(a);
       // Pattern4(a);
       // Pattern5(a);
       // Pattern6(a);
        //Pattern8(a);
        //Pattern9(a);
        //Pattern10(a);
       // Pattern11(a);
      // Pattern12(a);
        //Pattern13(a);
        //Pattern14(a);
      //  Pattern15(a);
     // Pattern16(a);

    }

     static void Pattern(int n){
        
        /*Pattern 1
         * @
         * @ @
         * @ @ @
         * @ @ @ @
         */

         for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("0"+" ");
            }
            System.out.println();
         }

         
    }


   
    static void Pattern1(int n){

        /* Pattern 2
          * 0 0 0 0 
            0 0 0
            0 0
            0
          */

          System.out.println();

          for(int i=n;i>=1;i--){
            for(int j = 1;j<=i; j++){
                System.out.print("0"+" "); 
            }
             System.out.println();
          }
    }

     

      static void Pattern3(int n){

        System.out.println();

        for (int i = 1; i<=n; i++)
			{
			    for (int j=1;j<=n;j++)
			    {
			        if(i==1 || j==1 || i==n || j==n || i==(n-1) || j==(n-1) || i==(n-2) || j==(n-2))
			        {
			            	System.out.print("*"+ (" "));
			        }
			        else{
			            	System.out.print(" "+" ");
			        }
			        
			    }
			    	System.out.println("");
			}


      }

       static void Pattern4(int n){
            /*
             *          1
             *        1 1
             *      1 1 1
             *    1 1 1 1 
             *  1 1 1 1 1 
             */


          int a=n-1;
          int b =1;

          System.out.println();
          for(int i=1;i<=n; i++){
            for(int j=1; j<=a;j++){
                System.out.print(" "+" ");
            }
             for(int j=1; j<=b;j++){
                System.out.print("*"+" ");
            }
            a--;
            b++;
            System.out.println();
                        

          }
        
       } 
       
       static void Pattern5(int n){

        /*
         *  0 0 0 0 0
         *    0 0 0 0 
         *      0 0 0
         *        0 0 
         *          0
         */
        System.out.println();
        int space = 0;
        int star = n;
        for(int i=1;i<=n;i++){
             for(int j = 0;j<=space;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("0"+" ");
            }
            space++;
            star--;
            System.out.println();
        }

       }
       
       static void Pattern6(int n){
       System.out.println();
       int sp=n/2;
      int  st=1;
       for(int i= 1;i<=n;i++){
             for(int j=1;j<=sp;j++)
             {
                System.out.print(" "+" ");
             } 
             for(int j=1;j<=st;j++)
             {
                System.out.print("*"+" ");
             }   
             if(i<=n/2){
                sp--;
                st+=2;

             }
             else{
                sp++;
                st-=2;
             }
             System.out.println();
 

       }

       } 
       
       static void Pattern7(int n){

             System.out.println();
       int st=n/2;
      int  sp=1;
       for(int i= 1;i<=n;i++){
             for(int j=1;j<=st;j++)
             {
                System.out.print("*"+" ");
             } 
             for(int j=1;j<=sp;j++)
             {
                System.out.print(" "+" ");
             }  
              for(int j=1;j<=st;j++)
             {
                System.out.print("*"+" ");
             }  
             if(i<=n/2){
                st--;
                sp+=2;

             }
              else{
                st++;
                sp-=2;
             }
            
             System.out.println();
            
            
            }


       } 
       
       static void Pattern8(int n){

        /*
         * 0
         *   0
         *     0
         *       0
         *         0
         */

         for(int i=1; i<=n;i++){

            for(int j = 1; j<=i; j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();



         }


       }
       
       static void Pattern9(int n){

        /*
         *         0
         *       0 
         *     0
         *   0
         * 0
         */

         

          int sp=n-1;
          int st = 1;
          
        for(int i=1; i<=n;i++){

            for(int j = 1; j<=n; j++){

                /* 
                
                    System.out.print(" "+" ");
                }

                for(int j = 1; j<=st; j++){
                    System.out.print("*"+" ");
                }
                
                sp--;

                */
            if(i+j==n+1){
                System.out.print("*"+" ");
            }
            else{
                System.out.print(" "+" ");
            }
                

            }

             System.out.println();
        
        }

           



         }

       
       
       static void Pattern10(int n){

        /*
          * And for pattern
                        0
                      0 0
                    0 0 0      
                  0 0 0 0
                0 0 0 0 0 
                we have to increase sp ++
          */

        int sp=n-1;
          int st = 1;
          
        for(int i=1; i<=n;i++){

            for(int j = 1; j<=sp; j++){
                
                    System.out.print(" "+" ");
                }

                for(int j = 1; j<=st; j++){
                    System.out.print("*"+" ");
                }
                
                sp--;
                st++;
            
                 System.out.println();

            }

       }
       static void Pattern11(int n){
        for(int i=1; i<=n;i++){

            for(int j = 1; j<=n; j++){
                if(i==j ||  i+j == n+1){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();



         }

       }
       static void Pattern12(int n){

        int a= 0;
        int b=1;
        int c=0;
        for(int i= 1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(a +"  ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }

       }
       static void Pattern13(int n){

        /*
         * 
         * 
         */

        for(int i=0;i<n;i++){

            int icj=1;
            for(int j=0 ;j<=i;j++){
                System.out.print(icj+" ");

                int icjp= (icj*(i-j))/j+1;
                icj= icjp;
            }
            System.out.println();
        }

       }
       static void Pattern14(int n){

      System.out.println();
       int sp=n/2;
      int  st=1;
        int a=1;
       for(int i= 1;i<=n;i++){

      
             for(int j=1;j<=sp;j++)
             {
                System.out.print(" "+" ");
             } 

             int b = a;
             for(int j=1;j<=st;j++)
             {
                
                System.out.print(b+" ");
                 if(j<=st/2){
                    b++;
                }
                else {b--;}
               
              
                
              
             }   
             if(i<=n/2 ){
                sp--;
                st+=2;
                a++;
                

             }
             else{
                sp++;
                st-=2;
                a--;
             }
            
             System.out.println();
 

       }
        

       }
       static void Pattern15(int n){

        int st=1;
        int sp = 2*n-3;
        for(int i=1; i <=n; i++){
            int a=1;

            for(int j=1;j<= st;j++)
            { 
                System.out.print(a+" ");
                a++;
            }
             for(int j=1;j<= sp;j++)
            { 
                System.out.print(" "+" ");
            }
              if(i==n){
                    st--;
                    a--;
                }

             for(int j=1;j<= st;j++)
            { 
                a--;
                System.out.print(a+" ");
              
            }
            st++;
            sp-=2;
        
            System.out.println();
        }

       }
       static void Pattern16(int n){

        int sp=n/2;
        int st=1;
        for(int i =1;i <=n; i++){
            for(int j =1; j<=sp;j++){
                if(i==n/2+1){
                    System.out.print("*"+" ");
                }
                else{
                System.out.print(" "+ " ");}
            }
            for (int j=1 ; j<=st;j++){
                System.out.print("*"+ " ");
            }
            if(i<=n/2){
                st++;
            }
            else{
                st--;
            }
            System.out.println();
        }

       }
       static void Pattern17(int n){

       }
       static void Pattern18(int n){

       }
       static void Pattern19(int n){

       }
       static void Pattern20(int n){

       }
       
       
}