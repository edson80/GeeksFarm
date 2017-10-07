
//Class Mahasiswa extend Utama artina class ini mewarisi class utama
class Mahasiswa extends Utama {
	
	public String nim;
	public int nilaiuts,nilaiuas;

//Membuat method getDataMahasiswa yang isi nya untuk mencetak data 	
	void getDataMahasiswa(){
		System.out.println("===== Data Mahasiswa =====");
		System.out.println("NIM          : "+nim);
		System.out.println("Nilai UTS    : "+nilaiuts);
		System.out.println("Nilai UAS    : "+nilaiuas);
	}
}