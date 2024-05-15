import java.util.Scanner;

public class CAD_USD_Conversion {
    private double usd;
    private double cad;

    public void startConverter(){
        boolean endPROGRAM = false;
        Scanner scan = new Scanner(System.in);
        String userInput;
        String userENDPROGRAM;

        do{
            /*Ask user for Currency*/
            System.out.println("Would you like to convert from CAD –> USD or USD –> CAD?");
            userInput = scan.nextLine();
            userInput = userInput.toLowerCase();

            if (userInput.equals("cad")) { //add check for if correct amount entered using getCAD
                System.out.println("Please enter the CAD amount: ");
                cad = scan.nextDouble();
                setCAD(cad);
                System.out.println("Your USD amount is: " + calculateTOUSD());
            }
            else if (userInput.equals("usd")) { //add check for if correct amount entered using getUSD
                System.out.println("Please enter the USD amount: ");
                usd = scan.nextDouble();
                setUSD(usd);
                System.out.println("Your CAD amount is: " + calculateTOCAD());
            }
            else{
                System.out.println("Please enter a valid option");
            }

            //Prompt for another conversion
            System.out.println("Would you like to convert again?");
            userENDPROGRAM = scan.nextLine();
            userENDPROGRAM = userENDPROGRAM.toLowerCase();
            //Ends program
            if (userENDPROGRAM.equals("no")) {
                endPROGRAM = true;
            }
        }while(endPROGRAM);
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
