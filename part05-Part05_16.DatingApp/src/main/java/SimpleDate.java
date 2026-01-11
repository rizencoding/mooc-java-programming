
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        if(this.day < 30){
            this.day++;
        }else{
            this.day = 1;
            this.month++;
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays){
        if(this.day + howManyDays > 30){
            this.day = (this.day + howManyDays) - 30;
            this.month++;
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }else if (this.day == 30){
            this.month++;
            if(this.month > 12){
                this.month = 1;
                this.year++;
            }
        }else{
            this.day+= howManyDays;
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day, month, year);
        if(newDate.day + days > 30){
            int newDay = (newDate.day + days) - 30;
            newDate.day = newDay;
            newDate.month++;
            if(newDate.month > 12){
                newDate.month = 1;
                newDate.year++;
            }
        }else if(newDate.day == 30){
            newDate.month++;
            if(newDate.month > 12){
                newDate.month = 1;
                newDate.year++;
            }
        }else{
            newDate.day += days;
        }
        return newDate;
    }

}
