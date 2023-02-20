class Sivitas extends Mahasiswa{

    String asal_univ;
    String email_edu;

    Sivitas(){
        //konstruktor kosong
    }

    Sivitas(String asal_univ, String email_edu){
        this.asal_univ = asal_univ;
        this.email_edu = email_edu;
    }

    //setter & getter
    void setasal(String asal_univ){
        this.asal_univ = asal_univ;
    }

    String getasal(){
        return this.asal_univ;
    }

    void setemail(String email_edu){
        this.email_edu = email_edu;
    }

    String getemail(){
        return this.email_edu;
    }

    //method
    @Override
    //method untuk mengubah hashcode menjadi string
    public String toString(){
        return  this.getnama() + " " + this.getnik() + " "
        + this.getgender() + " " + this.getNIM() + " " 
        + this.getprodi() + " " + this.getfakultas() + " " 
        + this.getasal() + " " + this.getemail();
    }

}