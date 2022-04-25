import com.napier.sem.usecases.UseCase1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UnitTest extends EmbeddedMySql{

    @Test
    void testInitialise() {
        UseCase1 useCase1 = new UseCase1();
        useCase1.printCountryPopulationReportDESC();
    }
}