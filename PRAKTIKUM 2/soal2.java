import java.util.Scanner;

public class soal2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
            int nilai;
            
        System.out.print("Masukkan Nilai :");
         nilai = input.nextInt();

    if(nilai<41){
            System.out.println("Nilai huruf : E");
        }
        else if(nilai>=41 && nilai<51){
            System.out.println("Nilai huruf : D");
        }
        else if(nilai>=51 && nilai<60){
            System.out.println("Nilai huruf : C");
        }
        else if(nilai>=60 && nilai<69){
            System.out.println("Nilai huruf : BC");
        }
        else if(nilai>=69 && nilai<78){
            System.out.println("Nilai huruf : B");
        }
        else if(nilai>=78 && nilai<87){
            System.out.println("Nilai huruf : AB"); 
        }
        else if(nilai>=87){
            System.out.println("Nilai huruf : A");
        }
        else{
            System.out.println("Nilai tak cocok!!!");
        }
    }
}
