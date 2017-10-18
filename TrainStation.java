public class TrainStation
{
    private String city;
    private TicketMachine machine1;
    private TicketMachine machine2;
    
    /**
     * Constructor de la estacion de tren
     */
    public TrainStation(String cityName)
    {
        city = cityName;
        machine1 = new TicketMachine(500);
        machine2 = new TicketMachine(600);
    }
    
    /**
     * Simulamos que vendemos tickets
     */
    public void ventaBilleteMaquina1()
    {
        machine1.insertMoney(500);
        machine1.printTicket();
    }
    
     /**
     * Simulamos que vendemos tickets
     */
    public void ventaBilleteMaquina2()
    {
        machine2.insertMoney(600);
        machine2.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado
     */
}