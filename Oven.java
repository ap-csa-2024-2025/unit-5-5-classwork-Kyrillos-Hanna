public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public void turnOff() {
        currentTemp = 0;
    }

    public boolean isOn() {
        return (currentTemp > 0);
    }

    public void preheat(int temp) {
        if (temp > maxTemp) {
            currentTemp = maxTemp;
        } else if (temp > 0 && temp <= maxTemp) {
            currentTemp = temp;
        }
    }

    public void setMaxTemp(int temp) {
        if (temp > 500 || temp < 0) {
            maxTemp = 500;
        } else {
            maxTemp = temp;
        }
    }

    public String toString() {
        return "New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp + ".";
    }
}
