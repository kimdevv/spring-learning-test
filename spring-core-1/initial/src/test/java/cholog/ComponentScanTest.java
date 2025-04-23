package cholog;

import test.TestComponentScanBean;
import test.TestContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;

import static cholog.utils.ContextUtils.getApplicationContext;
import static org.assertj.core.api.Assertions.assertThat;

public class ComponentScanTest {

    @Test
    void scanComponent() {
        ApplicationContext context = getApplicationContext(TestContextConfiguration.class);
        TestComponentScanBean testComponentScanBean = context.getBean("testComponentScanBean", TestComponentScanBean.class);
        assertThat(testComponentScanBean).isNotNull();
    }
}
