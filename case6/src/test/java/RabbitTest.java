import computeService.HelloApplication;
import computeService.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(HelloApplication.class)
public class RabbitTest {
    @Autowired
    private Sender sender;

    @Test
    public void TestRabbit(){
        System.out.print("*****");
        sender.send();
    }
}
