import java.sql.Date;
import java.text.SimpleDateFormat;

public class Pet {
	String name;
	String owner;
	String species;
	String birth;
	Date death;
	
	public Pet() {}
	public Pet(String name,String owner,String species, Date date) {
		this.name=name;
		this.owner=owner;
		this.species=species;
		this.birth=new SimpleDateFormat("yyyy-MM-dd").format(date);
		
	}
	public Pet(String name,String owner,String species,String date) {
		this.name=name;
		this.owner=owner;
		this.species=species;
		this.birth=date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public Date getDeath() {
		return death;
	}
	public void setDeath(Date death) {
		this.death = death;
	}
	
	
	
	
}
