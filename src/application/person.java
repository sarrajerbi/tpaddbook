package application;

public class person {
private String prenom ;
private String nom ;
private String adr ;


public person(String prenom, String nom, String adr) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.adr = adr;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getAdr() {
	return adr;
}
public void setAdr(String adr) {
	this.adr = adr;
}
@Override
public String toString() {
	return "person [prenom=" + prenom + ", nom=" + nom + ", adr=" + adr + "]";
}

}
