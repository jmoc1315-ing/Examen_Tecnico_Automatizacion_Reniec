package inicio.navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

import org.openqa.selenium.By;

public class ReniecPerformable {

    public static Performable openWebReniec(){
        return Task.where("{0} Entrando a la web de reniec",
                Open.browserOn().the(ReniecURL.class)
        );
    }

    public static Performable clickLink(String term){
        return Task.where("Hace click en el link {string}",
                Click.on(By.xpath("//a[@href='"+term+"']"))
        );
    }

    public static Performable clickDesplegableConsuladosEnElMundo(String term){
        return Task.where("Hace click en la lista desplegable {string}",
                Click.on(By.linkText("CONSULADOS EN EL MUNDO"))
        );
    }

    public static Performable clickBuscarConsulados(String term) {
        return Task.where("{0} attempts to search for #term",
                CambiarPestania.cambiarPestania(),
                Enter.theValue(term).into(By.id("txtSearch")),
                Click.on(By.className("imgSearchLupa"))
        ).with("term").of(term);
    }

    public static Performable cambiaPestania() {
        return Task.where("Regresa a la pestaña de la Reniec",
                CambiarPestania.cambiarPestania()
        );
    }

}