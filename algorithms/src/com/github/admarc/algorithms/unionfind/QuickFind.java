package com.github.admarc.algorithms.unionfind;

public class QuickFind implements UnionFind {
    private int[] id;
    public QuickFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pVal = id[p];
        int qVal = id[q];
        for(int i = 0; i < id.length; i++) {
            if (id[i] == pVal) {
                id[i] = qVal;
            }
        }
    }
}
