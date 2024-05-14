import java.util.Scanner;

public class CAD_USD_Conversion {
    private double usd;
    private double cad;

    public double startConverter(){
        boolean endPROGRAM = false;
        Scanner scan = new Scanner(System.in);
        String userInput;

        do{
            /*Ask user for Currency*/
            System.out.println("Would you like to convert from CAD –> USD or USD –> CAD?");
            userInput = scan.nextLine();
            userInput = userInput.toLowerCase();

            if (userInput.equals("cad")) {
                System.out.println("Please enter the CAD amount: ");
                cad = scan.nextDouble();
                setCAD(cad);
            }
        }while(!endPROGRAM);
    }

    /*Converting CAD --> USD*/
    public void setCAD(double cadTOUSD){
        this.cad = cadTOUSD;
    }

    public double getCAD(){
        return this.cad;
    }
    
    /*Converting CAD --> USD*/
    public void setUSD(double usdTOCAD){
        this.usd = usdTOCAD;
    }
    public double getUSD(){
        return this.usd;
    }

    public double calculateTOUSD(double ){

        return totalUSD;
    }
}
