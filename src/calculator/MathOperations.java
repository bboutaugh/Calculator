/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author bradb
 */

import static java.lang.Math.pow;
import java.math.*;

public class MathOperations 
{
    double number1 = 0;
    double number2 = 0;
    double result = 0;
    
    public double add(double number1,double number2)
    {
        result = number1 + number2;
        return result;
    }
    
    public double subtract(double number1, double number2)
    {
        result = number1 - number2;
        return result;
    }
    
    public double multiply(double number1, double number2)
    {
        result = number1 * number2;
        return result;
    }
    
    public double divide(double number1, double number2)
    {
        result = number1/number2;
        return result;
    }
    
    public double square(double number1)
    {
        result = number1 *= number1;
        return result;
    }
    
    public double squareRoot(double number1)
    {
        result = pow(number1,0.5);
        return result;
    }
}
