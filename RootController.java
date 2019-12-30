package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;



public class RootController implements Initializable {
	
	private ObservableList<Info> observablelist=FXCollections.observableArrayList();
	public TableView<Info> tableview;
	public TableColumn<Info,String> colName;
	public TableColumn<Info,Integer> colKorean;
	public TableColumn<Info,Integer> colMath;
	public TableColumn<Info,Integer> colEnglish;
	public TextField textfieldName;
	public TextField textfieldKorean;
	public TextField textfieldMath;
	public TextField textfieldEnglish;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		colName.setCellValueFactory(new PropertyValueFactory<>("InfoName"));
		colKorean.setCellValueFactory(new PropertyValueFactory<>("InfoKorean"));
		colMath.setCellValueFactory(new PropertyValueFactory<>("InfoMath"));
		colEnglish.setCellValueFactory(new PropertyValueFactory<>("InfoEnglish"));
	}

	public void addButton(ActionEvent actionevent) throws IOException {
		
		   Parent root = FXMLLoader.load(getClass().getResource("add.fxml"));
		    Stage stage = new Stage();
		    stage.setTitle("Ãß°¡");
		    stage.setResizable(false);
		    
		    Button save_btn=(Button)root.lookup("#save");
		    save_btn.setOnAction(event->saveButton(event));
		    Button cancel_btn=(Button)root.lookup("#cancel");
		    cancel_btn.setOnAction(event->stage.close());
		    textfieldName=(TextField)root.lookup("#textfieldName");
		    textfieldKorean=(TextField)root.lookup("#textfieldKorean");
		    textfieldMath=(TextField)root.lookup("#textfieldMath");
		    textfieldEnglish=(TextField)root.lookup("#textfieldEnglish");

		    stage.setScene(new Scene(root));
		    stage.show();
		
	}
	public void saveButton(ActionEvent event)
	{
		observablelist.add(
				new Info(textfieldName.getText(),Integer.parseInt(textfieldKorean.getText()),
						Integer.parseInt(textfieldMath.getText()),Integer.parseInt(textfieldEnglish.getText()))
				);
		tableview.setItems(observablelist);
	}
	
}
