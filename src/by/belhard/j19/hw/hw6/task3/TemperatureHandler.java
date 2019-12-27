package by.belhard.j19.hw.hw6.task3;

import java.util.ArrayList;
import java.util.List;

public class TemperatureHandler {

    private final double startTemp;
    private final double delta;
    private final int count;

    public TemperatureHandler(double startTemp, double delta, int count) {

        this.startTemp = startTemp;
        this.delta = delta;
        this.count = count;
    }

    public List<Double> compute() {

        List<Double> result = new ArrayList<>();

        result.add(startTemp);
        double currentTemp = startTemp;

        for (int i = 1; i < count; i++) {
            currentTemp +=
                    Math.random() * delta * (Math.random() < 0.5 ? -1 : 1);
            result.add(currentTemp);
        }

        return result;
    }
}
