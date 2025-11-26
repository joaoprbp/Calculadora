/**
 * <h2>Exercício PR: objeto Calculadora</h2>
 *
 * <p>Esta classe implementa operações matemáticas básicas: soma,
 * subtração, multiplicação e divisão. Também oferece um método que
 * seleciona dinamicamente a operação com base em um operador informado.</p>
 *
 * <p>Este projeto utiliza Javadoc para documentação e segue boas práticas
 * para facilitar a leitura, manutenção e realização de testes unitários.</p>
 *
 * <ul>
 *   <li>Exercícios de revisão escritos (caixa branca)</li>
 *   <li>Exercícios de revisão utilizando JUnit</li>
 *   <li>Aplicação do reatorHaz com código Java</li>
 *   <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>Todos os métodos desta classe são públicos para permitir testes unitários
 * e facilitar a integração com outros componentes.</p>
 *
 * @author João Paulo Ribeiro Brisola Pereira
 * @version 1.1.0
 */

public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma entre {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número do primeiro número.
     *
     * @param a valor inicial
     * @param b valor que será subtraído de {@code a}
     * @return o resultado da subtração {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o produto de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número pelo segundo.
     *
     * <p>Este método verifica se o divisor é zero para evitar
     * erros de execução.</p>
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado da divisão {@code a / b}
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Executa uma operação matemática com base no operador informado.
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *   <li><b>"+"</b>: soma</li>
     *   <li><b>"-"</b>: subtração</li>
     *   <li><b>"*"</b>: multiplicação</li>
     *   <li><b>"/"</b>: divisão</li>
     * </ul>
     *
     * <p>Se o operador informado for inválido, o método lança uma exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação escolhida
     * @throws IllegalArgumentException se o operador não corresponder a um símbolo válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
