#include "mahasiswa.cpp"

class sivitas : public mahasiswa
{
private:
    string asaluniv, emailedu;

    // Konstruktor
public:
    sivitas()
    {
        this->asaluniv = "";
        this->emailedu = "";
    }

    sivitas(string asaluniv, string emailedu)
    {
        // konstruktor dengan parameter
        this->asaluniv = asaluniv;
        this->emailedu = emailedu;
    }

    // setter getter

    // SETTER

    void setasaluniv(string asaluniv)
    {
        this->asaluniv = asaluniv;
    }

    void setemailedu(string emailedu)
    {
        this->emailedu = emailedu;
    }

    // GETTER

    string getasaluniv()
    {
        return this->asaluniv;
    }

    string getemailedu()
    {
        return this->emailedu;
    }

    ~sivitas()
    {
    }
};