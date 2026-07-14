package junior;

public class MethodInfo {
       public static void main(String[] args) {
        printHello1();

        printHello2(4);
        printHello2(5);
        printHello2(6);

        printHello3("Edward");
        printHello3("David");

        printHello4("Allen", 7);
        printHello4("Ben", 8);

        String[] names = { "Edward1", "David1", "Allen1" };
        // for(int z = 0; z < names.length; z++) {
        // System.out.println("Hello, " + names[z]);
        // }
        printHello5(names);

        String[] names2 = { "Edward2", "David2", "Allen2" };
        printHello5(names2);

        int nums[] = { 1, 2, 3, 4, 5 };
        printHello6(names2, nums);

        int result = add(3, 5);
        System.out.println("3 + 5 = " + result);

        String strResult = stringAdd("Hello1, ", "World1!");
        System.out.println(strResult);
    }

    // 方法(Method)的定義 其他語言或許是function
    // void : 沒有回傳值
    // static : 靜態的, 不需要實體化物件就可以使用
    // 前綴字 靜態 回傳型態 方法名稱(輸入型別 輸入參數) {
    // 方法內容
    // }

    public static void printHello1() {
        System.out.println("Hello, World1!");
        System.out.println("Hello, World2!");
        System.out.println("Hello, World3!");
    }

    public static void printHello2(int num) {
        System.out.println("Hello, World" + num + "!");
    }

    // 課堂練習1: 寫一個方法printHello3, 輸入一個字串, 印出 "Hello, " + 輸入的字串 + "!"
    public static void printHello3(String name) {
        System.out.println("Hello, World " + name + "!");
    }

    public static void printHello4(String name, int num) {
        System.out.println("Hello, World " + name + " " + num + "!");
    }

    // 課堂練習2: 寫一個方法printHello5, 輸入一個字串的陣列, 印出 "Hello, " + 陣列內的每個字串 + "!"
    // 字串的陣列: String[] names = {"Edward", "David", "Allen"};
    public static void printHello5(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello, " + names[i] + "!");
        }
    }

    // String[] names = {"Edward", "David", "Allen"};
    // int[] nums = {1, 2, 3, 4, 5};
    // 如何印出以下結果:
    // Hello, Edward, 1!
    // Hello, David, 2!
    // Hello, Allen, 3!
    // Hello, empty, 4!
    // Hello, empty, 5!

    public static void printHello6(String[] names, int[] nums) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello, " + names[i] + "!");
        }
    }

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static String stringAdd(String str1, String str2) {
        String strResult = str1 + str2;
        return strResult;
    }
   
     public static int findMax(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        // 回傳最大值
        return max;
    }

    // int[] scores = { 80, 90, 70, 60, 85 };
    public static int[] calScore(int[] scores) {
        int reslt[] = new int[4];
        int max = scores[0];
        int min = scores[0];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            // sum += scores[i]; // sum = sum + scores[i] 的簡寫

            if (scores[i] > max) {
                max = scores[i];
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }
        // 平均分數 = 總分數 / 分數的個數
        avg = sum / scores.length;

        // 檢查用
        // System.out.println("陣列內的最大值為: " + max);
        // System.out.println("陣列內的最小值為: " + min);
        // System.out.println("陣列內的總分為: " + sum);
        // System.out.println("陣列內的平均分數為: " + avg);

        // {平均分數, 總分數, 最高分數, 最低分數}
        reslt[0] = avg;
        reslt[1] = sum;
        reslt[2] = max;
        reslt[3] = min;
        // 回傳陣列
        return reslt;
    }

       // 課後練習題
        // 實作method: findMax(int[]), findMin(int[])
        // 講解: findMax(): 回傳最大值到main印出(用for + if )
        // 講解: findMin(): 直接印出最小值(用for + if )
        // int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        // int getMax = findMax(numbers);
        // System.out.println("最大值為:" + getMax);
        // findMin(numbers);
    

    public static void multiply1(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("直接印出乘法結果:" + result);
    }

    public static int multiply2(int num1, int num2) {
        return num1 * num2;
    }

    // 對照multiply2的階段寫法
    public static int multiply21(int num1, int num2) {
        // 用int變數去接 運算結果
        int result = num1 * num2;
        // 回傳變數
        return result;
    }
    

    //JS
    // function pryamid(max) {
    //      return "zzz";
    // }
    // 收納重複使用的code
    public static void pyramid(int max) {
        for(int i = 1; i <= max; i++) {
            // 印出偶數
            if(i % 2 == 0) {
                
            } else {
                // 由左到右印出空白
                int space = (max - i) / 2;
                for(int k=1; k <= space;  k++) {
                    System.out.print("_");
                }

                // 由左到右印出星星 最多跟i行一樣多
                for(int j=1; j<=i; j++) {
                    System.out.print("*");
                }

                System.out.println(); // 只在奇數時換行
            }
            // System.out.println(); // 每i行都換行
        }
        System.out.println("印出金字塔"+max+"結束");
    }

    // public static int findMax(int[] numbers) {
    //     int max = numbers[0];
    //     for(int i = 1; i < numbers.length; i++) {
    //         if(numbers[i] > max) {
    //             max = numbers[i];
    //         }
    //     }

    //     return max;
    // }

    public static void findMin(int[] numbers) {
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
             if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("最小值為:" + min);
    }


    // 課程練習3 檢查是否有重複元素
        // 寫一個方法 containsDuplicate 輸入一個int的陣列 nums
        // 回傳一個boolean 如果陣列內有重複元素回傳true 沒有重複元素回傳false
        // int[] nums = { 1, 2, 3, 4, 5, 1 }; => true
        // int[] nums = { 1, 2, 3, 4, 5 }; => false

    public static boolean containsDuplicate(int[] nums) {
        // false => 沒有重複元素
        // true => 有重複元素
        boolean hasDuplicate = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // 跟下一個元素去比對
                if (nums[i] == nums[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }
        return hasDuplicate;
    }
}



    


   
