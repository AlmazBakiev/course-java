public class CalculatorForComplexNumber implements Calculator {

    private ConsoleLogger logger;

    public CalculatorForComplexNumber() {
        this.logger = new ConsoleLogger();
    }

    @Override
    public ComplexNumber sum(ComplexNumber firstArgument, ComplexNumber secondArgument) {
        logger.log("Adding " + firstArgument.toString() + " and " + secondArgument.toString());
        double real = firstArgument.getRealPart() + secondArgument.getRealPart();
        double imaginary = firstArgument.getImaginaryPart() + secondArgument.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log("Result: " + result.toString());
        return result;
    }

    @Override
    public ComplexNumber subtract(ComplexNumber firstArgument, ComplexNumber secondArgument) {
        logger.log("Subtracting " + firstArgument.toString() + " and " + secondArgument.toString());
        double real = firstArgument.getRealPart() - secondArgument.getRealPart();
        double imaginary = firstArgument.getImaginaryPart() - secondArgument.getImaginaryPart();
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log("Result: " + result.toString());
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber firstArgument, ComplexNumber secondArgument) {
        logger.log("Multiplying " + firstArgument.toString() + " and " + secondArgument.toString());
        double real = (firstArgument.getRealPart() * secondArgument.getRealPart())
                - (firstArgument.getImaginaryPart() * secondArgument.getImaginaryPart());
        double imaginary = (firstArgument.getRealPart() * secondArgument.getImaginaryPart())
                + (firstArgument.getImaginaryPart() * secondArgument.getRealPart());
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log("Result: " + result.toString());
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber firstArgument, ComplexNumber secondArgument) {
        logger.log("Multiplying " + firstArgument.toString() + " and " + secondArgument.toString());
        double denominator = (secondArgument.getRealPart() * secondArgument.getRealPart())
                + (secondArgument.getImaginaryPart() * secondArgument.getImaginaryPart());
        double real = ((firstArgument.getRealPart() * secondArgument.getRealPart())
                + (firstArgument.getImaginaryPart() * secondArgument.getImaginaryPart())) / denominator;
        double imaginary = ((firstArgument.getRealPart() * secondArgument.getImaginaryPart())
                - (firstArgument.getImaginaryPart() * secondArgument.getRealPart())) / denominator;
        ComplexNumber result = new ComplexNumber(real, imaginary);
        logger.log("Result: " + result.toString());
        return result;
    }
}
