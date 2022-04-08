package com.github.admarc.algorithms.unionfind;

import org.junit.Test;

public class QuickFindTest  extends UnionFindTest {
     @Test
     public void itShouldReturnInformationIfTwoItemsAreConnected() {
          UnionFind  qf = new QuickFind(10);
          setUnions(qf);
          assertConnections(qf);
     }
}
