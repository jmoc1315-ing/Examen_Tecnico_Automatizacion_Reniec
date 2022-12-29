package inicio.stepdefinitions;

import inicio.navegacion.ReniecPerformable;
import inicio.question.ReniecTitulo;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.withCurrentActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class ReniecStepDefinitions {

   @Before
     public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) esta en la web de la reniec")
    public void usuarioEstaEnLaWebDeLaReniec(String actor) {
        theActorCalled(actor).attemptsTo(
                ReniecPerformable.openWebReniec()
        );
    }

    @When("Hace click en el link {string}")
    public void usuarioHaceClickPeruanosEEE(String term) {
        withCurrentActor(
                ReniecPerformable.clickLink(term)
        );
    }

    @And("Despliega la opcion {string}")
    public void despliegaLaOpcion(String term) {
        withCurrentActor(
                ReniecPerformable.clickDesplegableConsuladosEnElMundo(term)
        );
    }

    @And("Se redirecciona al link {string}")
    public void seRedireccionaAlLink(String term) {
        withCurrentActor(
                ReniecPerformable.clickLink(term)
        );

    }

    @And("Hace la busqueda con la palabra {string}")
    public void resultadosDeLaBusquedaDeLaPalabra(String term) {
        withCurrentActor(
                ReniecPerformable.clickBuscarConsulados(term)
        );
    }

    @And("Regresa a la pestania de la Reniec")
    public void regresaALaPestaniaDeLaReniec() {
        withCurrentActor(
                ReniecPerformable.cambiaPestania()
        );
    }

    @Then("Revisa el titulo de la primera pestania {string}")
    public void revisa_el_titulo_de_la_otra_pagina(String term){
        theActorInTheSpotlight().should(
                seeThat("", ReniecTitulo.tituloDePagina(),equalTo(term))
        );

    }
}
