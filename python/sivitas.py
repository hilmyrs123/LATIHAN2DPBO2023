from mahasiswa import mahasiswa

class sivitas(mahasiswa):

    def __init__(self, NIK="", nama="", gender="", NIM="", prodi="", fakultas="", asaluniv = "", emailedu = ""):
        super().__init__(NIK, nama, gender, NIM, prodi, fakultas)
        self.__asaluniv = asaluniv
        self.__emailedu = emailedu

    def getasaluniv(self):
        return self.__asaluniv

    def setasaluniv(self, asaluniv):
        self.__asaluniv = asaluniv

    def getemailedu(self):
        return self.__emailedu

    def setemailedu(self, emailedu):
        self.__emailedu = emailedu

    