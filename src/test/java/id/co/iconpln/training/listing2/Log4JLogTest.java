package id.co.iconpln.training.listing2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krissadewo
 * @date 12/19/20 10:18 AM
 */
class Log4JLogTest {

    @Test
    void showLog() {
        Log4JLog log = new Log4JLog();
        log.showLog();
    }
}