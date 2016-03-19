package Compare;

import Compare.Length.*;
import Compare.Volume.Gallon;
import Compare.Volume.Liter;
import Compare.Volume.Volume;
import org.junit.Assert;
import org.junit.Test;

public class CompareTest {
    @Test
    public void compareLengthShouldGiveTrueIfBothTheQuantitiesHaveSameValueInOneUnit() throws Exception {
        Unit feet = new Feet(1);
        Unit inch = new Inch(12);

        Assert.assertEquals(feet,inch);
    }

    @Test
    public void scaleShouldBeAbleToCompareWithItsOwnType() throws Exception {
        Unit feet = new Feet(1);
        Unit inch = new Inch(12);
        Assert.assertEquals(feet,feet);
        Assert.assertEquals(inch,inch);
    }

    @Test
    public void withTheHelpOfTheScaleIShouldBeAbleToCompereInchToCentimeter() throws Exception {
        Unit inch = new Inch(1);
        Unit centimeter = new Centimeter(2.5);
        Assert.assertEquals(inch,centimeter);
    }

    @Test
    public void withTheHelpOfTheScaleIShouldBeAbleToCompereCentimeterToMilimeter() throws Exception {
        Unit centimeter = new Centimeter(1);
        Unit milimeter = new Milimeter(10);
        Assert.assertEquals(centimeter,milimeter);
    }

    @Test
    public void scalesShouldBeAbleToAddWithAnotherScale() throws Exception {
        Unit inch1 = new Inch(2);
        Unit inch2 = new Inch(2);
        Inch sum = new Inch(4);
        Assert.assertEquals(sum,inch1.add(inch2));
    }

    @Test
    public void scalesShouldBeAbleToAddWithdifferentScale() throws Exception {
        Unit centimeter = new Centimeter(2.5);
        Unit inch = new Inch(2);
        Unit sum = new Inch(3);
        Assert.assertEquals(sum,inch.add(centimeter));
    }

    @Test
    public void scalesShouldBeAbleToCompareGallonAndLiter() throws Exception {
        Volume gallon = new Gallon(1);
        Volume liter = new Liter(3.78);
        Assert.assertEquals(gallon,liter);
    }



}