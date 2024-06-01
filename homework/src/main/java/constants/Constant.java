package constants;

import java.time.Duration;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 30;
        public static final Duration EXPLICIT_WAIT = Duration.ofMillis(500L);
    }

    public static class Urls {
        public static final String MTS_HOME_PAGE = "https://www.mts.by/";
    }
}
