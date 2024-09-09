public class ClayFigure {
 
    public int weight = 1440; // instance variable
    public static double height = 34.2; // class variable
 
    public static void main(String[] args) {
 
        ClayFigure clayFigureAomori = new ClayFigure();
 
        System.out.println("Hello, clay figure!");
 
        // access the instance variable from the instance clayFigureAomori
        System.out.println("Weight: " + clayFigureAomori.weight);
 
        // access the class variable from the class ClayFigure
        System.out.println("Height: " + ClayFigure.height);
    }
 
    public static void laugh(int timesOrWhatever) {
        for (int i = 0; i < timesOrWhatever; i++) {
            System.out.println("ha");
        }
    }
 
    public static void laugh(int timesOrWhatever, String sound) {
        for (int i = 0; i < timesOrWhatever; i++) {
            System.out.println(sound);
        }
    }
}
