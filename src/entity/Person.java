package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@
	private long id;
	private String name;
	private String vorname;
	private String strasse;
	private int plz;
	private String ort;
	private int telefonNr;
	
	

}
