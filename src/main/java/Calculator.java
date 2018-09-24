public class Calculator {
    private int startValue;
    private int newValue;

    public Calculator(int startValue, int newValue){
        this.startValue = startValue;
        this.newValue = newValue;
    }

    public int add(int startValue, int newValue){
        this.startValue += this.newValue;
        return this.startValue;
    }

    public int subtract(int startValue, int newValue){
        this.startValue -= this.newValue;
        return this.startValue;
    }

    public int multiply(int startValue, int newValue){
        this.startValue *= this.newValue;
        return this.startValue;
    }

    public int divide(float startValue, float newValue){
        this.startValue /= this.newValue;
        return this.startValue;
    }

}
