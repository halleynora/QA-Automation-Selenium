package unittests;

import ch.qos.logback.classic.Logger;
import org.junit.Test;
import org.junit.Ignore;
import org.slf4j.LoggerFactory;
import qa.seleniumdriver.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class TestGoogle {
    private static final Logger log = (Logger) LoggerFactory.getLogger(TestGoogle.class);

    @Test
    public void testGoogle() {
        log.info("Inside testGoogle()");
        BrowserDriver.loadPage("");
    }
}
