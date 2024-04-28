package application;

import java.util.ArrayList;
import java.util.List;

public class data {
	
private List<person>importList;
private List<person>exportList;

public data() {
	importList = new ArrayList<person>();
	importList.add(new person ("sami","benali","sami@exemple.com"));
	importList.add(new person ("alia","bensallah","alia@exemple.com"));
	importList.add(new person ("ali","bensaah","ali@exemple.com"));


}
public List<person> getImportList(){
	return importList;
}
public void setExportList(List<person>exportList) {
	this.exportList.addAll(exportList);
	for(person p:this.exportList)
		System.out.println(p);
	
}

}
