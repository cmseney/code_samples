// Generate combinations of numbers using loops or recursion

public class Combinations {
	
	// Calculate the number of combinations of k objects from set of n objects
	public static int CountCombinations(int n, int k){
		if (k>n) return 0;
		int num=1, denom=1;
		for(int i=n; i>k; i--)
			num = num * i;
		for(int j=n-k; j>0; j--)
			denom = denom * j;
		int result = num / denom;
		return result;
	}
	
	// Generate combinations of 2 numbers from a set size n - using nested loops
	public static void Print2Combinations(int n){
		for (int j=n; j>1; j--)
			for (int i=j-1; i>0; i--)
				System.out.println(j + " " + i);
	}
	
	// Generate combinations of 2 numbers from a set size n - using recursion
	public static void Print2CombinationsRec(int n){
		if (n>1)
			Print2CombinationsRec(n-1);
		for (int i=n-1; i>0; i--)
			System.out.println(n + " " + i);
	}

	public static void main(String[] args) {
		int objects = 3;
		int choose = 2;
		
		int count = CountCombinations(objects,choose);
		System.out.println(objects + " choose " + choose + " : " + count);
		
		System.out.println("Generated using nested loops:");
		Print2Combinations(objects);
		
		System.out.println("Generated using recursion:");
		Print2CombinationsRec(objects);
	}
}
