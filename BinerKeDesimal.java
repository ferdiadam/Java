//dibuat oleh Ferdi Adam
package recursion;

//mengimpor kelas scanner untuk membaca input
import java.util.Scanner; 

//membuat kelas dengan nama "BinerKeDesimal"
public class BinerKeDesimal {
    public static void main(String[]args){

        //membuat objek scanner yang dinamakan "sc" untuk menerima input dari pengguna
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan angka biner");

        //membuat objek "binary" untuk mebaca bilangan bulat
        int binary = sc.nextInt();
        //memanggil metode rekursif untuk mengonversi angka biner menjadi angka desimal
        int result = decimal(binary);
        System.out.println("Angka desimalnya adalah "+result);
        
    }
    public static int decimal(int binary){
        if(binary==0){
            return 0;
        }
        else {
            //menimplementasikan logika konversi biner ke desimal
            return(binary%10+2*decimal(binary/10));
        } 
    }
}