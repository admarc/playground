package com.github.admarc.algorithms.unionfind;

import static org.junit.Assert.assertEquals;

public class UnionFindTest {
     protected void setUnions(UnionFind uf) {
          uf.union(1,2);
          uf.union(3,1);
          uf.union(1,5);
          uf.union(8,9);
          uf.union(7,8);
          uf.union(6,8);
     }

     protected void assertConnections(UnionFind uf) {
          assertEquals(true, uf.connected(1,2));
          assertEquals(true, uf.connected(3,5));
          assertEquals(true, uf.connected(1,2));
          assertEquals(true, uf.connected(8,9));
          assertEquals(true, uf.connected(6,9));
          assertEquals(true, uf.connected(7,8));
          assertEquals(true, uf.connected(7,9));
          assertEquals(false, uf.connected(1,9));
          assertEquals(false, uf.connected(2,8));
     }
}
