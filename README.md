# Helen's helper
A task from Numbrs

## Task description

#### Test assignment
Helen's school has provided her with a budget for purchasing the math notebooks her students will need. There are several stores that sell bundles of notebooks at various prices. She can only purchase full bundles. She wants to purchase as many notebooks as she can within her budget.

Determine the maximum number of notebooks Helen can purchase with the amount she is given.

For example, Helen has n = $50 and there are m = 2 stores. The first sells bundles of 20 notebooks for cost $12 each, and the second sells bundles of only 1 notebook for $2 each. She can buy 4 bundles of 20 for $48 leaving her with $2. She can then go to the second store and purchase 1 more notebook for $2, for a total of 81 notebooks.

*Constraints*
 * 1 <= n <= 10^4
 * 1 <= m <= 10^2
 * 1 <= bundleQuantities\[i] <= 20
 * 1 <= bundleCosts\[i] <= 200

The function must return an integer denoting the maximum number of notebooks she can buy with n dollars.

# Instructions

### Prerequisites

To build the source you will need to install JDK 1.8 and Maven (>=3.3.3). 

### Libraries

#### Unit test

   - JUnit 5
   - Hamcrest
   
### Test

```
mvn test
```
