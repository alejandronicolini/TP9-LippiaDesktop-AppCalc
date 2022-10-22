package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {


    @When("ingresa un valor {string}")
    public void ingresaUnValor(String valor) throws InterruptedException {
        CalculatorService.inputNumbers(valor);
    }

    @And("clic en la el boton de la operacion: {string}")
    public void setOperacion(String operacion) {
        CalculatorService.clicBtnOperation(operacion);
    }

    @Then("el resultado es: {string}")
    public void elResultadoEs(String resultado) {
        CalculatorService.verifyResult(resultado);
    }


}