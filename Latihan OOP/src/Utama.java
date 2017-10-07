/* Class Utama*/
public class Utama {

//Protected variabel, hanya dapat di akses klas ini sendiri dan klas warisannya	
protected String nama,alamat,tlp,jnskel;

//Membuat method setData untuk mengisi data ke variabel String di atas
	void setData (String nama, String alamat, String tlp,String jnskel){
		this.nama=nama;
		this.alamat=alamat;
		this.tlp=tlp;
		this.jnskel=jnskel;
	}
	
//Membuat method getData
	void getData (){
		System.out.println("+++++ Data Personal +++++");
		System.out.println("nama          : "+nama);
		System.out.println("alamat        : "+alamat);
		System.out.println("tlp           : "+tlp);
		System.out.println("jenis kelamin : "+jnskel);
	}
}

