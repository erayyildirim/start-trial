public class CarTest {
 
    public static void main(String[] args) {
 
        Car car1 = new Car();
        System.out.println(car1.getInfo());
        System.out.println();
        
        Car odev1 = new Car();
        Car odev2 = new Car();
        int yol = 1000;
       
        float sure1;
        float sure2;
        
        odev1.accelerate(100);
        sure1 = (float)yol / odev1.speed;
        System.out.println("odev1= " + sure1 + " saniyede yolu almıştır.");
        
        odev2.accelerate(120);
        sure2 = (float)yol / odev2.speed;
        System.out.println("odev2= " + sure2 + " saniyede yolu almıştır.");
        
        System.out.println();
/*        
        car1.make = "Mercedes";
        car1.model = "C200";
        car1.year = "2015";
        car1.distance = 0;
        car1.speed = 0;
        System.out.println(car1.getInfo());
        System.out.println();
 
        car1.accelerate(125);
        car1.go(100);
        car1.go(50);
        System.out.println(car1.getInfo());
 
        System.out.println();
 
         Car car2 = new Car();
         car2.make = "BMW";
         car2.model = "i8";
         car2.year = "2016";
         car2.distance = 10000;
         car2.speed = 160;
         System.out.println(car2.getInfo());
*/    
    }
}