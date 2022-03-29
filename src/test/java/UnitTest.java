import com.napier.sem.usecases.UseCase2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UnitTest{

    static UseCase2 useCase2;

    @BeforeAll
    static void init()
    {
        useCase2 = new UseCase2();
    }

    @Test
    void testInitialise() {

    }

    @Test
    void testUseCase2NonNull()
    {
        useCase2.printCountryPopulationReportDESC("Africa");
    }
}