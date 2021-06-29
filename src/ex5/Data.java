package ex5;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {
    private GregorianCalendar gDate;
    private SimpleDateFormat simpleDateFormat;


    @Override
    public String toString() {
        return simpleDateFormat.format(gDate.getTime());
    }

    public Data(int day, int month, int year, SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
        this.gDate = new GregorianCalendar(year,(month - 1),day);
    }

    public Data(int day, int month, int year) {
        this.simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.gDate = new GregorianCalendar(year,(month - 1),day);
    }

    public void adicionarDia(){
        this.gDate.add(Calendar.DAY_OF_MONTH, 1);
    }
}
