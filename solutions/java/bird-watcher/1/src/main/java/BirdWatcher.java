
class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] LAST_WEEK_BIRD_DATA = {0, 2, 5, 3, 7, 8, 4};
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
            return LAST_WEEK_BIRD_DATA;
    }

    public int getToday() {
     if(birdsPerDay.length ==0){
        return 0;
     }
    return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int lastIndex = birdsPerDay.length - 1;

        birdsPerDay[lastIndex]++;
        
    }

    public boolean hasDayWithoutBirds() {

        boolean flag = false;
        
        for (int b: birdsPerDay) {
            if (b == 0) {
                flag = true;
            }
        }

        return flag;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;

        int limit = Math.min(numberOfDays, birdsPerDay.length);
        
        for (int i = 0; i < limit; i++) {
            count += birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int count = 0;

        for (int b: birdsPerDay) {
            if (b >= 5) {
                count++;
            }
        }

        return count;
    }
}
