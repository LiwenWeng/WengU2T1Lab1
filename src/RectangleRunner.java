public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();
        Rectangle[] plots = new Rectangle[]{plot1, plot2, plot3};

        plots[0].setWidth(75);
        plots[1].setWidth(75);
        plots[1].setLength(75);
        plots[2].setWidth(75);

        System.out.println("These three plots requires " + (plots[0].calculateArea() + plots[1].calculateArea() + plots[2].calculateArea()) + " square feet of seed");
    }

    public static void printPlots(Rectangle[] plots) {
        for (int i = 0; i < plots.length; i++) {
            System.out.println("Plot " + (i + 1) + " length: " + plots[i].getLength());
            System.out.println("Plot " + (i + 1) +  " width: " + plots[i].getWidth());
            System.out.println("Plot " + (i + 1) + " area: " + plots[i].calculateArea());
            System.out.println();
        }
    }
}