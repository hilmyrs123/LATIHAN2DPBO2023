#import
from sivitas import sivitas

#instansiasi

civitas = sivitas()
civitasarr = []

#entry data
for i in range(3):

    NIK = str(input())
    nama = str(input())
    gender = str(input())
    NIM = str(input())
    prodi = str(input())
    fakultas = str(input())
    asaluniv = str(input())
    emailedu = str(input())

    civitasarr.append(sivitas(NIK, nama, gender, NIM, prodi, fakultas, asaluniv, emailedu))

#print list
i = 0
print("list data : ")
for civitas in civitasarr :
    print(str(i) + ".", civitas.getNIK(), "|", civitas.getnama(), "|", civitas.getgender(), "|", civitas.getNIM(), "|", civitas.getprodi(), "|", civitas.getfakultas(), "|", civitas.getasaluniv(), "|", civitas.getemailedu())
    i += 1



