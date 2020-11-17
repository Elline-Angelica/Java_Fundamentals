package Chapter_07_Arrays;

public class P144_2Dimensional {

    public static void main(String[] args) {

        int [] row = new int[] {0,1,2,3,4,5};
        int [] raw = new int[] {1,1,2,3,4,5};
        int [] rew = new int[] {2,2,4,6,8,10};
        int [] ruw = new int[] {3,3,6,9,12,15};

        for(int temp : row) {
            System.out.print(temp+ " ");
        }

        System.out.println();

        for(int temp : raw) {
            System.out.print(temp+ " ");
        }

        System.out.println();

        for(int temp : rew) {
            System.out.print(temp+ " ");
        }

        System.out.println();

        for(int temp : ruw) {
            System.out.print(temp+ " ");
        }


        //I don't know if this is the right way to do it...



    }
}

        /* third try = fail
        int [][] multi = new int [][] {{0,1,2,3,4,5},{1,1,2,3,4,5},{2,2,4,6,8,10},{3,3,6,9,12,15}};
        for (int i = 0; i < multi.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < multi[i].length; j++)
                System.out.print(multi[i][j] + " ");
        */

        /* second try = not complete
        int [] column = new int[]{0,1,2,3,4,5};
        int [] row = new int[]{1,2,3};

        for(int te : column){
            System.out.print(te + " ");
        }

        System.out.println();

        for(int mp : row){
            System.out.println(mp);
        }
         */

        /*first try = wrong
        nums [0][0] = 0*0;
        nums [0][1] = 0*1;
        nums [0][2] = 0*2;
        nums [0][3] = 0*3;
        nums [0][4] = 0*4;
        nums [0][5] = 0*5;
        nums [1][0] = 0*0;
        nums [1][1] = 1*1;
        nums [1][2] = 1*2;
        nums [1][3] = 1*4;
        nums [1][5] = 1*5;
        nums [2][0] = 2*0;
        nums [2][1] = 2*1;
        nums [2][2] = 2*2;
        nums [2][3] = 2*3;
        nums [2][4] = 2*4;
        nums [2][5] = 2*5;
        */