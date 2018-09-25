public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume() {
        return volume;
    }

    public int takeSip(){
        this.volume -= 10;
        return this.volume;
    }

    public int emptyBottle(){
        this.volume = 0;
        return this.volume;
    }

    public int fillBottle(){
        this.volume = 100;
        return this.volume;
    }
}
