package senior.borrowGiveBackSystem.db;

public class Demo {
        // 1.
        // 把提款機的部分 搬過來 改寫成
        // ===== 校園圖書館系統 =====
        // 1. 查看所有書籍
        // 2. 借書
        // 3. 還書
        // 0. 離開

        // 2.
        // 建立db/book.txt 內容如下面四行
        // P,1,Java入門,張三,false,Java,aa
        // P,2,Python程式設計,王五,true,Python,NULL
        // N,3,哈利波特,J.K.Rowling,true,奇幻,NULL
        // N,4,達文西密碼,丹布朗,true,歷史,NULL

        // 3.
        // 建立Book.java 有以下屬性, 且有getter, setter
        // String type(種類) => 預設B, getType() 方法 => 回傳B
        // int number (編號)
        // String title (書名)
        // String author (作者)
        // boolean available (是否可借)
        // String borrowUser (誰借走)

        // 建立建構子傳入以上屬性的資料進來

        // 4.
        // 建立ProgrammingBook.java(程式類別的書) 繼承Book.java 且有以下屬性
        // String language (程式語言)

        // 覆寫 getType() 方法 => 回傳P
        // 建立建構子傳入以上屬性的資料進來

        // 5.
        // 建立NovelBook.java(小說類別的書) 繼承Book.java 且有以下屬性
        // String category (類別)

        // 覆寫 getType() 方法 => 回傳N
        // 建立建構子傳入以上屬性的資料進來
        

}
