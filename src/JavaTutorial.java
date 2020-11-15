public class JavaTutorial {

    public static void main (String[] args) {

 /*    String[] names = {"Sunil", "Shravya", "Dhruva"};

     for (String name: names)
     {
         System.out.println(name);

     }
     System.out.println(names.length);

     String[] []values = new String[2][3];
     values [0][1] = "Hello there, you!";

     System.out.println(values[0][1]);*/

     int[][] order = {
             {1,2,3},
             {4,5},
             {6,7,8,9}

     };


     System.out.println(order.length);

     for (int row =0 ; row < order.length; row ++)
     {
         for (int col=0; col < order[row].length; col++)
         {
             System.out.print(order[row][col] + "\t");
         }
         System.out.println();
     }

    }
}
