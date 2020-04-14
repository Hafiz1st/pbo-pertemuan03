package operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int i = 0;
        i++;                    //i tadinya 0 ditambahkan 1 sehigga i = 1
        System.out.println(i);  //yep betul
        i++;                    //karena i tadinya sudah bernilai  1 maka sekarang ditambahkan 1 menjadi 2
        System.out.println(i);  //betul juga
        i=i+1;                  //bisa dilihat i++ sama dengan i+1
        System.out.println(i);  //i tadi 2 sekarang 3
    }
}