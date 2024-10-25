package mobile;

import java.util.Objects;

public class Station {
    String operator;
    Point coords;
    int r;

    public Station(String operator, int x, int y, int r) {
        this.operator = operator;
        this.coords = new Point(x, y);
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Station station = (Station) o;
        return r == station.r && Objects.equals(operator, station.operator) && Objects.equals(coords, station.coords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator, coords, r);
    }

    @Override
    public String toString() {
        return "Station{" +
                "operator='" + operator + '\'' +
                ", coords=" + coords +
                ", r=" + r +
                '}';
    }

    public boolean checkAbonent(Point abonent){
        if( r>= abonent.distanceTo(coords))
            return true;
        else
            return false;
    }


}
