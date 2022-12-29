package inicio.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ReniecTitulo {
    public static Question<String> tituloDePagina() {
        return actor -> TextContent.of(ReniecBy.PAGE_TITLE).
               answeredBy(actor).toString().replace("/n","").trim();
    }
}
