import java.util.*;
class HighestO2Level{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] trainee = new int[3][3];
        int [] avg = new int[3];
        int max = 0;
             
        System.out.println("enter the O2 level of trainees");
        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
            trainee[i][j] = sc.nextInt();
            
                if(trainee[i][j] < 1 && trainee[i][j] > 100 ){ 
                    trainee[i][j] = 0;
                }
                

            }
        }


        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
            System.out.print( trainee[i][j] + "  ");
            }
            System.out.println();
        }

         for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
           avg[i] += trainee[j][i];
            }
            avg[i] /= 3;
        }

         for(int i = 0; i < 3; i++){
           
            System.out.print(avg[i] + "  ");
            
            System.out.println();
        }

        
         for(int i = 0; i < 3; i++){
           if(avg[i] > max ){
            max = avg[i];
           }
        }

     

        for(int i = 0; i < 3; i++){
            if(avg[i]==max){
                System.out.println("Trainee " + (i+1) +" is qualified" );
            }

             else{
                System.out.println("Trainee " + (i+1) +" is not qualified" );
            }
        }

    }

   
}