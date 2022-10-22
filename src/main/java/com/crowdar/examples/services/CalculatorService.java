package com.crowdar.examples.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;
import org.testng.Assert;


public class CalculatorService {

    private CalculatorService() {
    }


    public static void inputNumbers(String valor) throws InterruptedException {
        digitarNumber(valor);
    }

    private static void digitarNumber(String cifra) throws InterruptedException {
        String[] strArreglo = cifra.split("");

        for (String digito : strArreglo) {
            Thread.sleep(200);
            if (digito.equals(",")) {
                ActionManager.click(CalculatorConstants.COMA);
            } else {
                String name = String.format("name:%s", digito);
                ActionManager.click(name);
            }
        }
    }

    public static void clicBtnOperation(String operacion) {
        String name = String.format("name:%s", operacion);
        ActionManager.click(name);
    }

    public static String getResult() {
        ActionManager.click(CalculatorConstants.IGUAL_BTN);
        return ActionManager.getAttribute(CalculatorConstants.DISPLAY_RESULTADO, "Name");
        //return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS2).replaceAll("\\D+", "").trim();
    }

    public static void verifyResult(String resultado) {
        Assert.assertEquals(getResult(), resultado, "el resultado no coincide");
    }


}
