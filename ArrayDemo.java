public class ArrayDemo{
  public static void printArray(int[]ary) {
    System.out.print("[");
    for (int x = 0; x < ary.length; x++) {
      System.out.print(ary[x]);
      if (x < ary.length - 1) {
        System.out.print(", ") ;
      }
    }
    System.out.println("]");
  }

  /*public static void printArray(int[][]ary){

  }*/

/*  public static int countZeros2D(int[][] nums){
    int zeros = 0;
    for (int x = 0; x < vals.length; x++) {
      for (int y = 0; y < vals[0].length; y++) {
        if (nums[x][y] == 0) {
          zeros += 1;
        }
      }
    }
    return zeros;
  }

/*  public static int[][] fill2D(int[][] vals){
    for (int x = 0; x < vals.length; x++) {
      for (int y = 0; y < vals[0].length; y++) {
        if (x == y) {
          vals[x][y] = 3;
        }
        else {
          vals[x][y] = 1;
        }
      }
    }
    return vals;
  }

  /*public static int[][] fill2DCopy(int[][] vals){
    int[][] newarr = new int[vals.length][vals[0].length];
    for (int x = 0; x < vals.length; x++){
      for (int y = 0; y < vals[0].length; y++){
        if (vals[x][y] < 0) {
          newarr[x][y] = 3;
        }
        else {
          newarr[x][y] = 1;
        }
      }
    }
    return newarr;
  }*/

  public static void main(String[] args){
    printArray(new int[] {1,2,3,5});
    //printArray(new int[][]{{12,2,4}, {8,7,12}});
    //countZeros2D(new int[][] {{2,0}, {0,0}});
    //fill2D(new iny[][] {{5,8,2}, {54,2,7}});
  }
}
