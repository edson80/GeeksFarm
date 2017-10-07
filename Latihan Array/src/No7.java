
public class No7{
	public static void main(String[] args){
		char[] array = {'1','2','3','4','5','6'};
		//sebelum insert
		System.out.println("Sebelum Insert:");
		for (char a : array) {
			System.out.print(a+" ");
		}

		int index = 3;
		char nilai = '$';
		System.out.println();
		System.out.println("Sesudah Insert:");
		for(int i = array.length-1; i > index; i--){
			array[i] = array[i-1];
		}
		array[index] = nilai;
		for (char a : array) {
			System.out.print(a+" ");
		}
	}
}