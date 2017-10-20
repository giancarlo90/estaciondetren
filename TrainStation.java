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
     * Devuelve el total de dinero recaudado por las maquinas de la estacion hasta el momento
     */
    public int devolucion()
    {
        return machine1.getTotal() + machine2.getTotal();
        
    }
    
    
    
    /**
     * Devuelve el total de dinero recaudado por la maquina 1 hasta el momento
     */
    public int devolucionMaquina1()
    {
    return machine1.getTotal();
    }
    
       
    /**
     * Devuelve el total de dinero recaudado por la maquina 1 hasta el momento
     */
    public int devolucionMaquina2()
    {
    return machine2.getTotal();
    }
    
    /** 
     * Imprime por pantalla la cantidad recaudada por la maquina 1 y 2 y el total de ambas
     */
    public void maquina1()
    {
        System.out.println ("La cantidad de la maquina 1 es " + machine1.getTotal());
    }
    
        public void maquina2()
    {
        System.out.println ("La cantidad de la maquina 2 es " + machine2.getTotal());
    }
    
    public void totales()
     {
        System.out.println ("La recaudacion total es " + (machine1.getTotal() + machine2.getTotal()));
     }
}