from datetime import datetime

class Util:
    @staticmethod
    def formato_fecha(fecha_string):
        formato = "%Y-%m-%d"
        return datetime.strptime(fecha_string, formato).date()
