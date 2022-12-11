package replit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Main extends Application 
{ 
	//user & driver
//	User user1 = new User();
	//Driver driver;

	
  
  @Override
  public void start(Stage primaryStage) {
		
	
    
    	//Welcome screen\
//	System.out.println(user1);
    VBox vbox1;
    Scene scene1;
	Label label1;     
    Button userBtn1;	
	Button userBtn2;

	  //user scene 
	VBox vbox2;
	Scene scene2;
	Label label2;
	TextField userNameTF = new TextField("Enter the name of the user here");
	TextField userPhoneTF = new TextField("Enter the phone number of the user here");
	TextField userBankAccountTF = new TextField("Enter the bank account number of the user here");
	TextField userPickUpLocationTF = new TextField("Enter the pick up location of the user here");
	TextField userDestinyTF = new TextField("Enter the destiny of the user here");

	  //driver scene
	VBox vbox3;
	Scene scene3;
	Label label3;
	Label label4;
  Label labelC;
	Button driverBtn1;
  Button driverConfirmBtn;
	TextField driverNameTF = new TextField("Enter the name of the driver here");
	TextField driverPhoneTF = new TextField("Enter the phone number of the driver here");
	TextField driverBankAccountTF = new TextField("Enter the bank account number of the driver here");
	TextField driverCarTF = new TextField("Enter the car model of the driver here");

	  /////////////////////////////////////////
	  
	  
	  /////////////////////////////////////////
	label2 = new Label("Please fill out the personal information for the User");
	userBtn2 = new Button("Done");
	vbox2 = new VBox(label2, userNameTF, userPhoneTF, userBankAccountTF, userPickUpLocationTF, userDestinyTF, userBtn2);
	vbox2.setSpacing(20);
	vbox2.setAlignment(Pos.CENTER);
	scene2 = new Scene(vbox2, 700, 350); 

	  /*userBtn2.setOnAction(new EventHandler<ActionEvent>() {
 @Override public void handle(ActionEvent e) {
 Integer value1 = Integer.valueOf(userNameTF.getText());
 String t = value1.toString();
 Person p = new User() ;
 p.setName(t);
//label.setText(); 
	
 }
 	});
*/

	  
	
/*
	  user.setAll(userNameTF.getText(), userPhoneTF.getText(), userBankAccountTF.getText(), userPickUpLocationTF.getText(), userDestinyTF.getText());
	  
	user = new User(userNameTF.getText(), userPhoneTF.getText(), userBankAccountTF.getText(), userPickUpLocationTF.getText(), userDestinyTF.getText());

	userBtn2.setOnAction(e -> System.out.println(user));
	
	  
	*/
  Label label5 = new Label("Great!\n\nThe driver is now on their way to pick up the user at \"Pick Up Location\"");
	label3 = new Label("Please fill out the personal information for the Driver");
	label4 = new Label("Click the button where you are finished and ready to begin the simulator");
  labelC = new Label("Please confirm that all the information is correct");
  driverConfirmBtn = new Button("Confirm");
	driverBtn1 = new Button("Done");

   driverConfirmBtn.setOnAction(new EventHandler<ActionEvent>() {
      @Override 
      public void handle(ActionEvent event) {
      label5.setText("								Great!\n\nThe driver " + driverNameTF.getText() + " is now on their way to pick up the user at \"Pick Up Location\"");
      }
    });
    
	vbox3 = new VBox(label3, driverNameTF, driverPhoneTF, driverBankAccountTF, driverCarTF, labelC, driverConfirmBtn, label4, driverBtn1);
	vbox3.setSpacing(10);
	vbox3.setAlignment(Pos.CENTER);
	scene3 = new Scene(vbox3, 700, 350);

	//Driver is on thir way to pick up user
	  VBox vbox4;
	  Scene scene4;
//	  Label label5 = new Label("								Great!\n\nThe driver \"driver\" is now on their way to pick up the user at \"Pick Up Location\"");
 //   Label label5 = new Label("");
    
	  Button continueBtn1 = new Button("Continue Information");
   // driverNameTF.setOnAction(new EventHandler<ActionEvent>() {
   //    @Override 
   //    public void handle(ActionEvent e) {
   //    label5.setText("								Great!\n\nThe driver " + driverNameTF.getText() + "is now on their way to pick up the user at \"Pick Up Location\"");
   //    }
   //  });
    
	  vbox4 = new VBox(label5, continueBtn1);
	  vbox4.setSpacing(20);
	  vbox4.setAlignment(Pos.CENTER);	  
	  scene4 = new Scene(vbox4, 600, 150);

	  //ETA and comunicate message
	  VBox vbox5;
	  Scene scene5;
	  Label label6 = new Label("The estimated wait time for the driver\nto get to \"Pick Up Location\" is 15 minutes. \nDuring this time, the user has the option \nto comunicate with the driver via \nphone number at \"######\" for any \nquestions or requests");
	  Button continueBtn2 = new Button("Continue");
	  vbox5 = new VBox(label6, continueBtn2);
	  vbox5.setSpacing(20);
	  vbox5.setAlignment(Pos.CENTER);
	  scene5 = new Scene(vbox5, 600, 200);

	  //Money trasaction (behind the screens)
	  VBox vbox6;
	  Scene scene6;
	  Label label7 = new Label("   (THIS IS ALL BEHIND THE SCREENS WITH NO \nINPUT FROM NEITHER THE USER OR THE DRIVER)");
	  Label label8 = new Label("		By now, the money transaction has already been \n	made from the user's bank account \"############\" to \n		the driver's bank account \"############\"");
	  Button continueBtn3 = new Button("Continue");
	  vbox6 = new VBox(label7, label8, continueBtn3);
	  vbox6.setSpacing(20);
	  vbox6.setAlignment(Pos.CENTER);
	  scene6 = new Scene(vbox6, 600, 200);

	  //user is picked up
	  VBox vbox7;
	  Scene scene7;
	  Label label9 = new Label("         As the driver is about to pick up the user, \nthe user is expecting a \"Car\" model car to pick them up");
	  Button continueBtn4 = new Button("Continue");
	  vbox7 = new VBox(label9, continueBtn4);
	  vbox7.setSpacing(20);
	  vbox7.setAlignment(Pos.CENTER);	  
	  scene7 = new Scene(vbox7, 600, 150);

	  //user is picked up and they are about to arrive
	  VBox vbox8;
	  Scene scene8;
	  Label label10 = new Label("		  The driver has picked up the user \n	and their new destination at \"Destiny\" has loaded \n		on the driver's end. Their destiny is only \n			    a few minutes away");
	  Button arriveBtn = new Button("Arrive!");
	  vbox8 = new VBox(label10, arriveBtn);
	  vbox8.setSpacing(20);
	  vbox8.setAlignment(Pos.CENTER);
	  scene8 = new Scene(vbox8, 600, 200);

	  //The trip comes to an end
	  VBox vbox9;
	  Scene scene9;
	  Label label11 = new Label("	The ride has finalized, the driver and \n	the user have now parted ways and both \n	of their personal information remain secured \n	and unreachable from each other.");
	  Button endTripBtn = new Button("End trip");
	  vbox9 = new VBox(label11, endTripBtn);
	  vbox9.setSpacing(20);
	  vbox9.setAlignment(Pos.CENTER);
	  scene9 = new Scene(vbox9, 500, 200);

	  VBox vbox10;
	  Scene scene10;
	  Label label12 = new Label("The simulation had ended, we hope that you enjoyed \n	it and that it helped you understand how the \n		real Uber app works a little better\n\n\n		 	Have a good day! :)");
	  Button terminateBtn = new Button("Close app");
	  vbox10 = new VBox(label12, terminateBtn);
	  vbox10.setSpacing(20);
	  vbox10.setAlignment(Pos.CENTER);
	  scene10 = new Scene(vbox10, 500, 200);
	  
	

	  
	//TextField nameTF;
    //Button driverButton;

	  
    //Fill in scene1

    label1 = new Label("						Welcome to Uber simulator!\nPlease create an account for a User (Customer) and a Driver (Employee) to get started.");
    userBtn1 = new Button("Create User account"); 
	//driverButton = new Button ("Create Driver account");

	
    userBtn1.setOnAction(e -> primaryStage.setScene(scene2));
	userBtn2.setOnAction(e -> primaryStage.setScene(scene3));
	driverBtn1.setOnAction(e -> primaryStage.setScene(scene4));
	continueBtn1.setOnAction(e -> primaryStage.setScene(scene5));
	continueBtn2.setOnAction(e -> primaryStage.setScene(scene6));
	continueBtn3.setOnAction(e -> primaryStage.setScene(scene7));
	continueBtn4.setOnAction(e -> primaryStage.setScene(scene8));
	arriveBtn.setOnAction(e -> primaryStage.setScene(scene9));
	endTripBtn.setOnAction(e -> primaryStage.setScene(scene10));
	terminateBtn.setOnAction(e -> System.exit(0));

	  
	/*
	userBtn2.setOnAction(new EventHandler<ActionEvent>() {
		@Override public void handle(ActionEvent e) {
        user = new User();
      }
	});
*/


	
	
	  
    vbox1 = new VBox(label1, userBtn1);
    vbox1.setSpacing(40);
    vbox1.setAlignment(Pos.CENTER);
    scene1 = new Scene(vbox1, 700, 250);


	//primaryStage.setFullScreen(true);
    primaryStage.setScene(scene1);
    primaryStage.show();

 	
	
  } 
    
  public static void main(String[] args) {
    launch(args);
  }

} 