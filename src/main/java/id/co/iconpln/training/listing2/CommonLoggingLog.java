package id.co.iconpln.training.listing2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * @author krissadewo
 * @date 12/19/20 10:30 AM
 */
public class CommonLoggingLog {

    private static final Log log = LogFactory.getLog(CommonLoggingLog.class);

    public void showLog() {
        log.debug("Example debug message ..");
        log.info("Example info message ..");
        log.warn("Example warn message ..");
        log.error("Example error message ..");
        log.fatal("Example fatal message ..");
    }
}
