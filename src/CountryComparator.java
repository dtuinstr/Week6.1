import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {

//    @Override
//    public int compare(Country o1, Country o2) {
//        return o1.getName().compareTo(o2.getName());
//    }

    int direction = 1;

    CountryComparator(int direction) {
        this.direction = direction;
    }

    CountryComparator() {
        this(1);
    }

    @Override
    public int compare(Country o1, Country o2) {
        return direction * o1.getName().compareTo(o2.getName());
    }

}
