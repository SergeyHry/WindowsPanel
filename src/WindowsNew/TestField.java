package WindowsNew;
import java.util.ArrayList;
import java.util.List;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.control.Alert.AlertType;
public class TestField extends Application {
	//---------------------------------MAIN-------------------------------
	public static void main(String[] args) throws InterruptedException {

		Application.launch();
	}
//--------------------FX---------------------
	@Override
	public void start(Stage primaryStage) throws Exception {
		CPU cpu = new CPU();
		GrafikKarte gKarte = new GrafikKarte();
		Laufwerk laufwerk = new Laufwerk();
		Netzwerk netzwerk = new Netzwerk();
		OperationSystem os = new OperationSystem();
		Fenster f = new Fenster();
		
		primaryStage.setTitle("All-in-One Util");
		BorderPane root = new BorderPane();
		
		
		//Die Rechte Seite:
		
		VBox rightMenu = new VBox();
		rightMenu.setSpacing(2);
		rightMenu.setPrefWidth(200);
		
		rightMenu.setPadding(new Insets (10));
		rightMenu.setAlignment(Pos.TOP_RIGHT);
		Text b = new Text("Fenster Link\n");
		b.setFont(Font.font("Segoe UI", 20));
		b.setFill(Color.WHITE);
		Button geraetM = new Button("Gerät Manager");
		geraetM.setPrefWidth(200);
		geraetM.setPrefHeight(30);
		Button taskM = new Button("Task-Manager");
		taskM.setPrefWidth(200);
		taskM.setPrefHeight(30);
		Button Eingabe = new Button("Task-Manager");
		taskM.setPrefWidth(200);
		taskM.setPrefHeight(30);
		
		
	
		HBox forChecks= new HBox();
		Button leeren = new Button("Leeren");
		//Bild für Button : 
		
		 Image img = new Image("file:///C:/Users/Student/Downloads/Trash.gif");
	      ImageView view = new ImageView(img);
	      view.setFitWidth(20);   // z.B. 16 Pixel Breite
	      view.setFitHeight(20);
	      leeren.setGraphic(view);
	      
		leeren.setPrefWidth(200);
		forChecks.setSpacing(10);
		
		VBox forLeer = new VBox();
		forLeer.setPadding(new Insets (10));
		forLeer.setAlignment(Pos.CENTER_RIGHT);
		Label labelCheck = new Label("Cleaner");
		labelCheck.setFont(Font.font("Segoe UI\n", 20));
		forLeer.setSpacing(15);
		forLeer.getChildren().addAll(labelCheck,leeren,forChecks);

		
		forChecks.setAlignment(Pos.BOTTOM_RIGHT);
		
		
		labelCheck.setTextFill(Color.WHITE);
		List<CheckBox> checkBoxes = new ArrayList<>();

		String[] names = {"DNS-Cache", "System-Cache", "Basket"};
		for (String name : names) {
		    CheckBox checkBox = new CheckBox(name);
		    checkBox.setIndeterminate(false);
		    checkBox.setTextFill(Color.WHITE);
		    checkBox.setAlignment(Pos.CENTER_LEFT);

		    forChecks.getChildren().add(checkBox);
		    checkBoxes.add(checkBox); // In Liste hinzufügen
		}
	

	
		
		
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//Die Linke Seite: 

		
		
		
		
		
		
		VBox leftMenu = new VBox(10);
		leftMenu.setPrefWidth(200);
		leftMenu.setPadding(new Insets (10));
		leftMenu.setSpacing(2);
		Text a = new Text("Menü Bar\n");
		a.setFont(Font.font("Segoe UI", 20));
		a.setFill(Color.WHITE);
		Button cpuBtn = new Button("CPU");
		cpuBtn.setPrefWidth(200);
		cpuBtn.setPrefHeight(30);
		Button grafikBtn = new Button("Grafik Karte");
		grafikBtn.setPrefWidth(200);
		grafikBtn.setPrefHeight(30);
		//Das Mitte: 
		
		VBox rightContent = new VBox();
		
		   rightContent.setPadding(new Insets(10));
		    rightContent.setSpacing(10);
		    
		 //Buttons:
		//Button for CheckBox on click:
		    Alert alert = new Alert(AlertType.CONFIRMATION);
	        alert.setTitle("Info");
	       
		    leeren.setOnAction(e -> {
		    	
		        if (checkBoxes.get(0).isSelected()) {
		            f.dnsCaschClean();
		            alert.setContentText("DNS Cashe erfolgreich entleert!");
			        alert.show();
		        }
		        if (checkBoxes.get(1).isSelected()) {
		            f.sysCaschClean();
		            alert.setContentText("System-Cashe erfolgreich entleert!");
			        alert.show();
		        }
		        if (checkBoxes.get(2).isSelected()) {
		            f.basketClean();
		            alert.setContentText("Korb ist erfolgreich entleert!");
			        alert.show();
		        }
		        else {
		        	 Alert alert2 = new Alert(AlertType.WARNING);
		 	        alert2.setTitle("Info");
		        	 alert2.setContentText("Wählen sie Bitte eine oder mehrere Option");
				        alert2.show();
		        }
		        
		       
		        
		    });
		   
	
		Button laufwerkBtn = new Button("Laufwerk");
		laufwerkBtn.setPrefWidth(200);
		laufwerkBtn.setPrefHeight(30);
		//Button Netzwerk
		
		Button osBtn = new Button("OS");
		osBtn.setPrefWidth(200);
		osBtn.setPrefHeight(30);
		Button netzwerkBtn = new Button("Netzwerk");
		netzwerkBtn.setPrefWidth(200);
		netzwerkBtn.setPrefHeight(10);
		//Button CPU
		
		cpuBtn.setOnAction(e -> {
		    rightContent.getChildren().clear();
		    Label labelCpu = new Label("Über CPU:");
		    labelCpu.setFont(Font.font("Segoe UI", 20));
		    labelCpu.setTextFill(Color.WHITE);
		    String info = cpu.getInfo();
		    TextArea infoField = new TextArea(info);
		    String infoProcess = cpu.getProcInfo();
		    TextArea infoP = new TextArea(infoProcess);
		    infoField.setPrefWidth(500);
		    infoField.setPrefHeight(100);
		    infoField.setEditable(false);
		    rightContent.getChildren().addAll(labelCpu,
		        infoField,infoP
		    );
		});
		//Button Grafik Karte
		
		grafikBtn.setOnAction(e -> {
		    rightContent.getChildren().clear();
		    Label labelgrafic = new Label("Grafik Karte Information:");
		    labelgrafic.setFont(Font.font("Segoe UI", 20));
		    labelgrafic.setTextFill(Color.WHITE);
		    String info = gKarte.getInfo();
		    TextArea infoField = new TextArea(info);
		    infoField.setPrefWidth(500);
		    infoField.setPrefHeight(100);
		    infoField.setEditable(false);
		    rightContent.getChildren().addAll(labelgrafic,infoField
		    );
		});
		//Button Laufwerk
		
		laufwerkBtn.setOnAction(e -> {
		    rightContent.getChildren().clear();
		    Label labelLaufwerk = new Label("Laufwerk Information :");
		    labelLaufwerk.setFont(Font.font("Segoe UI", 20));
		    labelLaufwerk.setTextFill(Color.WHITE);
		    String info = laufwerk.getInfo();
		    TextArea infoField = new TextArea(info);
		    String infoMemory = laufwerk.Memo();
		    TextArea infoM = new TextArea(infoMemory);
		    infoField.setPrefWidth(500);
		    infoField.setPrefHeight(100);
		    infoField.setEditable(false);
		    rightContent.getChildren().addAll(labelLaufwerk
		        ,
		        infoField,infoM
		    );
		});
		//Button OS

		osBtn.setOnAction(e->{
			rightContent.getChildren().clear();
		    Label labelOs = new Label("Operation System :");
		    labelOs.setFont(Font.font("Segoe UI", 20));
		    labelOs.setTextFill(Color.WHITE);
			String info = os.getInfo();
			TextArea infoOs = new TextArea(info);
			 rightContent.getChildren().addAll(labelOs,infoOs);
					});
		
			//Button Netzwerk
		netzwerkBtn.setOnAction(e->{
			rightContent.getChildren().clear();
		    Label labelNetz = new Label("Netzwerk:");
		    labelNetz.setFont(Font.font("Segoe UI", 20));
		    labelNetz.setTextFill(Color.WHITE);
			String info = netzwerk.getInfo();
			TextArea infoNetz = new TextArea(info);
			 rightContent.getChildren().addAll(labelNetz,infoNetz);
					});
			//Button TaskManager
		geraetM.setOnAction(e->{
		
			f.getFenster();
		});
		taskM.setOnAction(e->{
		
			f.getFenster2();
		});
		
		
		rightMenu.getChildren().addAll(b,taskM,geraetM);
	    leftMenu.getChildren().addAll(a, cpuBtn, grafikBtn, laufwerkBtn, osBtn, netzwerkBtn);
	    
//	  root

		root.setLeft(leftMenu);
		root.setCenter(rightContent);
		root.setRight(rightMenu);
		root.setBottom(forLeer);
	
		
	
		
		
		Scene sc = new Scene(root,1200,500);
		sc.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		
		
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

}


