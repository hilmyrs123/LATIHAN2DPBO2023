public class Human{

    String nama;
    String nik;
    String gender;


 //Konstruktor
    public Human(){
        //konstruktor kosong
    }

    public Human(String nama, String nik, String gender){
        //konstruktor dengan parameter
        this.nama = nama;
        this.nik = nik;
        this.gender = gender;
    }

    //setter getter

    //SETTER
    public void setnama(String nama){
        this.nama = nama;
    }

    public void setnik(String nik){
        this.nik = nik;
    }

    public void setgender(String gender){
        this.gender = gender;
    }

    //GETTER
    public String getnama(){
        return this.nama;
    }

     public String getnik(){
        return this.nik;
    }

    public String getgender(){
        return this.gender;
    }

}