import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CarteTest.class, ConfigurationTest.class, JoueurTest.class, PileCartesTest.class })
public class AllTests {

}
