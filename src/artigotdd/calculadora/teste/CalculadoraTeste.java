package artigotdd.calculadora.teste;

public class CalculadoraTeste {
	 
    @Test(expected = ArithmeticException.class)
    public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirUmNumeroPorZero()
            throws Exception {
        int valorA = 6;
        int valorB = 0;
        Calculadora calculadora = new Calculadora();
        calculadora.divide(valorA, valorB);
    }
}
