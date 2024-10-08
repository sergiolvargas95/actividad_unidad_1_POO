package functions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
    public static LocalDate formatoFecha(String fechaString) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return  LocalDate.parse(fechaString, formato);
    }
}
