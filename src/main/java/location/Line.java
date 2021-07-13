package location;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Location> locations;

    private Line(List<Location> list) {
        locations = list;
    }

    public static Line of(String input) {
        List<Location> locations = new ArrayList<>();
        for (String pair : input.split("-")) {
            pair = pair.substring(1, pair.length() - 1);
            String[] xy = pair.split(",");
            locations.add(new Location(Integer.parseInt(xy[0]), Integer.parseInt(xy[1])));
        }
        return new Line(locations);
    }

    public double length() {
        return locations.get(0).differ(locations.get(1));
    }
}
