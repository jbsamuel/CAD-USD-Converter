/* */
import java.util.Scanner;

public class CAD_USD_Conversion {
    private double usd;
    private double cad;

    public void startConverter(){
        boolean endPROGRAM = false;
        String userInput;
        String userENDPROGRAM;

        do{
            Scanner user = new Scanner(System.in);
            Scanner userEnd = new Scanner(System.in);

            /*Ask user for Currency*/
            System.out.println("Would you like to convert from: CAD –> USD or USD –> CAD?");
            System.out.println("Enter your choice: CAD or USD ");
            userInput = user.nextLine();
            userInput = userInput.toLowerCase();

            if (userInput.equals("cad")) { //add check for if correct amount entered using getCAD
                System.out.println("Please enter the CAD amount: ");
                cad = user.nextDouble();
                setCAD(cad);
                System.out.println("Your USD amount is: " + calculateTOUSD() + "\n");
            }
            else if (userInput.equals("usd")) { //add check for if correct amount entered using getUSD
                System.out.println("Please enter the USD amount: ");
                usd = user.nextDouble();
                setUSD(usd);
                System.out.println("Your CAD amount is: " + calculateTOCAD() + "\n");
            }
            else{
                System.out.println("Please enter a valid option");
            }

            //Prompt for another conversion
            System.out.println("Would you like to convert again?");
            userENDPROGRAM = userEnd.nextLine();
            userENDPROGRAM = userENDPROGRAM.toLowerCase();
            //Ends program
            if (userENDPROGRAM.equals("no")) {
                endPROGRAM = true;
            }
        }while(!endPROGRAM);

    }

    /*CAD --> USD*/
    public void setCAD(double cadTOUSD){
        this.cad = cadTOUSD;
    }

    public double getCAD(){
        return this.cad;
    }

    //Calculate CAD to USD
    public double calculateTOUSD(){
        double exchangeRATECAD = 0.7309;

        double totalUSD = getCAD() * exchangeRATECAD  ;
        return totalUSD;
    }

    /*USD --> CAD*/
    public void setUSD(double usdTOCAD){
        this.usd = usdTOCAD;
    }

    public double getUSD(){
        return this.usd;
    }

    //Calculate USD to CAD
    public double calculateTOCAD(){
        double exchangeRATEUSD = 1.3683;

        double totalCAD = getUSD() * exchangeRATEUSD  ;
        return totalCAD;
    }
}
