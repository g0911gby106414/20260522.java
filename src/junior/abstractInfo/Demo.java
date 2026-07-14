package junior.abstractInfo;

public class Demo {
    public static void main(String[] args) {
        // 抽象: abstract 介紹
        // 想像是書的目錄
        // 也有屬性 跟 方法 但是方法需要被實作

        Notification email = new EmailNotification("aa@gmail.com");
        email.send();
        email.log();

        Notification sms = new SmsNotification("0911222333");
        sms.send();
        sms.log();

        // 課後練習:
        // 改寫junior.polymorphism.employee 為 抽象類別
        // 裡面的calculateSalary() 也改成抽象方法
        // 要有月薪員工 , 銷售員, 工讀生 的計算薪水方式
    }
}
