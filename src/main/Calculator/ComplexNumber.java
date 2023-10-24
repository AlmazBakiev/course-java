public class ComplexNumber  {

    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        if (this.imaginaryPart == 0) return this.realPart + "";
        if (this.realPart == 0) return this.imaginaryPart + "i";
        if (this.imaginaryPart > 0) return this.realPart + "+" + this.imaginaryPart + "i";
        return "" + this.realPart + this.imaginaryPart + "i";
    }
}
