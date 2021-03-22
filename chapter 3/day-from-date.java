
#finding day of the week based on date
public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfTheMonth = input.nextInt();
        if (month == 1 || month == 2) {
        	month = month + 12;
        	--year;
        }
        int century = year / 100;
        int yearOfTheCentury = year % 100;
        String dayOfTheWeek = "";
        switch ((dayOfTheMonth + 26*(month+1)/10 + yearOfTheCentury + (yearOfTheCentury / 4) + (century / 4) + 5*century) % 7 ) {
            case 0: dayOfTheWeek = "Saturday"; break;
            case 1: dayOfTheWeek = "Sunday"; break;
            case 2: dayOfTheWeek = "Monday"; break;
            case 3: dayOfTheWeek = "Tuesday"; break;
            case 4: dayOfTheWeek = "Wednesday"; break;
            case 5: dayOfTheWeek = "Thursday"; break;
            case 6: dayOfTheWeek = "Friday";
        }
        System.out.print("Day of the week is " + dayOfTheWeek);

    }

