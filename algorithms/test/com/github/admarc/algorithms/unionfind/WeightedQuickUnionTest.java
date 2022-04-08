package com.github.admarc.algorithms.unionfind;

import org.junit.Test;

public class WeightedQuickUnionTest extends UnionFindTest {
     @Test
     public void itShouldReturnInformationIfTwoItemsAreConnected() {
          UnionFind  qf = new WeightedQuickUnion(10);
          setUnions(qf);
          assertConnections(qf);
     }
}
