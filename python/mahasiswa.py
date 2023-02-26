from human import Human

class mahasiswa(Human):

    def __init__(self, NIK="", nama="", gender="", NIM = "", prodi = "", fakultas = ""):
        super().__init__(NIK, nama, gender)
        self.__NIM = NIM
        self.__prodi = prodi
        self.__fakultas = fakultas

    def getNIM(self):
        return self.__NIM

    def setNIM(self, NIM):
        self.__NIM = NIM

    def getprodi(self):
        return self.__prodi

    def setprodi(self, prodi):
        self.__prodi = prodi

    def getfakultas(self):
        return self.__fakultas

    def setfakultas(self, fakultas):
        self.__fakultas = fakultas

    