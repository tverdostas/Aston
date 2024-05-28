package common;

public class Config {
    public static final String PLATFORM_AND_BROWSER = "win_chrome";

    // Очистка куков и хранилища после каждого запуска тестов, если true - очищаются куки и хранилище
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;

    // Держим браузер открытым, если true - браузер закрывается
    public static final Boolean HOLD_BROWSER_OPEN = true;
}
