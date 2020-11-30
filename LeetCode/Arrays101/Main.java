package Arrays101;

/**
 *
 * @author Sai
 */
public class Main {
    public static void main(String[] args) {
        DVD[] dvdCollection = new DVD[10];
        
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[1] = incrediblesDVD;
        dvdCollection[2] = lionKingDVD;
        dvdCollection[3] = avengersDVD;
        dvdCollection[4] = starWarsDVD;
        dvdCollection[0] = findingDoryDVD;
        dvdCollection[5] = new DVD("Star Kid", 1997, "George Ben");
        
        for (DVD cdDvd : dvdCollection) {
            System.out.println(cdDvd);
        }

        int capacity = dvdCollection.length;
        System.out.println("The Array has a capacity of " + capacity);
        
        int[] squareNumbers = new int[10];

        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            int square = (i + 1) * (i + 1);
            squareNumbers[i] = square;
        }
        for (int square : squareNumbers) {
            // Print the current value of square.
            System.out.print(square + " ");
        }
        
    }
}
