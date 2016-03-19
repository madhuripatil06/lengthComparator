package Compare;

import Compare.Length.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareTest {
    @Test
    public void compareLengthShouldGiveTrueIfBothTheQuantitiesHaveSameValueInOneUnit() throws Exception {
        Unit feet = new Feet(1);
        Unit inch = new Inch(12);

        assertEquals(feet,inch);
    }

    @Test
    public void scaleShouldBeAbleToCompareWithItsOwnType() throws Exception {
        Unit feet = new Feet(1);
        Unit inch = new Inch(12);
        assertEquals(feet,feet);
        assertEquals(inch,inch);
    }

    @Test
    public void withTheHelpOfTheScaleIShouldBeAbleToCompereInchToCentimeter() throws Exception {
        Unit inch = new Inch(1);
        Unit centimeter = new Centimeter(2.5);
        assertEquals(inch,centimeter);
    }

    @Test
    public void withTheHelpOfTheScaleIShouldBeAbleToCompereCentimeterToMilimeter() throws Exception {
        Unit centimeter = new Centimeter(1);
        Unit milimeter = new Milimeter(10);
        assertEquals(centimeter,milimeter);
    }

    @Test
    public void scalesShouldBeAbleToAddWithAnotherScale() throws Exception {
        Unit inch1 = new Inch(2);
        Unit inch2 = new Inch(2);
        Inch sum = new Inch(4);
        assertEquals(sum,inch1.add(inch2));
    }

    @Test
    public void scalesShouldBeAbleToAddWithdifferentScale() throws Exception {
        Unit centimeter = new Centimeter(2.5);
        Unit inch = new Inch(2);
        Unit sum = new Inch(3);
        assertEquals(sum,inch.add(centimeter));
    }

    @Test
    public void scalesShouldBeAbleToCompareGallonAndLiter() throws Exception {
        Unit gallon = new Gallon(1);
        Unit liter = new Litre(3.78);
        assertEquals(gallon,liter);
    }

    @Test
    public void unitShouldBeAbleToCompareTheGallonAndinch() throws Exception {
        Unit gallon = new Gallon(1);
        Unit inch = new Inch(1);
        assertEquals(gallon,inch);
    }
    @Test
    public void scalesShouldBeAbleToAddGallonWithLiter() throws Exception {
        Gallon gallon = new Gallon(1);
        Litre litre = new Litre(1);
        Litre sum = new Litre(4.78);
        assertEquals(sum,gallon.add(litre));
    }
}