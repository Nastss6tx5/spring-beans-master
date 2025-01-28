package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {
    private Long millisTime = System.currentTimeMillis();

    public Long getTime() {
        return millisTime;
    }
}
