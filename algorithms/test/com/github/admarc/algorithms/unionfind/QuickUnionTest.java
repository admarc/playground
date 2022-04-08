package com.github.admarc.algorithms.unionfind;

import org.junit.Test;

public class QuickUnionTest  extends UnionFindTest {
     @Test
     public void itShouldReturnInformationIfTwoItemsAreConnected() {
          UnionFind  qf = new QuickUnion(10);
          setUnions(qf);
          assertConnections(qf);
     }
}
