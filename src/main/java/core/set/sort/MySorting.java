package core.set.sort;

import java.util.Comparator;

public class MySorting implements Comparator {

  @Override
  public int compare(Object o1, Object o2) {

    Integer d1 = (Integer) o1;
    Integer d2 = (Integer) o2;

    if (d1 < d2) {
      return +1;
    }
    if (d1 > d2) {
      return -1;
    } else {
      return 0;
    }
  }

}
