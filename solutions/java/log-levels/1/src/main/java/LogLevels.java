public class LogLevels {
    
    public static String message(String logLine) {
        int colIndex = logLine.indexOf(":");
        String editedMessage = logLine.substring(colIndex + 1);
        return editedMessage.trim();
    }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf("[");
        int end = logLine.indexOf("]");
        return logLine.substring(start + 1, end).toLowerCase();
    }

    public static String reformat(String logLine) {
       String msg = message(logLine);
        String level = logLevel(logLine);

        return msg + " (" + level + ")";
    }
}
