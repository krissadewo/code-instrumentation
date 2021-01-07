package id.co.iconpln.training.listing3;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.filter.ThresholdFilter;
import net.logstash.logback.appender.LogstashTcpSocketAppender;
import net.logstash.logback.encoder.LogstashEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static net.logstash.logback.argument.StructuredArguments.v;

/**
 * @author krissadewo
 * @date 12/19/20 2:22 PM
 */
public class CustomLogstashLogback {

    static Logger logger = LoggerFactory.getLogger(CustomLogstashLogback.class);

    /*static {
        String url = "localhost:5044";

        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();

        LogstashTcpSocketAppender logstashTcpSocketAppender = new LogstashTcpSocketAppender();
        logstashTcpSocketAppender.setName("LOGSTASH");
        logstashTcpSocketAppender.setContext(loggerContext);
        logstashTcpSocketAppender.addDestination(url);

        LogstashEncoder encoder = new LogstashEncoder();
        encoder.setContext(loggerContext);
        encoder.setIncludeContext(false);
        encoder.setIncludeCallerData(false);
        encoder.start();

        ThresholdFilter filterInfo = new ThresholdFilter();
        filterInfo.setLevel(Level.INFO.levelStr);
        filterInfo.setContext(loggerContext);
        filterInfo.start();

        logstashTcpSocketAppender.addFilter(filterInfo);
        logstashTcpSocketAppender.setEncoder(encoder);
        logstashTcpSocketAppender.start();

        loggerContext.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).setLevel(Level.INFO);
        loggerContext.getLogger(ch.qos.logback.classic.Logger.ROOT_LOGGER_NAME).addAppender(logstashTcpSocketAppender);

        logger = loggerContext.getLogger(CustomLogstashLogback.class);
    }*/

    public void showLog() {
        List<ProductLogSchema> productLogSchemas = new ArrayList<>();
        productLogSchemas.add(new ProductLogSchema(Category.SELL.name(), Product.SHIRT.name(), 10));
        productLogSchemas.add(new ProductLogSchema(Category.RETURN.name(), Product.TSHIRT.name(), 11));
        productLogSchemas.add(new ProductLogSchema(Category.SELL.name(), Product.TSHIRT.name(), 12));
        productLogSchemas.add(new ProductLogSchema(Category.SELL.name(), Product.JACKET.name(), 8));
        productLogSchemas.add(new ProductLogSchema(Category.RETURN.name(), Product.JACKET.name(), 2));
        productLogSchemas.add(new ProductLogSchema(Category.SELL.name(), Product.SHOES.name(), 7));

        productLogSchemas.forEach(productLogSchema -> {
            logger.info("{}{}{}",
                    v("product.transaction.category", productLogSchema.getTransactionCategory()),
                    v("product.name", productLogSchema.getProductName()),
                    v("product.qty", productLogSchema.getQty()));
        });

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    enum Category {
        SELL, RETURN
    }

    enum Product {
        TSHIRT, JACKET, SHIRT, SHOES
    }
}

