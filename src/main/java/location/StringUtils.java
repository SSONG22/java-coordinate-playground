package location;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<Point> convertLocation(String input){
        List<Point> points = new ArrayList<>();
        for (String pair : input.split("-")) {
            pair = pair.substring(1, pair.length() - 1);
            String[] xy = pair.split(",");
            points.add(new Point(Integer.parseInt(xy[0]), Integer.parseInt(xy[1])));
        }
        return points;
    }
}
