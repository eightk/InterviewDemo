/**
 *
 *
 */
package interview.Nuance;

import java.util.Enumeration;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author huico
 */
public final class LoggingUtils {

    private LoggingUtils() {
    }

    public static void initializeLogger() {
        initializeLogger(LoggingSetting.getDefault());
    }

    public static void initializeLogger(String logFileName) {
        LoggingSetting setting = LoggingSetting.getDefault();
        setting.setFileName(logFileName);
        initializeLogger(setting);
    }

    public static void initializeLogger(LoggingSetting setting) {
        //Turn Apache Common Logging
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
        String pattern = "%d{ISO8601} [%c] %p - %m%n";

        if (setting != null) {
            pattern = setting.getPattern();
        }

        Logger.getRootLogger().removeAllAppenders();

        //setup console appender
        ConsoleAppender consoleAppender = new ConsoleAppender(new PatternLayout(pattern));
        Logger.getRootLogger().addAppender(consoleAppender);

        //setup rolling file appender
        RollingFileAppender fileAppender = new RollingFileAppender();

        fileAppender.setMaxFileSize(setting.getMaxFileSize() + "MB");
        fileAppender.setLayout(new PatternLayout(pattern));
        fileAppender.setFile(setting.getFileName());
        fileAppender.activateOptions();
        Logger.getRootLogger().addAppender(fileAppender);

        //set default logging level
        setLoggingLevel(setting.getLoggingLevel());

        //set the logging pattern on all appenders
        Enumeration appenders = Logger.getRootLogger().getAllAppenders();
        while (appenders.hasMoreElements()) {
            Appender a = (Appender) appenders.nextElement();
            a.setLayout(new PatternLayout(pattern));
        }
    }

    public static final Level getLoggingLevel() {
        return Logger.getRootLogger().getLevel();
    }

    public static final void setLoggingLevel(Level level) {
        Logger.getRootLogger().setLevel(level);
    }

    /* Log at Fatal Level*/
    public static final void logFatal(Object o, String message) {
        logFatal(o, message, null);
    }

    public static final void logFatal(Object o, Throwable throwable) {
        logFatal(o, null, throwable);
    }

    public static final void logFatal(Object o, String message, Throwable throwable) {
        log(Level.FATAL, o, message, throwable);
    }

    /* Log at the Error level */
    public static final void logError(Object o, String message) {
        logError(o, message, null);
    }

    public static final void logError(Object o, Throwable throwable) {
        logError(o, null, throwable);
    }

    public static final void logError(Object o, String message, Throwable throwable) {
        log(Level.ERROR, o, message, throwable);
    }

    /* Log at the Warn level */
    public static final void logWarn(Object o, String message) {
        logWarn(o, message, null);
    }

    public static final void logWarn(Object o, Throwable throwable) {
        logWarn(o, null, throwable);
    }

    public static final void logWarn(Object o, String message, Throwable throwable) {
        log(Level.WARN, o, message, throwable);
    }

    /* Log at the Info level */
    public static final void logInfo(Object o, String message) {
        logInfo(o, message, null);
    }

    public static final void logInfo(Object o, Throwable throwable) {
        logInfo(o, null, throwable);
    }

    public static final void logInfo(Object o, String message, Throwable throwable) {
        log(Level.INFO, o, message, throwable);
    }

    /* Log at the Debug level */
    public static final void logDebug(Object o, String message) {
        logDebug(o, message, null);
    }

    public static final void logDebug(Object o, Throwable throwable) {
        logDebug(o, null, throwable);
    }

    public static final void logDebug(Object o, String message, Throwable throwable) {
        log(Level.DEBUG, o, message, throwable);
    }

    /* Log at the Trace level */
    public static final void logTrace(Object o, String message) {
        logTrace(o, message, null);
    }

    public static final void logTrace(Object o, Throwable throwable) {
        logTrace(o, null, throwable);
    }

    public static final void logTrace(Object o, String message, Throwable throwable) {
        log(Level.TRACE, o, message, throwable);
    }

    /* All customize log */
    private static void log(Level level, Object o, Object message, Throwable throwable) {
        //If the logger has already been created, log4j will return the cached one 
        //otherwise it will create a new logger, so we do not need to do any caching of the loggers in this class.
        Logger logger = Logger.getLogger(o instanceof Class ? (Class) o : o.getClass());

        //message and throwable are both nullable accroding to the source code
        if (message != null) {
            logger.log(level, message, throwable);
        } else {
            logger.log(level, throwable);
        }
    }
}
