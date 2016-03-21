package Compare;

import Compare.Length.*;
import Compare.Volume.Volume;
import Compare.Volume.VolumeUnits;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CompareTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void compareLengthShouldGiveTrueIfBothTheQuantitiesHaveSameValueInOneUnit() throws Exception {
        Length oneFeet = new Length(1, LengthUnits.Feet);
        Length twelveInch = new Length(12, LengthUnits.Inch);
        assertEquals(oneFeet,twelveInch);
    }

    @Test
    public void unitShouldBeAbleToCompareWithItsOwn() {
        Length oneFeet = new Length(1, LengthUnits.Feet);
        Length twoInch = new Length(2, LengthUnits.Inch);
        assertEquals(oneFeet,oneFeet);
        assertEquals(twoInch,twoInch);
    }

    @Test
    public void withTheHelpOfTheScaleIShouldBeAbleToCompereInchToCentimeter() throws Exception {
        Length inch = new Length(1, LengthUnits.Inch);
        Length centimeter = new Length(2.5, LengthUnits.Centimeter);
        assertEquals(inch,centimeter);
    }

    @Test
    public void withTheHelpOfTheScaleIShouldBeAbleToCompereCentimeterToMilimeter() throws Exception {
        Length centimeter = new Length(1, LengthUnits.Centimeter);
        Length millimeter = new Length(10, LengthUnits.Millimeter);
        assertEquals(centimeter,millimeter);
    }

    @Test
    public void unitsShouldBeAbleToAddWithAnotherScale() throws Exception {
        Length inch1 = new Length(2, LengthUnits.Inch);
        Length inch2 = new Length(2, LengthUnits.Inch);
        Length sum = new Length(4, LengthUnits.Inch);
        assertEquals(sum,inch1.add(inch2));
    }

    @Test
    public void unitsShouldBeAbleToAddWithdifferentScale() throws Exception {
        Length centimeter = new Length(2.5, LengthUnits.Centimeter);
        Length inch = new Length(2, LengthUnits.Inch);
        Length sum = new Length(3, LengthUnits.Inch);
        assertEquals(sum,inch.add(centimeter));
    }

    @Test
    public void unitsShouldBeAbleToCompareGallonAndLiter() throws Exception {
        Volume _1Gallon = new Volume(1, VolumeUnits.GALLON);
        Volume litre = new Volume(3.78, VolumeUnits.LITRE);
        assertEquals(_1Gallon,litre);
    }

    @Test
    public void unitsShouldBeAbleToAddLitreWithLitre() throws Exception {
        Volume oneLitre = new Volume(1, VolumeUnits.LITRE);
        Volume twoLitre = new Volume(2,VolumeUnits.LITRE);
        Volume threeLitre = new Volume(3,VolumeUnits.LITRE);
        assertEquals(threeLitre,oneLitre.add(twoLitre));
    }

    @Test
    public void unitsShouldBeAbleToAddGallonAndLitre() {
        Volume oneLitre = new Volume(1,VolumeUnits.LITRE);
        Volume oneGallon = new Volume(1,VolumeUnits.GALLON);
        Volume sum = new Volume(4.78, VolumeUnits.LITRE);
        assertEquals(sum,oneGallon.add(oneLitre));
    }
}