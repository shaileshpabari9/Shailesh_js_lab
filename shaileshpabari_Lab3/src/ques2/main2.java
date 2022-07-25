package ques2;

public class main2 {
	
	public static void  main (String[] args){
		
		givenSumOfBst bb = new givenSumOfBst ();
		
		var n = bb.numberOfNodes();
		var v = bb.valuesOfArray(n);
		var t = bb.getTargetSum();
		var l = bb.convertArrayToList(v);
		var u = bb.constructMinHeightBst(l, 0, n-1);
		var z = bb.checkSumBst(u, t);
		
		System.out.println(z);	
		
	}

}
