class car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    String matricula;
    String modelo;
    String color;
    double tarifa;
    boolean disponible; 


    public Car( String license, Account driver, Integer passenger,  String matricula, String modelo, String color, double tarifa, boolean disponible ) {
        this.license =license;
        this.driver = driver;
        this.passenger = passenger;
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;

    }

    void  printDataCar(){
         System.out.println("license: " + license + "driver:" + driver); 

    }
}