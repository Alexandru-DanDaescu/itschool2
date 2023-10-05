package session11_abstraction.challenges.challengesix;

public class GeometryFormulasTesting {

    public static void main(String[] args) {

        Area area = new Area();

        System.out.printf("%.3f" ,area.RectangleArea(21.12,23.12));
        System.out.println();
        System.out.printf("%.3f" ,area.SquareArea(6));
        System.out.println();
        System.out.printf("%.3f" ,area.CircleArea(123.43));
    }
}
