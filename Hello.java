import java.util.Scanner;

public class Hello{
    public static void start(){
        System.out.println("The car has been started!!");
    }
    public static void stop(){
        System.out.println("The car has been stopped!!");
    }
    public static void accelerate(){
        System.out.println("Accelerating");
    }
    public static void main(String args[]){
        Scanner command = new Scanner(System.in);
        boolean started = false;
        boolean stopped = true;
        boolean accelerated = false;
        while(true){
            System.out.println("Enter your command here >>>");
            String newCommand = command.nextLine().toLowerCase();
            String commands = "Type: \n >>>\"start\" to start the car \n >>>\"stop\" to stop the car \n >>> \"speed\" to accelerate the car \n >>>\"break\" to turn off the engine";
            switch (newCommand) {
                case "start":
                    if (started == false){
                        started = true;
                        stopped = false;
                        accelerated = false;
                        start();
                    } else{
                        System.out.println("The car has already been started");
                    }
                    break;
                case "stop":
                    if (stopped == false && started == true){
                        stopped = true;
                        started = false;
                        accelerated = false;
                        stop();
                    } else{
                        System.out.println("The car has already been stopped");
                    }
                    break;
                case "speed":
                    if (started == true && accelerated == false){
                        accelerate();
                        accelerated = true;
                    } else if (stopped == true){
                        System.out.println("The car has been stopped, please start the car");
                    } else if (accelerated == true){
                        System.out.println("The car has already been accelerated!");
                    }
                    break;
                case "help":
                    System.out.println(commands);
                case "break":
                    break;
                default :
                    System.out.println("Invalid command \n type help to show the commands!!");
            }
        }
    }
}