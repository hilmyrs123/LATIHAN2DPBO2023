class Human:

    def __init__(self, NIK = "", nama = "", gender = ""):
        self.__NIK = NIK
        self.__nama = nama
        self.__gender = gender

    def getNIK(self):
        return self.__NIK

    def setNIK(self, NIK):
        self.__NIK = NIK

    def getnama(self):
        return self.__nama

    def setnama(self, nama):
        self.__nama = nama

    def getgender(self):
        return self.__gender

    def setgender(self, gender):
        self.__gender = gender