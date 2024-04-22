import java.util.Scanner;

// Interface Strategy
interface Operation { double execute(double num1, double num2); }

// Implementações concretas do Strategy
class AddOperation implements Operation {
    
    @Override
    public double execute(double num1, double num2) { return num1 + num2; }
    
}

class SubtractOperation implements Operation {
    
    @Override
    public double execute(double num1, double num2) { return num1 - num2; }
    
}

class MultiplyOperation implements Operation {
    
    @Override
    public double execute(double num1, double num2) { return num1 * num2; }
    
}

class DivideOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 != 0) { return num1 / num2; } 
        else {
            System.out.println("Erro: Divisão por zero!"); // <<
            return Double.NaN;
        }
    }
}

// Contexto que utiliza a estratégia
class Calculator {
    
    private Operation operation;

    public void setOperation(Operation operation) { this.operation = operation; }

    public double performOperation(double num1, double num2) { return operation.execute(num1, num2); }
    
}

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Criando instâncias das operações
        Operation addOperation = new AddOperation(); // <<
        Operation subtractOperation = new SubtractOperation();
        Operation multiplyOperation = new MultiplyOperation();
        Operation divideOperation = new DivideOperation();

        // Criando a calculadora
        Calculator calculator = new Calculator();

        // Obtendo os números do usuário
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Obtendo a operação desejada
        String operationChoice = scanner.next(); // <<

        // Configurando a operação na calculadora
        switch (operationChoice) { // <<
            case "+":
                calculator.setOperation(addOperation);
                break;
            case "-":
                calculator.setOperation(subtractOperation);
                break;
            case "*":
                calculator.setOperation(multiplyOperation);
                break;
            case "/":
                calculator.setOperation(divideOperation);
                break;
            default:
                System.out.println("Operação inválida."); // <<
                return;
        }

        // Realizando a operação e exibindo o resultado
        double result = calculator.performOperation(num1, num2); // <<
        System.out.println(result);
    }
}

// ALTERNATIVE
import java.io.*;
import static java.lang.System.*;
import static java.lang.Double.parseDouble;

interface Operation { double execute(double num1, double num2); }

class AddOperation implements Operation {
    @Override
    public double execute(double num1, double num2) { return num1 + num2; }
}
class SubtractOperation implements Operation {
    @Override
    public double execute(double num1, double num2) { return num1 - num2; }
}
class MultiplyOperation implements Operation {
    @Override
    public double execute(double num1, double num2) { return num1 * num2; }
}
class DivideOperation implements Operation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 != 0) return num1 / num2;
        new PrintWriter(out).append("Divisão inválida.").flush();
        return 0;
    }
}

class Calculator {
    private Operation operation;
    public void setOperation(Operation operation) { this.operation = operation; }
    public double performOperation(double num1, double num2) { return operation.execute(num1, num2); }
}

public class Main {
    public static void main(String[] args) throws IOException{
        var topic = new BufferedReader(new InputStreamReader(in));

        Calculator calculator = new Calculator();

        double num1 = parseDouble(topic.readLine());
        double num2 = parseDouble(topic.readLine());

        String operationChoice = topic.readLine();

        switch (operationChoice) { // <<
            case "+":
                Opieration addOperation = new AddOperation();
                calculator.setOperation(addOperation);
                break;
            case "-":
                Operation subtractOperation = new SubtractOperation();
                calculator.setOperation(subtractOperation);
                break;
            case "*":
                Operation multiplyOperation = new MultiplyOperation();
                calculator.setOperation(multiplyOperation);
                break;
            case "/":
                Operation divideOperation = new DivideOperation();
                calculator.setOperation(divideOperation);
                break;
            default:
                new PrintWriter(out).append("Operação inválida.").flush();
                return;
        }

        String result = calculator.performOperation(num1, num2)+ ""; // <<
        new PrintWriter(out).append(result).flush();
    }
}
// Fullspeed
import java.io.*;
import static java.lang.System.*;
import static java.lang.Double.parseDouble;
public class Main {
    public static void main(String[] args) throws IOException{
        var x=new BufferedReader(new InputStreamReader(in));
        double n1=parseDouble(x.readLine()), n2=parseDouble(x.readLine());
        String o=x.readLine();
        new PrintWriter(out).append((o.equals("+")? n1+n2 :o.equals("-")? n1-n2 :o.equals("*")? n1*n2 :n1/n2)+"").flush();
    }
}

