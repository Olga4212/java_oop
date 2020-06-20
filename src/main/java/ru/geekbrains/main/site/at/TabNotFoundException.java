package ru.geekbrains.main.site.at;

public class TabNotFoundException extends RuntimeException {
    public TabNotFoundException() {
        super();
    }

    public TabNotFoundException(String message) {
        super(message);
    }

    public TabNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TabNotFoundException(Throwable cause) {
        super(cause);
    }

    protected TabNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
