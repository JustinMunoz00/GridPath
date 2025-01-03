public class Main
{
    public static void main (String[] args){
        int [][] nums = {
            {12, 3, 4, 13, 5},
            {11, 21, 2, 14, 16},
            {7, 8, 9, 15, 0},
            {10, 17, 20, 19, 1},
            {18, 22, 30, 25, 6}
        };
        GridPath one = new GridPath(nums);
        // getNextLoc method tests
        System.out.println(one.getNextLoc(0, 0));
        System.out.println(one.getNextLoc(1, 3));
        System.out.println(one.getNextLoc(2, 4));
        System.out.println(one.getNextLoc(4, 3));
        System.out.println(one.sumPath(0, 0));
        System.out.println(one);
        Location g = one.getNextLoc(0, 0);
        System.out.println(g);

        // sumPath method tests
        int [][] nums2 = {
            {12, 30, 40, 25, 5},
            {11, 3, 22, 15, 43},
            {7, 2, 9, 4, 0},
            {8, 33, 18, 6, 1},
        };
        GridPath two = new GridPath(nums2);
        System.out.println(two.sumPath(1, 1));
    }
}