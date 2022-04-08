package com.github.admarc.algorithms.unionfind;

public class QuickUnion implements UnionFind {
    private int[] id;
    public QuickUnion(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }
    public boolean connected(int p, int q) {
        return getRoot(p) == getRoot(q);
    }

    private int getRoot(int p) {
        while (id[p] != p) {
            p = id[p];
        }

        return p;
    }

    public void union(int p, int q) {
        id[getRoot(p)] = getRoot(q);
    }
}
