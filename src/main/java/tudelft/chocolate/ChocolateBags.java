package tudelft.chocolate;

public class ChocolateBags {

    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5; // ANzahl der ganzzahigen 5 Kilo Tafeln, die für das Packet gebraucht werden.
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big; // werden weniger große Tafeln gebraucht als vorätig? falls ja nimm diese Anzahl, falls nein nimm alle vorätigen.
        total -= (bigBoxesWeCanUse * 5); // ziehe von der geforderten Menge die Menge der grossen ab.

        if(small < total) // Wenn die Anzahl der kleinen kleiner als die gebrauchte Menge ist, gib minus 1 zurück?
            return -1;
        return total;

    }

    public static void main (String [] args) {
    	ChocolateBags cB = new ChocolateBags();
    	System.out.println(cB.calculate(5, 2, 10));
    }
    
}
