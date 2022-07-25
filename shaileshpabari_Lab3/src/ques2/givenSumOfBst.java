package ques2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class givenSumOfBst {
	
	public static int numberOfNodes() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the no of nodes you want");
		
		int a = sc1.nextInt();
		return a;	
	}
	
	public static int []  valuesOfArray  (   int a ) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the values of array");
		
		int [] brr1 = new int [a];
		
		for(int i=0;i<a;i++) {	
			brr1[i]=sc1.nextInt();
		}
		Arrays.sort(brr1);
		return brr1;	
	}
	public static int getTargetSum() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the target sum");
		
		int targetSum = sc1.nextInt();
		return targetSum;	
	}
	
	 public static  List<Integer> convertArrayToList(int brr1[])
	    {
	        List<Integer> list = new ArrayList<>();
	        for (int t : brr1) {
	            list.add(t);
	        }
	        return list;
	    }
	 
	 public static Node constructMinHeightBst(List<Integer> k,int start,int end)
		{
			if(start>end)
			{
				return null;
			}
			int mid =(start+end)/2;
			
			Node bst = new Node(k.get(mid));
			bst.left =constructMinHeightBst(k, start, mid-1);
			bst.right =constructMinHeightBst(k,mid+1,end);
			return bst;
	    }
	 
	 public static int[] convert(final List<Integer> list)
		
	 	{
		   final int[] out = new int[list.size()];
		   Arrays.setAll(out, list::get);
		   return out;
		}
	 
	 public static List<Integer> inOrder(Node  tree, List<Integer> array) {
			
			if(tree.left!=null)
			{
				inOrder(tree.left, array);
			}
			array.add(tree.data);
			
			if(tree.right!=null)
			{
				inOrder(tree.right,array);
			}
			return array;
		}
		
	 
	 public static String checkSumBst(Node root, int sum) {
		 
		var list = inOrder (root, new ArrayList<Integer > ());
		var toto = twoNumberSum ( convert(list), sum);
		
		if (toto.length == 0 )
		{
			return "Nodes are not found";
		}
		else 
		{
			return "Pair is( " + toto[0] + "," + toto[1]+ ")";
		}
			
	}
		
	 public static int[] twoNumberSum(int[] array, int targetSum) {
			    // Write your code here.
				
		for( int i=0;i<array.length-1;i++)
		{
			for( int j=i+1; j<array.length;j++)
			{
				if (array[i]+array[j]==targetSum)
				{
					return new int [] {array[i],array[j]};
				}
			}
		}
		return new int[0];
	  }
		
	}
