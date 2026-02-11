public class Lasagna {
    
    // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
           int expectedMinutes =40;
            return expectedMinutes;
        }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes ;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes ){
        return (layers * 2 )+ minutes;
    }
}
