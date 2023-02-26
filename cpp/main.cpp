#include "sivitas.cpp"
#include <bits/stdc++.h>

int main()
{

    sivitas civitas;

    list<sivitas> civilist;

    string nik, nama, gender, nim, prodi, fakultas, asaluniv, email;

    // input
    for (int i = 0; i < 3; i++)
    {
        sivitas temp;

        cin >> nik;
        cin >> nama;
        cin >> gender;
        cin >> nim;
        cin >> prodi;
        cin >> fakultas;
        cin >> asaluniv;
        cin >> email;

        temp.setnik(nik);
        temp.setnama(nama);
        temp.setgender(gender);
        temp.setnim(nim);
        temp.setprodi(prodi);
        temp.setfakultas(fakultas);
        temp.setasaluniv(asaluniv);
        temp.setemailedu(email);

        civilist.push_back(temp);
    }

    // output
    int i = 0;
    for (list<sivitas>::iterator it = civilist.begin(); it != civilist.end(); it++)
    {
        cout << (i + 1) << "." << it->getnik() << "|" << it->getnama() << "|" << it->getgender()
             << "|" << it->getnim() << "|" << it->getprodi() << "|" << it->getfakultas() << "|" << it->getasaluniv() << "|" << it->getemailedu() << endl;
        i++;
    }

    return 0;
}