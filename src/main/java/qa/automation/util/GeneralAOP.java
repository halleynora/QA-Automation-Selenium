package qa.automation.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.remote.ScreenshotException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.NoSuchElementException;

/**
 * Created by halley.short.
 * Used by Spring AOP for logging and exception handling
 */
public class GeneralAOP {
    private static final Logger log = (Logger) LoggerFactory.getLogger(GeneralAOP.class);


    public Object aroundActions(ProceedingJoinPoint joinPoint) throws Throwable {
        StringBuffer sb = new StringBuffer();
        Object result = null;
        try {
            sb.append("AOP" + joinPoint.getTarget().getClass() + "." + joinPoint.getSignature().getName() + "()");
            log.info(sb.toString());
            result = joinPoint.proceed();

        } catch (TimeoutException toe) {
            log.error(toe.getMessage());
            throw (toe);
        } catch (NoSuchElementException nsee) {
            log.error(nsee.getMessage());
            throw (nsee);
        } catch (ScreenshotException she) {
            log.error(she.getMessage());
            throw (she);
        } catch (Exception e) {

            throw (e);
        }
        return result;
    }
}