import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // COPY OF ARRAY WITH      System.arraycopy();
/////////////////// EXAMPLE  WHERE WE ELIMINATE THE ELEMENT FROM THE MIDDLE OF AN ARRAY //////////////////
        int[] arraySource = {1,2,3,4,5,6,7};
        int[] arrayDestination = {0,0,0,0,0,0};

        System.out.println("arraySource " + Arrays.toString(arraySource));
        System.out.println("arrayDestination " + Arrays.toString(arrayDestination));

        System.out.println("===========================================");

        System.arraycopy(arraySource, 0,arrayDestination,0,3);
        System.arraycopy(arraySource, 4,arrayDestination,3,3);

        System.out.println("Array Destination after changes");
        System.out.println("Array Destination " + Arrays.toString(arrayDestination));
        
        // C0
        
        // C2
        // CC


        // NEW COMMENT
        // NEW COMMENT
        // NEW COMMENT

        /////////////////////////////////////////// START BASE EXAMPLE ////////////////////////////////////

//        int[] arraySource = {1,2,3,4,5,6};
//        int[] arrayDestination = {0,0,0,0,0,0,0,0};
//
//        System.out.println("arraySource " + Arrays.toString(arraySource));
//        System.out.println("arrayDestination " + Arrays.toString(arrayDestination));
//
//        System.out.println("===========================================");
//
//        System.arraycopy(arraySource, 2,arrayDestination,2,2);
//
//        System.out.println("Array Destination after changes");
//        System.out.println("Array Destination " + Arrays.toString(arrayDestination));
        /////////////////////////////////////////// END BASE EXAMPLE ////////////////////////////////////

    }
}
