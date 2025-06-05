public class Calculator {
    int primerValor;
    int segundoValor;

    public Calculator(int a, int b) {
        primerValor = a;
        segundoValor = b;
    }

    public int add() {
        return primerValor + segundoValor;
    }

    public int subtract() {
        return primerValor - segundoValor;
    }

    public int multiply() {
        return primerValor * segundoValor;
    }

    public int divide() {
        return  primerValor / segundoValor;
    }

    public int modulo() {
        return primerValor % segundoValor;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator(5, 7);
        System.out.println(myCalculator.add());
    }
}