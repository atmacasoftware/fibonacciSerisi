import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int elemanSayisi, birinciElaman = 0, ikinciElaman = 1, ucuncuElaman;

        //Scanner sınıfının import edilmesi
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan elaman sayısının alınması
        System.out.print("Elaman sayısını giriniz : ");
        elemanSayisi = input.nextInt();

        //Hatalı veri girilmesinin kontrolü
        if(elemanSayisi > 0){
            ucuncuElaman = birinciElaman + ikinciElaman;

            for(int i=1; i <= elemanSayisi; i++){
                ucuncuElaman = birinciElaman + ikinciElaman;
                System.out.println(birinciElaman + " + " + ikinciElaman + " = " + ucuncuElaman);
                birinciElaman = ikinciElaman;
                ikinciElaman = ucuncuElaman;
            }
        } else{
            System.out.println("Hatalı bir değer girdiniz.");
        }

    }
}