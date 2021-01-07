package id.co.iconpln.training.listing2;

import org.apache.log4j.Logger;

/**
 * @author krissadewo
 * @date 12/19/20 10:06 AM
 */
public class Log4JLog {

    Logger logger = Logger.getLogger(Log4JLog.class);

    public void showLog() {
        logger.info("an info msg");
        logger.warn("a warning msg");
        logger.error("a error msg");
    }
}
