package com.tatyushevms.primes;

import java.util.Comparator;

public class CustomComparator implements Comparator<Bundle> {
    
    final int remains;
    
    public CustomComparator(int remains) {
        this.remains = remains;
    }
    
    @Override
    public int compare(Bundle o1, Bundle o2) {
        final int n1 = remains / o1.getCost();
        final int n2 = remains / o2.getCost();
        return n1 == n2 ?
                descending(o1.getQuantity(), o2.getQuantity()) :
                ascending(o1.getPrice(), o2.getPrice());
    }
    
    private int descending(int o1, int o2) {
        return Integer.compare(o2, o1);
    }
    
    private int ascending(double o1, double o2) {
        return Double.compare(o1, o2);
    }
    
}
