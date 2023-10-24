package minggu9.StudiKasus2;


import java.text.DecimalFormat;


public class PaintThings 
{
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);


        Shape deck = new Rectangle("Deck", 20, 35);
        Shape bigBall = new Sphere("Big Ball", 15);
        Shape tank = new Cylinder("Tank", 10, 30);

        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);

        //print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed .... ");
        System.out.println("Deck : " + fmt.format(deckAmt));
        System.out.println("Big Ball : " + fmt.format(ballAmt));
        System.out.println("Tank : " + fmt.format(tankAmt));
    }
}
