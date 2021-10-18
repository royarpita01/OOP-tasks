
package assignment.pkg3;

public class SmartPhone {
    String brand, network;
    int camera;
    
    public SmartPhone(){
        brand = "Redmi";
        network = "4G";
        camera =  12;
        System.out.println("Brand= "+brand);
        System.out.println("Network = "+network);
        System.out.println("Camera= "+camera);
    }
    
    public SmartPhone(String brand, String network, int camera){
        this.brand = brand;
        this.network = network;
        this.camera = camera;
        System.out.println("Brand= "+brand);
        System.out.println("Network = "+network);
        System.out.println("Camera= "+camera);
        
    }
}

