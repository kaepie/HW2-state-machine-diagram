//6510450291 ชุติพงษ์ ไตรยะสิทธิ์
public class GumballMachine {
    private int gumballs ;
    private boolean noQuarter = true;
    private boolean hasQuarter = false;
    private boolean gumballSold = false;
    private boolean outOfGumballs = false;

    public int getGumballs() {
        return gumballs;
    }

    GumballMachine(int gumballs){
        this.gumballs = gumballs;
    }

    public void insertQuarter(){
        if (outOfGumballs){
            System.out.println("You can't insert a quarter, the machine is sold out");
        }
        else if(hasQuarter){
            System.out.println("You can't insert another quarter");
        }
        else{
            System.out.println("You Insert a quarter");
            noQuarter = false;
            hasQuarter = true;
        }
    }
    public void ejectQuarter(){
        if (hasQuarter) {
            System.out.println("Quarter returned");
            noQuarter = true;
            hasQuarter = false;
        }
        else if(noQuarter){
            System.out.println("You haven't inserted a quarter");
        }
    }
    public void turnCrank(){
        if (hasQuarter){
            System.out.println("You turned...");
            System.out.println("A gumball comes rolling out the slot");
            hasQuarter = false;
            gumballSold = true;
            dispenseGumball();
        }
        else if(noQuarter){
            System.out.println("You turned but there's no quarter");
        }
        else if(outOfGumballs){
            System.out.println("You turned, but there are no gumballs");
        }
    }

    public void dispenseGumball(){
        gumballSold = false;
        gumballs--;
        if(gumballs > 0) {
            noQuarter = true;
        }
        else {
            System.out.println("Oops, out of gumballs!");
            outOfGumballs = true;
        }
    }
}
