
public class BreakAndContinueDemo {
	public static void main (String [] args){
		
		int[][] arrayOfInts = { {0,2,12,12}, {12,14,12,18}, {12,99,752,12} };
		int search = 12;
	
		
		int i = 0 ;
		int j = 0 ;
		boolean foundIt = false;
		
		searcha: for(; i < arrayOfInts.length; i++){
			
			for(j=0 ; j < arrayOfInts[i].length; j++){
				if(arrayOfInts [i][j] == search){
					foundIt=true;
					System.out.println("Found " + search + "at " +i+ ","+j);
					continue searcha;
				}
			}
			
		}
		
		
		if (!foundIt)
			System.out.println(search + "not in the list");
		
	}

}
