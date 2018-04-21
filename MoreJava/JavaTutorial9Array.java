//import java.util.Arrays;

public class JavaTutorial9Array{
	public static void main(String[] args){
		int[] firstarray = new int[10]; // Type[] Nameofarray = new Type[Arraylength]
		
		System.out.println(firstarray.length);
		
		for (int i=0; i< firstarray.length; i++){
			firstarray[i]= i;
		}
		int k=1;
		while (k<firstarray.length){
			System.out.print("|"+firstarray[k]);
			k++;
		}
		
		String[][] multiarray = new String[10][10];
		
		for (int i=0; i<multiarray.length;i++){
			for (int j=0; j<multiarray[i].length;j++ ){
				multiarray[i][j]= ("|"+i+","+j+"|");
				System.out.print(multiarray[i][j]);
			}
			System.out.println();
		}
		
		int[] secondarray = new int[10];
		
		for(int row :firstarray){
			System.out.print(row);
		}
		System.out.print("\n");
		
		
		
		//for(dataType[] varForRow :arrayName)
		for(String[] rows: multiarray){
			//for(dataType varForColumn :arrayName)
			for(String column : rows){
				System.out.print(column);
			}
			System.out.println("");
		}
		
		//System.out.println(Arrays.toString(firstarray));
		
		
	}
}