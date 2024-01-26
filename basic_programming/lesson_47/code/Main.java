import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
//
        LocalTime time = LocalTime.now();
        System.out.println(time);
//
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

//        getNow();
        LocalDateTime date1 = getDate("2022-05-05 12:45:32");
        LocalDateTime date2 = getDate("2023-10-15 16:35:22");
//        System.out.println(date1);
//        System.out.println(date2);

        if (date1.isAfter(date2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        Duration duration = Duration.between(date1, date2);
        System.out.println(duration.toDays());
    }

    public static void  getNow(){
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMM", Locale.CANADA);
        System.out.println(datetime.format(pattern));
    }

    public static LocalDateTime getDate(String dateString){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime datetime = LocalDateTime.parse(dateString, pattern);
        return datetime;
    }

}