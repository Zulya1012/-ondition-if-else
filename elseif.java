import java.util.Scanner;
 
public class elseif {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in); 
        System.out.println("Vvedite pervoye chislo: ");
        int a= in.nextInt();
         
        System.out.println("Vvedite vtoroye chislo: ");
        int b= in.nextInt();
 
        if(a > b){
            System.out.println("Pervoye chislo bolshe vtoroqo");
        }
        else if (a < b){
            System.out.println("Pervoye chislo menshe vtoroqo");
        }
        else{
            System.out.println("Oba chisla ravni");
        }
    }
}