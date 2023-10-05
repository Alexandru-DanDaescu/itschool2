package session15_equalsAndHashcodeAndGenerics.challenges.rectangleequalshashcode;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle1.setHeight(15);


        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(10);
        rectangle2.setHeight(15);

        System.out.println(rectangle1.equals(rectangle2));

        System.out.println("Rectangle1: " + rectangle1.hashCode());
        System.out.println("Rectangle2: " + rectangle2.hashCode());


    }
}
