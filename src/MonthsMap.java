import java.util.HashMap;
import java.util.Map;

public class MonthsMap {
    public static void main(String[] args) {
        Map<String, Integer> months = new HashMap<String, Integer>();

        final String kJune= "June";
        final String kSeptember = "September";
        final String kMarch = "March";
        months.put(kJune, 6);
        months.put(kSeptember, 9);
        months.put(kMarch, 5);

        // Change March
        months.put(kMarch, 3);

        // Remove June
        months.remove(kJune);

        System.out.println("Here are some interesting months");
        for (Map.Entry<String,Integer> month : months.entrySet()){
            System.out.println(month.getKey() + " is month number " + month.getValue() + " of the year ");
        }
        System.out.println("The size of the months dictionary is: " + months.size());
    }
}
