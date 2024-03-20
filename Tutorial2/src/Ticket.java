public class Ticket {
    private static int noTicketSold= 0;
    private int ticketNum;
    public Ticket(){
        noTicketSold++;
        ticketNum = noTicketSold;
    }

    public int getTicketNum() {
        return ticketNum;
    }
    public static int getNoTicketSold(){
        return noTicketSold;
    }
    public void getinfo(){
        System.out.println("The number of tickets that have been booked:" + noTicketSold);
    }

    public static void main(String[] args) {

    }
}

