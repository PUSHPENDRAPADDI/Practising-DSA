class Practice{
  public static void main(String[] args){
    int[][] arr = {{0,1,2,0}, {3,4,5,2},{1,3,1,5}};
    int[] col = new int[arr[0].length];
    int[] row = new int[arr.length];
    for(int j = 0; j< col.length; j++){
      col[j] = 1;
    }
    for(int j = 0; j< row.length; j++){
      row[j] = 1;
    }
    for(int i = 0;i< arr.length; i++){
      for(int j = 0; j< arr[0].length; j++){
        if(arr[i][j] == 0){
          row[i] = 0;
          col[j] = 0;
        }
      }
    }
    for(int i = 0;i< arr.length; i++){
      for(int j = 0;j< arr[0].length; j++){
        if(col[j] == 0 || row[i] == 0){
          arr[i][j] = 0;
        }
      }
    }
    for(int i = 0;i< arr.length; i++){
      for(int j = 0;j< arr[0].length; j++){
        System.out.print(arr[i][j]+" , ");
      }
      System.out.println();
    }
  }
}