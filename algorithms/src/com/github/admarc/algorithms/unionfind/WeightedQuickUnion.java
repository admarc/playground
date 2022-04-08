package com.github.admarc.algorithms.unionfind;

public class WeightedQuickUnion implements UnionFind {
    private int[] id;
    private int[] size;
    public WeightedQuickUnion(int n) {
        id = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
            size[i] = 1;
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
        int pRoot = getRoot(p);
        int qRoot = getRoot(q);

        if(pRoot == qRoot) {
            return;
        }

        if (size[p] < size[q]) {
            size[q] += size[p];
            id[pRoot] = qRoot;
        } else {
            size[p] += size[q];
            id[qRoot] = pRoot;
        }
    }
}
