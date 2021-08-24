package duke;

import java.time.LocalDate;

public class Event extends Task {
    private LocalDate date;
    private String dateString;
    private Integer year;
    private Integer month;
    private Integer day;
    public Event(String name, String date) {
        super(name);
        this.date = LocalDate.parse(date);
        year=this.date.getYear();
        month=this.date.getMonthValue();
        day=this.date.getDayOfMonth();

        String monthString;
        if(month==1){
            monthString = "January";
        }else if(month==2){
            monthString = "Feburary";
        }else if(month==3) {
            monthString = "March";
        }else if(month==4) {
            monthString = "April";
        }else if(month==5) {
            monthString = "May";
        }else if(month==6) {
            monthString = "June";
        }else if(month==7) {
            monthString = "July";
        }else if(month==8) {
            monthString = "August";
        }else if(month==9) {
            monthString = "September";
        }else if(month==10) {
            monthString = "October";
        }else if(month==11) {
            monthString = "November";
        }else if(month==12) {
            monthString = "December";
        }else{
            throw (new IllegalArgumentException("uh oh stinky"));
        }
        dateString = day.toString() + " " + monthString + " " + year.toString();
    }
    @Override
    public String toString(){
        if(done == true){
            return "[E][X] " + name +  " (at: " + dateString + ")";
        }else{
            return "[E][ ] " + name + " (at: " + dateString + ")";
        }
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Event)){
            return false;
        }else{
            Event objTask = (Event) obj;
            if(objTask.name.equals(this.name) && objTask.date.equals(this.date)){
                return true;
            }else{
                return false;
            }
        }
    }
}