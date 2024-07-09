//6510450291 ชุติพงษ์ ไตรยะสิทธิ์
public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println("Inventory = " + gumballMachine.getGumballs());
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();

        System.out.println("Inventory = " + gumballMachine.getGumballs());
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println();

        System.out.println("Inventory = " + gumballMachine.getGumballs());
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println();

        System.out.println("Inventory = " + gumballMachine.getGumballs());
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        System.out.println("Inventory = " + gumballMachine.getGumballs());
    }
}
