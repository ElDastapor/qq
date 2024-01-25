package Time;
import java.util.Date;
public class TT {
    public static void main(String[] args) {

        // comment from IDEA

        // comment from Hub
        
        Date d = new Date();
        int i = d.getTimezoneOffset();
        System.out.println(i);

        System.out.println(d.toGMTString());

        System.out.println(d.toLocaleString());

        System.out.println(d.toString());

        Date с = new Date();

        System.out.println(d.compareTo(с));
        System.out.println(d.compareTo(с));
    }
}
