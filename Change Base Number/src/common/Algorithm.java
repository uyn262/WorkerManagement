/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package common;

/**
 *
 * @author Admin
 */
public class Algorithm {

    public String convertBase(String inputValue, int inputBaseChoice, int outputBaseChoice) {
        int inputBase = getInputBase(inputBaseChoice);
        int outputBase = getInputBase(outputBaseChoice);

        int decimalValue;
        if (inputBase == 16) {

            if (inputValue.startsWith("0x") || inputValue.startsWith("0X")) {
                inputValue = inputValue.substring(2);
            }
            decimalValue = Integer.parseInt(inputValue, inputBase);
        } else {
            decimalValue = Integer.parseInt(inputValue, inputBase);
        }

        String outputValue = Integer.toString(decimalValue, outputBase);

        if (outputBase == 16) {
            outputValue = outputValue.toUpperCase();
        }

        return outputValue;
    }

    public static int getInputBase(int baseChoice) {
        switch (baseChoice) {
            case 1:
                return 2;
            case 2:
                return 10;
            case 3:
                return 16;
            default:
                throw new IllegalArgumentException("Invalid base choice.");
        }
    }
}
