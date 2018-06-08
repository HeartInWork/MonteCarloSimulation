/**
 * Programming Assignment 1: Percolation
 */

/**
 * @author Peter
 */

import edu.princeton.cs.algs4.*;

public class Percolation {
	private int grid[]; // 1 corresponds to blocked, 0 is open
	private int id[]; //Corresponds to the block id from 0 to n^2 - 1
	private int sz[]; //Size of the tree at this node
	private int N;
	
	public Percolation(int n) {
		if(n <= 0) {
			throw new IllegalArgumentException("n is less than or equal to zero");
		}
		
		id = new int[n*n - 1];
		sz = new int[grid.length];
		grid = new int[grid.length];
		N = n;
		for(int i = 0; i < grid.length; i++) {
			id[i] = i;
			sz[i] = 0;
			grid[i] = 1;
		}
		
	}
	
	private boolean indexInbound(int index) {
		if(index <= 0 || index > N*N) {
			return false;
		}
		return true;
	}
	
	public void open(int row, int col) {
		if(row <= 1 || row > N || col <= 1 || col > N) {
			throw new IllegalArgumentException("index out of range");
		}
		
		grid[row*(N-1) + col] = 0;
		int aboveIndex = row*N + col;
		if(indexInbound(aboveIndex));
		
		
		
	}
}
