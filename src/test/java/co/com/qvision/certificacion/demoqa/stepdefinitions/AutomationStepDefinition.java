package co.com.qvision.certificacion.demoqa.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AutomationStepDefinition {


    @Managed
    WebDriver driver;

    @Before
    public void sepUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("name_actor").can(BrowseTheWeb.with(driver));
    }

    @Dado("que el usuario ingresa a la pagina Demo")
    public void queElUsuarioIngresaALaPaginaDemo() {
        theActorInTheSpotlight().attemptsTo(Open.url("http://www.google.com"));

    }
    @Cuando("Llenar el formulario vacio")
    public void llenarElFormularioVacio() {

    }

    @Entonces("Los valores deben ser")
    public void losValoresDebenSer() {

    }

}
