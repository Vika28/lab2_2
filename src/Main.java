import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int Year = calendar.get(Calendar.YEAR);
        Wine WineWhite = new Wine("Blanc", "Baron d'Arignac", 2018, "VCE");
        System.out.println("Name - " + WineWhite.getName());
        System.out.println("Trademark - " + WineWhite.getTrademark());
        System.out.println("Bottling Date - " + WineWhite.getBottlingDate());
        System.out.println("Classification - " + WineWhite.getClassification());
        WineWhite.countWineAging(Year);
    }
}
