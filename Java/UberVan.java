import java.util.Arraylist;
import java.util.Map;

class UberVan extends Car{
    Map<String, Arraylist<String,Integer>> typeCarAccepted;
    Arraylist<string> seatsMaterial;

    public UberVan(STRING license, Account driver, 
    Map<string, Arraylist<String,Integer>> typeCarAccepted,
    Arraylist<String>seatsMaterial){
        super(license,driver);
        this.typeCarAccepte = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

} 




