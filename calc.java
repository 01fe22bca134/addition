/**
 * The calculator class performs basic arithmetic operations such as addition,
 * subtraction, multiplication, and division on two operands.
 */
class calc extends child {

    float addition(float operand_1, float operand_2) {
        return (operand_1 + operand_2);
    }

    float subtraction(float operand_1, float operand_2) {
        return (operand_1 - operand_2);
    }

    float multiplication(float operand_1, float operand_2) {
        return (operand_1 * operand_2);
    }

    float division(float operand_1, float operand_2) {
        return (operand_1 / operand_2);
    }

    float square(float operand_1) {
        return (operand_1 * operand_1);
    }

    float cube(float operand_1) {
        return (operand_1 * operand_1 * operand_1);
    }

    float mod(float operand_1, float operand_2) {
        return (operand_1 % operand_2);
    }

    public static void main(String[] args) {
        calc calc = new calc();
        float operand_1 = 10;
        float operand_2 = 5;

        float add_result = calc.addition(operand_1, operand_2);
        System.out.println("Addition result is: " + add_result);

        float sub_result = calc.subtraction(operand_1, operand_2);
        System.out.println("Subtraction result is: " + sub_result);

        float mult_result = calc.multiplication(operand_1, operand_2);
        System.out.println("Multiplication result is: " + mult_result);

        float div_result = calc.division(operand_1, operand_2);
        System.out.println("Division result is: " + div_result);

        float squ_result = calc.square(operand_1);
        System.out.println("Square result is: " + squ_result);

        float cub_result = calc.cube(operand_1);
        System.out.println("Cube result is: " + cub_result);

        float mod_result = calc.mod(operand_1, operand_2);
        System.out.println("Modulus result is: " + mod_result);
    }
}
