package Patterns.Structural.Proxy.DoAPI;

public class DoAPIProxy {
    public void validateAndPerform(String URL){
        if(URL.equals("")){ System.out.println("Invalid URL"); }
        else {
            new DoAPI().perform(URL);
        }
    }

}
