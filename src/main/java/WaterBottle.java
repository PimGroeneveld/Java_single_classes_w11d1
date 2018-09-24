public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int takeSip(){
        this.volume -= 10;
        return volume;
    }

    public int emptyBottle(){
        this.volume = 0;
        return volume;
    }

    public int fillBottle(){
        this.volume = 100;
        return volume;
    }
}
