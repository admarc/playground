package com.github.admarc.algorithms.unionfind;

import org.junit.Test;

public class WeightedQuickUnionWithPathCompressionTest extends UnionFindTest {
     @Test
     public void itShouldReturnInformationIfTwoItemsAreConnected() {
          UnionFind  qf = new WeightedQuickUnionWithPathCompression(10);
          setUnions(qf);
          assertConnections(qf);
     }
}
