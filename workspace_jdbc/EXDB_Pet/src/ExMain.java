import java.sql.SQLException;
import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args) {
		MyDB mydb = new MyDB();
		
		//db����
		try {
			mydb.connect();
		
		
		ArrayList<Pet> plist = mydb.getPetList();

		if(plist !=null) {
		for(int i=0;i<plist.size();++i) {
			Pet pet = plist.get(i);
			System.out.print(pet.getName());
			System.out.print("\t"+pet.getOwner());
			System.out.print("\t"+pet.getSpecies());
			System.out.println("\t"+pet.getBirth());
			}
		}
		try {
			mydb.editPetBirth("�ʸ���","2011-03-01");
		
		Pet newPet = new Pet("�ʸ���","jung","dog","2014-06-01");
		mydb.insertPet(newPet);
		
		//db����
		mydb.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
