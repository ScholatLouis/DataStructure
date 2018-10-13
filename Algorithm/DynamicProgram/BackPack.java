public class BackPack {
    public static void main(String[] args) {
        int Weight = 7;
        int[] itemValue = new int[]{1,4,5,7};
        int[] itemWeight = new int[]{1,3,4,5};

        BackPack backpack = new BackPack();
        backpack.hightestValue(Weight, itemValue, itemWeight);
    }

    public void hightestValue(int Weight, int[] itemValue, int[] itemWeight) {
        int[][] valueArr = new int[itemValue.length+1][Weight+1];
        for(int i = 1; i < valueArr.length; ++i) {
            for(int j = 1; j < valueArr[i].length; ++j) {
                if(itemWeight[i-1] > j) 
                    valueArr[i][j] = valueArr[i-1][j];
                else 
                    valueArr[i][j] = Math.max(itemValue[i-1] + valueArr[i-1][j-itemWeight[i-1]], 
                        valueArr[i-1][j]);
            }
        }

        for(int i = 0; i < valueArr.length; ++i) {
            for(int j = 0; j < valueArr[i].length; ++j) {
                System.out.print(valueArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}