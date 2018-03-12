public class Shuffler {

 private static final int shuffleCount = 1;    
 private static final int valueCount = 4;      

 public static void main(String[] args) {
	 System.out.println("Results of " + shuffleCount +
         " consecutive perfect shuffles:");
	 int[] values1 = new int[valueCount];
	 for (int i = 0; i < values1.length; i++) {
		 values1[i] = i;
	 }
	 for (int j = 1; j <= shuffleCount; j++) {
		 perfectShuffle(values1);
		 System.out.print("  " + j + ":");
		 for (int k = 0; k < values1.length; k++) {
			 System.out.print(" " + values1[k]);
		 }
		 System.out.println();
	 }
	 System.out.println();
	 System.out.println("Results of " + shuffleCount +
			 " consecutive efficient selection shuffles:");
	 int[] values2 = new int[valueCount];
	 for (int i = 0; i < values2.length; i++) {
		 values2[i] = i;
 	 }
	 for (int j = 1; j <= shuffleCount; j++) {
		 selectionShuffle(values2);
		 System.out.print("  " + j + ":");
		 for (int k = 0; k < values2.length; k++) {
			 System.out.print(" " + values2[k]);
		 }
		 System.out.println();
	 }
	 System.out.println();
 	}

 	public static void perfectShuffle(int[] values) {
 		int[] temp = new int[values.length];
 		int mid = (values.length + 1) / 2;
 		int unshuffled = 0;
 		int i = 0;
 		for ( ; i < mid; i++) {
 			temp[unshuffled] = values[i];
 			unshuffled += 2;
 		}
 		unshuffled = 1;
 		for ( ; i < values.length; i++) {
 			temp[unshuffled] = values[i];
 			unshuffled += 2;
 		}

 		for (i = 0; i < values.length; i++) {
 			values[i] = temp[i];
 		}
 	}

 public static void selectionShuffle(int[] values) {
	 for (int i = values.length - 1; i > 0; i--) {
		 int pos = (int) (Math.random() * (i + 1));  
		 int temp = values[pos];
		 values[pos] = values[i];
		 values[i] = temp;
	 }
 	}
   }