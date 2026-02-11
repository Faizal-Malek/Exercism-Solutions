public class Lasagna {
    
    public int expectedMinutesInOven(){
           int expectedMinutes =40;
            return expectedMinutes;
        }
    
    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes ;
    }

    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutes ){
        return preparationTimeInMinutes(layers)+ minutes;
    }
}
