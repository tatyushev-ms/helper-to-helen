package com.tatyushevms.helpertohelen;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public int budgetShopping(int n, List<Integer> bundleQuantities, List<Integer> bundleCosts) {
        final int amount = bundleQuantities.size();
        final List<Bundle> bundles = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            bundles.add(new Bundle(bundleQuantities.get(i), bundleCosts.get(i)));
        }
        int result = 0;
        boolean traversed = false;
        while (!traversed) {
            bundles.sort(new CustomComparator(n));
            final Result purchase = makePurchase(bundles, n);
            n -= purchase.getSpent();
            result += purchase.getBought();
            traversed = purchase.isTraversed();
        }
        return result;
    }
    
    private Result makePurchase(List<Bundle> bundles, int n) {
        for (int i = 0; i < bundles.size(); i++) {
            final Bundle bundle = bundles.get(i);
            if (bundle.getCost() <= n) {
                final int k = n / bundle.getCost();
                return new Result(k * bundle.getCost(), k * bundle.getQuantity(), i == bundles.size() - 1);
            }
        }
        return new Result(0, 0, true);
    }
    
}
