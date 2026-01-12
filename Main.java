import prototype.GraphicElement;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        GraphicElement button1 = new GraphicElement("Rectangle", "Blue", 10, 20);
        
        GraphicElement button2 = button1.clone();
        button2.setX(40);
        button2.setY(60);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");
        System.out.println(button1);
        System.out.println(button2);

        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();
        System.out.println("config1 == config2: " + (config1 == config2));
    }
}