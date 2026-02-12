class Array {
    public static void main(String[] args) {

    /********************************** First Way ************************************/
        // First Way
        int[] myArray = new int[5];

        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;

        //Accessing array elements
        System.out.println("myArray: " + myArray[0]);


        /********************************** Second Way *****************************/
        // Direct initialize
        int[] mySecondArray = {10, 12, 21, 33};

        for(int i=0; i<mySecondArray.length; i++) {
            System.out.print(mySecondArray[i] + " ");
        }
    }
}

