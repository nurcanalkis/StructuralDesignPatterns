import BridgeEx1.JavaQuestions;
import BridgeEx1.QuestionFormat;
import BridgeEx2.Circle;
import BridgeEx2.GreenCircle;
import BridgeEx2.RedCircle;
import BridgeEx2.Shape;
import CompositeEx1.Accountant;
import CompositeEx1.BankManager;
import CompositeEx1.Cashier;
import CompositeEx1.Employee;
import CompositeEx2.Menu;
import CompositeEx2.MenuComponent;
import CompositeEx2.MenuItem;
import CompositeEx2.Waitress;
import Decorator_food.ChineeseFood;
import Decorator_food.Food;
import Decorator_food.NonVeganFood;
import Decorator_food.VeganFood;

import Decorator_shape.Rectangle;
import Decorator_shape.RedShapeDecorator;

import FlyWeightEx1.Player;
import FlyWeightEx1.PlayerFactory;
import FlyWeightEx2.Car;
import FlyWeightEx2.CarFactory;
import ProxyEx1.OfficeInternetAccess;
import ProxyEx1.ProxyInternetAccess;
import ProxyEx2.Image;
import ProxyEx2.ProxyImage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class StructuralMain {
    static CarFactory carFactory = new CarFactory();
    private static int choice;
    private static String[] playerType =
            {"Terrorist", "CounterTerrorist"};
    private static String[] weapons =
            {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Hello world");
        /*
        //ADAPTER
        CreditCard targetInterface=new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());

         */

        /*
        //Adapter 2 Media Player

        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");

        */

        /*
        //FACADE
        ShopKeeper shopKeeper=new ShopKeeper();
        shopKeeper.huaweiSale();
        shopKeeper.iphoneSale();
        shopKeeper.samsungSale();

        */
        /*
        //FACADE Shape
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
        */
        /*

        //Proxy 1 Internet Access Example
        OfficeInternetAccess access = new ProxyInternetAccess("Nurcan Alkış");
        access.grantInternetAccess();
*/


        /*
        //Proxy 2 example image
        Image image = new ProxyImage("nurcan.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();

        */

        /*
        //Composite Example Employee
        Employee emp1=new Cashier(101,"Nurcan Alkis", 20000.0);
        Employee emp2=new Cashier(102,"Nur Alkis", 25000.0);
        Employee emp3=new Accountant(103,"Can Alkis", 30000.0);
        Employee manager1=new BankManager(100,"Nurcan Bayhan",100000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();

         */

/*


        //Composite example menu
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        // add menu items here
        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));
        // add more menu items here
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

*/



/*
        //Decorator Shape
        // Creating an object of Shape interface
        // inside the main() method
        Shape circle = new Circle();

        Shape redCircle
                = new RedShapeDecorator(new Circle());

        Shape redRectangle
                = new RedShapeDecorator(new Rectangle());

        // Display message
        System.out.println("Circle with normal border");

        // Calling the draw method over the
        // object calls as created in
        // above classes

        // Call 1
        circle.draw();

        // Display message
        System.out.println("\nCircle of red border");

        // Call 2
        redCircle.draw();

        // Display message
        System.out.println("\nRectangle of red border");

        // Call 3
        redRectangle.draw();

 */
/*
        //Decorator food
        do{
            System.out.print("========= Food Menu ============ \n");
            System.out.print("            1. Vegetarian Food.   \n");
            System.out.print("            2. Non-Vegetarian Food.\n");
            System.out.print("            3. Chineese Food.         \n");
            System.out.print("            4. Exit                        \n");
            System.out.print("Enter your choice: ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            choice=Integer.parseInt(br.readLine());
            switch (choice) {
                case 1:{
                    VeganFood vf=new VeganFood();
                    System.out.println(vf.prepareFood());
                    System.out.println( vf.foodPrice());
                }
                break;

                case 2:{

                    Food f1=new NonVeganFood((Food) new VeganFood());
                    System.out.println(f1.prepareFood());
                    System.out.println( f1.foodPrice());
                }
                break;
                case 3:{
                    Food f2=new ChineeseFood((Food) new VeganFood());
                    System.out.println(f2.prepareFood());
                    System.out.println( f2.foodPrice());
                }
                break;

                default:{
                    System.out.println("Other than these no food available");
                }
                return;
            }//end of switch

        }while(choice!=4);

 */

    //Bridge Example 1: questions
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestions();
        questions.delete("what is class?");
        questions.display();
        questions.newOne("What is inheritance? ");

        questions.newOne("How many types of inheritance are there in java?");
        questions.displayAll();


        /*
        //Bridge Example 2: drawAPI

        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

         */
/*
        //FlyWeight CounterStrike Example
        for (int i = 0; i < 10; i++)
        {
            //getPlayer() is called simply using the class name since the method is a static one
            Player p = PlayerFactory.getPlayer(getRandPlayerType());

            //Assign a weapon chosen randomly uniformly from the weapon array
            p.assignWeapon(getRandWeapon());

            // Send this player on a mission
            p.mission();
        }
        */
/*
    //FlyWeight Example 2 Car
        for(int x = 1; x < 5; x++) {
            Car car1 = carFactory.getCar("Chevrolet");
            System.out.println("A Chevrolet car was drawn in position (x, y)=("+x+",10)");
        }

        for(int x = 1; x < 5; x++) {
            Car car1 = carFactory.getCar("BMW");
            System.out.println("A BMW car was drawn in position (x, y)=("+x+",10)");
        }



    }

 */

    public static String getRandPlayerType()
    {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }
    public static String getRandWeapon()
    {
        Random r = new Random();

        // Will return an integer between [0,4)
        int randInt = r.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

}

