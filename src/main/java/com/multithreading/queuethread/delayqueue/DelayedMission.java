package com.multithreading.queuethread.delayqueue;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

@Getter
@Setter
@ToString
public class DelayedMission implements Delayed {


    private String mission;
    private long duration;

    public DelayedMission(String mission, long delayInMillisecond) {
        this.mission = mission;
        this.duration = System.currentTimeMillis() + delayInMillisecond;
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(duration - System.currentTimeMillis(),TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed otherMission) {
        if (this.duration < ((DelayedMission)otherMission).getDuration()){
            return -1;
        }
        if (this.duration > ((DelayedMission) otherMission).getDuration()){
            return 1;
        }
        return 1;
    }
}
