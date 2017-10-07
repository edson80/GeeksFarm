//Mendeklarasikan paket util.Scanner
import java.util.Scanner;

//Menbuat class Run
class Run{
//public static void main artinya method ini yang pertama kali dijalankan saat program di run	
	public static void main (String[] args){
		
//Membuat object scanner inp
		Scanner inp=new Scanner(System.in);

//Membuat object dari class mahasiswa		
		Mahasiswa mah=new Mahasiswa();
		
//Membuat variabel penampung inputan
		String nama,alamat,tlp,jnskel;
		
//syntax yang di gunakan untuk mencetak		
		System.out.println("===== inputan data mahasiswa =====");
		
//Mengambil data yang di input user		
		System.out.print("nama          : ");
		nama=inp.next();
		System.out.print("alamat        : ");
		alamat=inp.next();
		System.out.print("tlp           : ");
		tlp=inp.next();
		System.out.print("jenis kelamin : ");
		jnskel=inp.next();
		System.out.print("NIM           : ");
		
//Memanggil variabel dari class Mahasiswa		
		mah.nim=inp.next();
		System.out.print("Nilai UTS     : ");
		mah.nilaiuts=inp.nextInt();
		System.out.print("Nilai UAS     : ");
		mah.nilaiuas=inp.nextInt();
		inp.close();
		
//Pembuktian class Mahasiswa merupakan warisan dari class Utama, 
//karena method ini tidak terdapat di class Mahasiswa tp terdapat di class Utama
		mah.setData(nama, alamat, tlp, jnskel);
		mah.getData();
		mah.getDataMahasiswa();

	}
		
}


