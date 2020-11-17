package Chapter_07_Arrays;


public class P144_TimesTable {

    //main driver
    public static void main(String[] args) {

        int[][] data; //declaration

        data = timesTable(4,6); //initialisation

        for (int row = 0; row < data.length ; row++)
        {
            for (int column = 0; column < data[row].length; column++)
            {
                System.out.printf("%2d ",data[row][column]);
            }
            System.out.println();

        }
    }

    //method
    public static int[][] timesTable(int r, int c)
    {
        int [][] arr = new int[r][c];
        for (int row = 0; row < arr.length ; row++)
        {
            for (int column = 0; column < arr[row].length; column++)
            {
                arr[row][column] = (row+1)*(column+1);
            }

        }
        return arr;
    }

}