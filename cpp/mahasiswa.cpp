#include "human.cpp"

class mahasiswa : public human
{
private:
    string nim, prodi, fakultas;

    // Konstruktor
public:
    mahasiswa()
    {
        this->nim = "";
        this->prodi = "";
        this->fakultas = "";
    }

    mahasiswa(string nim, string prodi, string fakultas)
    {
        // konstruktor dengan parameter
        this->nim = nim;
        this->prodi = prodi;
        this->fakultas = fakultas;
    }

    // setter getter

    // SETTER

    void setnim(string nim)
    {
        this->nim = nim;
    }

    void setprodi(string prodi)
    {
        this->prodi = prodi;
    }

    void setfakultas(string fakultas)
    {
        this->fakultas = fakultas;
    }

    // GETTER

    string getnim()
    {
        return this->nim;
    }

    string getprodi()
    {
        return this->prodi;
    }

    string getfakultas()
    {
        return this->fakultas;
    }

    ~mahasiswa()
    {
    }
};