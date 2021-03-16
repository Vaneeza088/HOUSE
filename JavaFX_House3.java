
package javafx_house3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavaFX_House3 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
      //the house
      
      Polygon tRoof = new Polygon (80,150,699,150,400,0);
      tRoof.setFill(Color.WHITE);
      tRoof.setStrokeWidth(1);
      tRoof.setFill(Color.BLACK);
      
      Rectangle bRoof = new Rectangle (120, 150, 499, 30);
      bRoof.setFill(Color.WHITE);
      tRoof.setStrokeWidth(1);
      tRoof.setFill(Color.BLACK);
      
      Rectangle houseW = new Rectangle (120, 150, 500, 470);
      houseW.setFill(Color.BROWN);
      houseW.setStrokeWidth(1);
      houseW.setStroke(Color.BLACK);
      
      //Right door and it's windows
      
      Rectangle rightDoor = new Rectangle (190,341, 80, 149);
      rightDoor.setFill(Color.WHITE);
      rightDoor.setStrokeWidth(1);
      rightDoor.setStroke(Color.BLACK);
      
      Rectangle rightDoorW1 = new Rectangle (209, 340, 16,16);
      rightDoorW1.setFill(Color.BLACK);
      
      Rectangle rightDoorW2 = new Rectangle (239, 340, 16,16);
      rightDoorW2.setFill(Color.BLACK);
      
      Rectangle rightDoorW3 = new Rectangle (209, 360, 16,16);
      rightDoorW3.setFill(Color.BLACK);
      
      Rectangle rightDoorW4 = new Rectangle (209, 390, 16,16);
      rightDoorW4.setFill(Color.BLACK);
      
      Rectangle rightDoorW5 = new Rectangle (209, 420, 16,16);
      rightDoorW5.setFill(Color.BLACK);
      
      Rectangle rightDoorW6 = new Rectangle (209, 450, 16,16);
      rightDoorW6.setFill(Color.BLACK);
      
      Rectangle rightDoorW7 = new Rectangle (239, 360, 16,16);
      rightDoorW7.setFill(Color.BLACK);
        
      Rectangle rightDoorW8 = new Rectangle (239, 390, 16,16);
      rightDoorW8.setFill(Color.BLACK);
      
      Rectangle rightDoorW9 = new Rectangle (239, 420, 16,16);
      rightDoorW9.setFill(Color.BLACK);
      
      Rectangle rightDoorW10 = new Rectangle (239, 350, 16,16);
      rightDoorW10.setFill(Color.BLACK);
      
      //Middle door and it's Windows
      
      Rectangle middleDoor = new Rectangle (549,302, 79, 179);
      middleDoor.setFill(Color.WHITE);
      middleDoor.setStrokeWidth(1);
      middleDoor.setStroke(Color.BLACK);
      
       Rectangle middleDoorW1 = new Rectangle (362, 340, 16,16);
      middleDoorW1.setFill(Color.BLACK);
      
      Rectangle middleDoorW2 = new Rectangle (362, 340, 16,16);
      middleDoorW2.setFill(Color.BLACK);
      
      Rectangle middleDoorW3 = new Rectangle (362, 340, 16,16);
      middleDoorW3.setFill(Color.BLACK);
      
      Rectangle middleDoorW4 = new Rectangle (362, 340, 16,16);
      middleDoorW4.setFill(Color.BLACK);
      
      Rectangle middleDoorW5 = new Rectangle (362, 340, 16,16);
      middleDoorW5.setFill(Color.BLACK);
      
      Rectangle middleDoorW6 = new Rectangle (362, 340, 16,16);
      middleDoorW6.setFill(Color.BLACK);
      
      Rectangle middleDoorW7 = new Rectangle (362, 340, 16,16);
      middleDoorW7.setFill(Color.BLACK);
      
      Rectangle middleDoorW8 = new Rectangle (362, 340, 16,16);
      middleDoorW8.setFill(Color.BLACK);
      
      Rectangle middleDoorW9 = new Rectangle (362, 340, 16,16);
      middleDoorW9.setFill(Color.BLACK);
      
      Rectangle middleDoorW10 = new Rectangle (362, 340, 16,16);
      middleDoorW10.setFill(Color.BLACK);
      
      //left door and it's windows
      
      Rectangle leftDoor = new Rectangle (500,336, 70, 149);
      leftDoor.setFill(Color.WHITE);
      leftDoor.setStrokeWidth(1);
      leftDoor.setStroke(Color.BLACK);
      
      Rectangle leftDoorW1 = new Rectangle (519, 340, 16,16);
      leftDoorW1.setFill(Color.BLACK);
      
      Rectangle leftDoorW2 = new Rectangle (519, 340, 16,16);
      leftDoorW2.setFill(Color.BLACK);
      
      Rectangle leftDoorW3 = new Rectangle (519, 340, 16,16);
      leftDoorW3.setFill(Color.BLACK);
      
      Rectangle leftDoorW4 = new Rectangle (519, 340, 16,16);
      leftDoorW4.setFill(Color.BLACK);
      
      Rectangle leftDoorW5 = new Rectangle (519, 340, 16,16);
      leftDoorW5.setFill(Color.BLACK);
      
      Rectangle leftDoorW6 = new Rectangle (519, 340, 16,16);
      leftDoorW6.setFill(Color.BLACK);
      
      Rectangle leftDoorW7 = new Rectangle (519, 340, 16,16);
      leftDoorW7.setFill(Color.BLACK);
      
      Rectangle leftDoorW8 = new Rectangle (519, 340, 16,16);
      leftDoorW8.setFill(Color.BLACK);
      
      Rectangle leftDoorW9 = new Rectangle (519, 340, 16,16);
      leftDoorW9.setFill(Color.BLACK);
      
      Rectangle leftDoorW10 = new Rectangle (519, 340, 16,16);
      leftDoorW10.setFill(Color.BLACK);
      
      //the circles on the pillars
      
      Circle pillarCircle1 = new Circle (130, 196, 16);
      Circle pillarCircle2 = new Circle (180, 196, 16);
      Circle pillarCircle3 = new Circle (290, 196, 16);
      Circle pillarCircle4 = new Circle (337, 196, 16);
      Circle pillarCircle5 = new Circle (445, 196, 16);
      Circle pillarCircle6 = new Circle (492, 196, 16);
      Circle pillarCircle7 = new Circle (605, 196, 16);
      Circle pillarCircle8 = new Circle (651, 196, 16);
      
      //the 4 pillars of the house
      
      Rectangle houseP1 = new Rectangle (130, 180, 45, 285);
      houseP1.setFill(Color.WHITE);
      houseP1.setStrokeWidth(1);
      houseP1.setStroke(Color.BLACK);
      
      Rectangle houseP2 = new Rectangle (130, 180, 45, 285);
      houseP2.setFill(Color.WHITE);
      houseP2.setStrokeWidth(1);
      houseP2.setStroke(Color.BLACK);
      
      Rectangle houseP3 = new Rectangle (130, 180, 45, 285);
      houseP3.setFill(Color.WHITE);
      houseP3.setStrokeWidth(1);
      houseP3.setStroke(Color.BLACK);
      
      Rectangle houseP4 = new Rectangle (130, 180, 45, 285);
      houseP4.setFill(Color.WHITE);
      houseP4.setStrokeWidth(1);
      houseP4.setStroke(Color.BLACK);
      
      //The stairs of the house
      
      Rectangle hStair1 = new Rectangle (118, 485, 67, 9);
      hStair1.setFill(Color.GRAY);
      hStair1.setStrokeWidth(1);
      hStair1.setStroke(Color.BLACK);
      
      Rectangle hStair2 = new Rectangle (589, 484, 73, 9);
      hStair2.setFill(Color.GRAY);
      hStair2.setStrokeWidth(1);
      hStair2.setStroke(Color.BLACK);
      
      Rectangle hStair3 = new Rectangle (180, 509, 455, 14);
      hStair3.setFill(Color.GRAY);
      hStair3.setStrokeWidth(1);
      hStair3.setStroke(Color.BLACK);
      
      Rectangle hStair4 = new Rectangle (118, 485, 67, 14);
      hStair4.setFill(Color.GRAY);
      hStair4.setStrokeWidth(1);
      hStair4.setStroke(Color.BLACK);
      
      Rectangle hStair5 = new Rectangle (140, 520, 477, 14);
      hStair5.setFill(Color.GRAY);
      hStair5.setStrokeWidth(1);
      hStair5.setStroke(Color.BLACK);
      
      Rectangle hStair6 = new Rectangle (125, 545, 530, 14);
      hStair6.setFill(Color.GRAY);
      hStair6.setStrokeWidth(1);
      hStair6.setStroke(Color.BLACK);
      
      Rectangle hStair7 = new Rectangle (112, 558, 552, 14);
      hStair7.setFill(Color.GRAY);
      hStair7.setStrokeWidth(1);
      hStair7.setStroke(Color.BLACK);
      
      Rectangle hStair8 = new Rectangle (101, 570, 575, 14);
      hStair8.setFill(Color.GRAY);
      hStair8.setStrokeWidth(1);
      hStair8.setStroke(Color.BLACK);
      
      Rectangle hStair9 = new Rectangle (89, 585, 603, 14);
      hStair9.setFill(Color.GRAY);
      hStair9.setStrokeWidth(1);
      hStair9.setStroke(Color.BLACK);
      
      Rectangle hStair10 = new Rectangle (76, 595, 630, 14);
      hStair10.setFill(Color.GRAY);
      hStair10.setStrokeWidth(1);
      hStair10.setStroke(Color.BLACK);
        
      Rectangle hStair11 = new Rectangle (61, 606, 655, 14);
      hStair11.setFill(Color.GRAY);
      hStair11.setStrokeWidth(1);
      hStair11.setStroke(Color.BLACK);
      
      //the Grass
      
      Rectangle grass = new Rectangle (0,302,750,340);
      grass.setFill(Color.GREEN);
      
      //groups
      
      Group thebuilding = new Group (houseW, rightDoor, middleDoor, leftDoor, rightDoorW1, rightDoorW2, rightDoorW3, rightDoorW4, rightDoorW5, rightDoorW6, rightDoorW7, rightDoorW8, rightDoorW9, rightDoorW10, middleDoorW1, middleDoorW2, middleDoorW3, middleDoorW4, middleDoorW5, middleDoorW6, middleDoorW7, middleDoorW8, middleDoorW9, middleDoorW10,
      leftDoorW1, leftDoorW2, leftDoorW3, leftDoorW4, leftDoorW5, leftDoorW6, leftDoorW7, leftDoorW8, leftDoorW9, leftDoorW10);
      
      Group roof = new Group (tRoof, bRoof);
      
      Group stairs = new Group (hStair1, hStair2, hStair3, hStair4, hStair5, hStair6, hStair7, hStair8,
      hStair9, hStair10, hStair11);
      
      Group pcircles = new Group (pillarCircle1, pillarCircle2, pillarCircle3, pillarCircle4, pillarCircle5, pillarCircle6,
      pillarCircle7, pillarCircle8);
      
      Group pillars = new Group (houseP1, houseP2, houseP3, houseP4);
      
      Group theHouse = new Group (thebuilding, pillars, pcircles, stairs, roof);
      Group thegrass = new Group (grass);      
              
        Scene scene = new Scene(theHouse, 800, 690, Color.LIGHTBLUE);
        
        stage.setScene(scene);
        stage.setTitle("A House");
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
