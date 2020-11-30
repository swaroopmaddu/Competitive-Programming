public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }

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

        System.out.println(dvdCollection[5]);

        int capacity = dvdCollection.length;
        System.out.println("The Array has a capacity of " + capacity);
        
    int[] squareNumbers = new int[10];

    // Go through each of the Array indexes, from 0 to 9.
    for (int i = 0; i < 10; i++) {
        // We need to be careful with the 0-indexing. The next square number
        // is given by (i + 1) * (i + 1).
        // Calculate it and insert it into the Array at index i.
        int square = (i + 1) * (i + 1);
        squareNumbers[i] = square;
    }
    for (int square : squareNumbers) {
        // Print the current value of square.
        System.out.print(square + " ");
    }

    }
}