//Deklarasi kelas Mahasiswa
class Mahasiswa extends Human{
    //Private Attributes
    String NIM;
    String prodi;
    String fakultas;
    
    //Konstruktor
    public Mahasiswa(){
        //konstruktor kosong
    }

    public Mahasiswa(String nama, String NIM, String gender, String prodi, String fakultas){
        //konstruktor dengan parameter
        this.nama = nama;
        this.NIM = NIM;
        this.gender = gender;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    //setter getter

    //SETTER
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }

    public void setfakultas(String fakultas){
        this.fakultas = fakultas;
    }

    //GETTER

     public String getNIM(){
        return this.NIM;
    }

    public String getprodi(){
        return this.prodi;
    }

    public String getfakultas(){
        return this.fakultas;
    }

}