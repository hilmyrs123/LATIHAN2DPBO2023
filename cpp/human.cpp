#include <iostream>
#include <string>

using namespace std;

class human
{

private:
    string nama, nik, gender;

    // Konstruktor
public:
    human()
    {
        this->nama = "";
        this->nik = "";
        this->gender = "";
    }

    human(string nama, string nik, string gender)
    {
        // konstruktor dengan parameter
        this->nama = nama;
        this->nik = nik;
        this->gender = gender;
    }

    // setter getter

    // SETTER

    void setnama(string nama)
    {
        this->nama = nama;
    }

    void setnik(string nik)
    {
        this->nik = nik;
    }

    void setgender(string gender)
    {
        this->gender = gender;
    }

    // GETTER

    string getnama()
    {
        return this->nama;
    }

    string getnik()
    {
        return this->nik;
    }

    string getgender()
    {
        return this->gender;
    }

    ~human()
    {
    }
};