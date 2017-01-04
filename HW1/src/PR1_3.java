public class PR1_3 {
	public static void main(String[] args){
		char[] chars = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '^', '+', '/', ' '};
		
		for(char c : chars){
			System.out.printf("The character %c has the value %d\n", c, ( (int) c) );
		}
	}
}
