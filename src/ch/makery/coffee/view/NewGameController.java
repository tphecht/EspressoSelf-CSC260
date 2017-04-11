package ch.makery.coffee.view;

import java.io.File;
import java.io.IOException;

import ch.makery.coffee.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class NewGameController{
	
	 // Reference to the main application
    private Main mainApp;
    
   //is called by the main application to give a reference back to itself.
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
        }
 
    /*@FXML
    private void handleCoffeeCup(){
    	Image image = new Image("file:resources/images/CoffeeEmpty.png");  //pass in the image path
    	scene.setCursor(new ImageCursor(image));
    }*/
    }
    
/*
 * *******Main Program
boolean play = true;
int difficulty = 2;

createOrder(int diff)
{
for (int x = 0; x < 2; x++ )
// placedOrder[x] = <<Drink Generated using RNG?>> 1 = latte, 2 = icedCoffee, 3 = caramelCoffee
}

//TODO: Write main program, which will basically be...
// initialize and place all the objects on screen

do{
	createOrder(difficulty);
	//display order & run game
	//wait for submit from user
	//give score
	//ask to play again
	//if no, play = false
	
}while play == true;


*******CoffeeBar

//TODO: address of Location on screen
Static String drinkInProg[10];
Static String completedOrder[10];
Static String placedOrder[10];
Static boolean haveCup = false;
Static int ingredientCount = 0;




*******CoffeeBarObject extendsCoffeeBar // There won't be an actual "CoffeeBarObject" actually created or placed anywhere, just skeleton for the other objects

//TODO: Hitbox size
boolean hitboxClickable = true;
boolean hitboxVisable = true;
String ingredient = "";

//TODO: Event triggered on click
{
	if (CupStack.haveCup == true)
	{
		if (ingredientCount < 5)
		{
			drinkInProg[ingredientCount] = ingredient;
			ingredientCount++;
			this.hitboxClickable = false;
		}
	}
}

*******CoffeePot extends CoffeeBarObject

this.ingredient = "coffee";

*******IceMachine extends CoffeeBarObject

this.ingredient = "ice";

*******MilkJug extends CoffeeBarObject

this.ingredient = "milk";

*******CaramelPump extends CoffeeBarObject

this.ingredient = "caramel";


*******CupStack extends CoffeeBar

//Event triggered on click
if (haveCup == false)
	haveCup = true;
	//TODO: change mouse curser from standard arrow (or hand) to coffee cup icon

	
*****PickupWindow extends CoffeeBarObject

String drinkName = "";
int drinkCount = 0;

//Event triggered on click !!!Method Overload the event inherited from CoffeeBarObject
{
	if(haveCup == true)
		{
		//TODO: loop to scan drinkInProg[] to check ingredients
		//assign String to drinkName according to ingredients in drinkInProg[]
		completedOrder[drinkCount] = drinkName;
		drinkCount++;
		ingredientCount = 0;
		haveCup = false;
		//TODO: change mouse curser from coffee cup icon to standard arror (or hand)
		}

}

*******SubmitButton extends CoffeeBarObject // Not sure if it really makes sense to extend here since it does have an ingredient

//Event triggered on click !!!Method Overload the event inherited from CoffeeBarObject
{
	if(haveCup == false)
		{
		//TODO: ask if user wants to submit
		// if yes, scan completedOrder[] and compare to placedOrder[] 
		//Assign score/check pass fail etc.
		}
}
 */

