package SE;

public class test1 {
    //稀疏数组
    public static void main(String[] args) {
        ArrayCopy();
        System.out.println("==========================================");
        ArrayDemo();
    }

    static void ArrayCopy() {
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        for (int[] ints : array1) {
            for (int ints1 : ints) {
                System.out.print(ints1 + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum = " + sum);

        int[][] array2 = new int[sum + 1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++; //1 1 0
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        System.out.println("稀疏数组");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t"
                    + array2[i][1] + "\t"
                    + array2[i][2] + "\t");
        }
    }

    //    static void ArrayClass(){
//        int[] a = {1,5,6,2,4};
//        Arrays.sort(a);//升序排序
//        //Arrays.fill(a,1);//数组填充
//        //Arrays.fill(a,2,4,0);// 2 到 4 被填充
//        System.out.println(Arrays.toString(a));//打印数组元素
////        int[] b = {1,5,6};
////        System.out.println(a.equals(b));
//        int c = Arrays.binarySearch(a,6);
//        System.out.println(c);
//    }
    static void ArrayDemo() {
        //1创建一个二维数组
        int[][] arrs = new int[11][11];
        arrs[1][2] = 1;
        arrs[2][3] = 2;

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                System.out.print(arrs[i][j] + "\t");
            }
            System.out.println();
        }
        //转换为稀疏数组
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arrs[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效值个数" + sum);
        //创建一个稀疏数组的数组
        int[][] arr2 = new int[sum + 1][3];
        arr2[0][0] = 11;
        arr2[0][1] = 11;
        arr2[0][2] = sum;

        //便利二位数
        int count = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                if (arrs[i][j] != 0) {
                    count++;
                    arr2[count][0] = i;
                    arr2[count][1] = j;
                    arr2[count][2] = arrs[i][j];
                }
            }
        }

        //输出稀疏数组
        System.out.println("稀疏数组");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i][0] + "\t"
                    + arr2[i][1] + "\t"
                    + arr2[i][2] + "\t");
        }
        System.out.println("==========================================");
        System.out.println("还原");
        // 11 11
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];
        //2.给其中的元素还原他的值
        for (int i = 1; i < arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }
        for (int[] arrs1 : arr3) {
            for (int anInt : arrs1) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
