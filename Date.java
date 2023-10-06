
    public class Date {
        private int month ;
        private int year;
        private int day;
        Date(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }
        public void setDay(int day){
            this.day = day;
        }
        public void setMonth(int month){
            this.month = month;
        }
        public void setYear(int year){
            this.year = year;
        }
        public int getDay(){
            return day;
        }
        public int getMonth(){
            return month;
        }
        public int getYear(){
            return year;
        }

        @Override
        public String toString() {
            String datemodifier = String.format("%d/%d/%d",day,month,year);
            return datemodifier;
        }
        public Date isrecent(Date d1, Date d2){

            return d1.getMonth()<d2.getMonth()?d2:d1;
        }
    }


