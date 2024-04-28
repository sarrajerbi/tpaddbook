package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class addBookControlor implements Initializable {
	 @FXML
	 private TextField tfLastName;
	 @FXML
	 private TextField tfFirstName;
	 @FXML
	 private TextField tfEmail;

	 @FXML
	 private TableView<person> table;
	 @FXML
	 private TableColumn<person, String> emailCol;
	 @FXML
	 private TableColumn<person, String> firstNameCol;
	 @FXML
	 private TableColumn<person, String> lastNameCol;
	 private data data;
	//A Completer
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lastNameCol.setCellValueFactory(new PropertyValueFactory<person, String>("prenom"));
		firstNameCol.setCellValueFactory(new PropertyValueFactory<person, String>("nom"));
		emailCol.setCellValueFactory(new PropertyValueFactory<person, String>("adr"));
	}
	@FXML
	public void add(ActionEvent event) {
		table.getItems().add(new person(tfLastName.getText(),tfFirstName.getText(),tfEmail.getText()));
	}
	public void importer(ActionEvent event)
	{
		for (person p:data.getImportList()) {
			table.getItems().add(p);
			
		}
		
	}
	public void remove(ActionEvent event)
	{
		person p=table.getSelectionModel().getSelectedItem();
		table.getItems().remove(p);
	}
	}
