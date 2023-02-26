//library
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

    public static void printmenu(){
        System.out.println("-----------------");
        System.out.println("Ketik 0 untuk exit");
        System.out.println("Ketik angka di sini untuk menambah data: ");
    }

    public static void printlist(ArrayList<Sivitas> list){
        int i = 0;
        for(Mahasiswa mhsw : list){
                System.out.println("");
                System.out.print(i + ".");
                i++;
                System.out.println(mhsw);

        }
    }

    public static void main(String[] args){
        //buat scanner 
        Scanner sc = new Scanner(System.in);

        //membuat array list
        ArrayList<Sivitas> list = new ArrayList<Sivitas>();
        
        //Instansiasi pake sivitas krn biar bawa semua atribut ortu
        Sivitas civitas = new Sivitas();
        civitas.setnama("Ujang");
        civitas.setnik("322");
        civitas.setgender("Pria Sigma");
        civitas.setNIM("010001");
        civitas.setfakultas("FPBTS");
        civitas.setprodi("Sastra Elektro");
        civitas.setasal("Uniga");
        civitas.setemail("leverkussen@mail.uniga.edu");
        list.add(civitas);

        //print list data yang ada
        System.out.println("List Data");

        printlist(list);

        printmenu();

        //meminta input
        int wantedmethod = 0;
        boolean valid = true;

        //cek valid atau tidaknya inputan
        while(valid != false){
            wantedmethod = sc.nextInt();
            if(wantedmethod >= 1 && wantedmethod != 0){
                //instantiasi mhsnew dari sivitas agar bisa bawa atribut ortunya
                Sivitas mhsnew = new Sivitas();

                //untuk makan new line dari si nextInt()
                sc.nextLine();

                //add data

                System.out.print("Input Nama : "); 
                mhsnew.setnama(sc.nextLine());
                System.out.print("Input NIK : ");
                mhsnew.setnik(sc.nextLine());
                System.out.print("Input Gender ");
                mhsnew.setgender(sc.nextLine());
                System.out.print("Input NIM : ");
                mhsnew.setNIM(sc.nextLine());
                System.out.print("Input Prodi : ");
                mhsnew.setprodi(sc.nextLine());
                System.out.print("Input Fakultas : ");
                mhsnew.setfakultas(sc.nextLine());
                System.out.print("Input Asal Universitas : ");
                mhsnew.setasal(sc.nextLine());
                System.out.print("Input Email : ");
                mhsnew.setemail(sc.nextLine());

                list.add(mhsnew);

                System.out.println("Berhasil menambahkan data");
                printlist(list);

                printmenu();
                valid = true;
            }
            else{
                System.exit(0);
            }
            
        }
        
        
        
        
        sc.close();


    }
}