public class TestArray_1{
	public static int[] reverse(int[] array){
		int[] result=new int[array.length];
        for(int i=0,j=array.length-1;i<array.length;i++,j--)
        	result[i]=array[j];
        for (int m:result) {
        	System.out.println(m);        	
        }
        return result;
        }        
    public static void main(String []args){
    	int[] Number={1,2,3,4,5,6,7,8,9};
        reverse(Number);
    }
}