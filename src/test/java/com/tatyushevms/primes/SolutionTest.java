package com.tatyushevms.primes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@DisplayName("Solution tests")
class SolutionTest {
    
    private final Solution solution = new Solution();
    
    @Test
    @DisplayName("Description example")
    void descriptionExample() {
        //given
        final int budget = 50;
        final List<Integer> bundleQuantities = Arrays.asList(20, 1);
        final List<Integer> bundleCosts = Arrays.asList(12, 2);
        
        //when
        final int result = solution.budgetShopping(budget, bundleQuantities, bundleCosts);
        
        //then
        assertThat(result, is(equalTo(81)));
    }
    
    @Test
    @DisplayName("Handles one bundle (Test case #)")
    void shouldHandleOnlyBundle() {
        //given
        final int budget = 4;
        final List<Integer> bundleQuantities = Collections.singletonList(10);
        final List<Integer> bundleCosts = Collections.singletonList(2);
        
        //when
        final int result = solution.budgetShopping(budget, bundleQuantities, bundleCosts);
        
        //then
        assertThat(result, is(equalTo(20)));
    }
    
    @Test
    @DisplayName("Bays maximum amount (Test case #)")
    void shouldBayMaximumAmount() {
        //given
        final int budget = 50;
        final List<Integer> bundleQuantities = Arrays.asList(20, 19);
        final List<Integer> bundleCosts = Arrays.asList(24, 20);
        
        //when
        final int result = solution.budgetShopping(budget, bundleQuantities, bundleCosts);
        
        //then
        assertThat(result, is(equalTo(40)));
    }
    
}
