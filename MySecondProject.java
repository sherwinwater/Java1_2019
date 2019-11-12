public class MySecondProject {
    public static final double HST_RATE = .13;
    public static void main(String[] args){
        String roomName = "M5";
        double length = 24.0;
        double width = 18.6;
        int numTables = 15;
        int numChairs = 60;
        boolean hasProjector = true;
        int numBoards = 7;
        double roomArea = length * width;
//Exercise 1: Print - Room M5 has a sqft of 446.40000000000003
System.out.println("Room " + roomName + " has a sqft of " + roomArea);

// Exercise 2: Print - Room M5 has length 24.0 and width 18.6.
// Total Tables: 15, Total Chairs: 60. This room has
// 7 boards.
System.out.println("Room " + roomName + " has length " + length + " and width " + width + ".");
System.out.println("Total Tables: " + numTables + ", Total Chairs: " + numChairs + "." + " This room has");
System.out.println(numBoards + " boards.");

//exercise 2 : one line:
System.out.println("Room " + roomName + " has length " + length + " and width " + width + "." + " Total Tables: " + numTables +
        ", Total Chairs: " + numChairs + "." + " This room has " + numBoards + " boards.");

    }
}
