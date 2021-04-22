package maciek;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        if(h2 == null) return -1;
        if(h2.getSalary() > h1.getSalary()) return 1;
        else if(h1.getSalary() > h2.getSalary()) return -1;
        else return 0;
    }
}
