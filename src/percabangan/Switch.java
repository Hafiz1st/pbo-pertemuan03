package percabangan;

public class Switch {
    public static void main(String[] args) {
        int nilai='C';
        switch (nilai) {
            case 'A':
                System.out.println("Mhs     : \"Terima kasih pak\"");
                System.out.println("Dosen   : \"Selamat ya !! OwO \"");
                break;
            case 'B':
                System.out.println("Mhs     : \"Kenapa ulun kada dapat A pak?\"");
                System.out.println("Dosen   : \"Cacapan asam kamal nyaman.\"");
                break;
            case 'C':
                System.out.println("Mhs     : \"Ulun turun pul Pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Tapi bisa lah manjawab ujian?\"");
                System.out.println("Mhs     : \"Dame desu sensei san. Gommen-ne~~~ (T_T) \"");
                break;
            default:
                System.out.println("Mhs     : \"Terima kasih pak, saya tidak lulus\"");
                System.out.println("Dosen   : \"Selamat ya atas ketidaklulusannya\"");
                break;
        }
    }
}