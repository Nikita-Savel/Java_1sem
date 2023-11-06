package hw_classes;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.management.ObjectName;

public class ListUtil {

    public static List<Integer> rangeList(int from, int to) {
        return new AbstractList<>() {
            
            @Override
            public Integer get(int index) {
                if (index < 0 || index > to - from - 1) {
                    throw new IndexOutOfBoundsException();
                }
                return from + index;
            }

            @Override
            public int size() {
                return to - from;
            }

            @Override
            public int indexOf(Object o) {
                for (int i = from; i < to; i++) {
                    if ((int) o == i) {
                        return i - from;
                    }
                }
                return -1;
            }

            @Override
            public int lastIndexOf(Object o) {
                for (int i = to - 1; i >= from; i--) {
                    if ((int) o == i) {
                        return i - from;
                    }
                }
                return -1;
            }

            @Override
            public boolean contains(Object o) {
                return indexOf(o) != -1;
            }
        };
    }

    public static List<Integer> medianSort(List<Integer> myList) {
        if (myList.size() <= 1) {
            return myList;
        }
        int median = findMedian(myList);
        Comparator<Integer> myComparator = new MedianComparator(median);
        Collections.sort(myList, myComparator);
        return myList;
    }
    
    public static int findMedian(List<Integer> list) {
        Collections.sort(list);
        if (list.size() % 2 != 0) {
            return list.get(list.size() / 2);
        } else {
            return (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) / 2 + (list.get(list.size() / 2 - 1) + list.get(list.size() / 2)) % 2;
        }
    }
}

class MedianComparator implements Comparator<Integer> {

    public int median;

    public MedianComparator(int median) {
        this.median = median;
    }

    @Override
    public int compare(Integer a, Integer b) {
        if (Math.abs(median - a) > Math.abs(median - b)) {
            return 1;
        } else if (Math.abs(median - a) < Math.abs(median - b))  {
            return -1;
        } else {
            return 0;
        }
    }
}
