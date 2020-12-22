package Chapter_16_Javadoc;


public class P268 {

    //Documentatie van eigenschappen
    /** The number of instances */
    private static int count = 0;

    /** The number of angles*/
    public static final int ANGLES = 4;

    //Documentatie van methoden en constructors
    /** This constructor creates a square with specified side.
     * @param side The initial side of the square.
     * @param x The x position of the square.
     * @param y The y position of the square;
     * @throws graphics.NegativeSizeException The side is negative.
     */

    /** Returns the side of the square.
     * The side of the square can be set using
     * { @link graphics.Square#setSide}.
     * @return The side of the square
     * @see graphics.Square#setSide
     */

    //Documentatie van pakketten
    /**
     * The package <strong>graphics</strong> contains classes
     * and interfaces which represent graphical shapes.
     */
}
