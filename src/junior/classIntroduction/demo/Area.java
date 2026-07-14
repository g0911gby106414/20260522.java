package junior.classIntroduction.demo;

public class Area {
    // public int length;
    // public int width;
    // public int calcuateArea(){
    //     int area = length * width;
    //     return area;

    //  }
    // public static void main(String[] args) {
    //     Area area1 = new Area();
    //     area1.length = 5;
    //     area1.width = 3;
    //     int areaResult = area1.calcuateArea();
    //     System.out.println("長方形的面積為: " + areaResult);

    // }

    // 課堂練習2 - 改寫Area類別, 加入建構子來初始化length和width, 並且實體化物件來測試建構子的功能        
    // Area area1 = new Area(5, 3);        
    // int areaResult1 = area1.calculateArea();        
    // System.out.println("長方形的面積為: " + areaResult1);        
    // Area area1 = new Area(5, 3);        
    // int areaResult1 = area1.calculateArea();        
    // System.out.println("長方形的面積為: " + areaResult1);        
    // // 多載 (Overloading) - 同一個方法名稱, 但是參數不同        
    // // 長方形的面積計算        
    // int areaResult3 = area1.calculateArea();        
    // System.out.println("長方形的面積為: " + areaResult3);        
    // // 圓形的面積計算        
    // double areaResult4 = area1.calculateArea(5);        
    // System.out.println("圓形的面積為: " + areaResult4);        
    // // 三角形的面積計算        
    // double areaResult5 = area1.calculateArea(5, 3);        
    // System.out.println("三角形的面積為: " + areaResult5);
        

    public int length;    
    public int width;    
    public Area(int length, int width) {        
    // 這裡是建構子, 可以用來初始化物件的屬性        
    // 這裡的length和width是區域變數, 不是屬性        
    this.length = length;        
    this.width = width;    }    
    // // 多載 (Overloading) - 同一個方法名稱, 但是參數不同   
     // 長方形的面積計算    
    public int calculateArea() {        
    int area = length * width;
    return area;
    }
    

     // 圓形的面積計算    
    public double calculateArea(int r) {        
    double area = r * r * 3.14;        
    return area;
    } 
    
    // 三角形的面積計算    
    public double calculateArea(int base, int height) {        
    double area = (base * height) / 2.0;        
    return area;
    }

    // 課堂練習3 - 用多載改寫Area類別的建構子
    // 讓一開始不帶參數也可以跑出來, 但是預設length和width都是0
    // Area area3 = new Area();
    // 課堂練習4 - 在Area類別中加入一個方法, 用來計算梯形的面積
    // 梯形的面積計算公式: (上底 + 下底) * 高 / 2
    // 這個方法的參數為 int topBase, int bottomBase, int height, 回傳型態為double
    public double calculateArea(int topBase, int bottomBase, int height) {
        double area = (topBase + bottomBase) * height / 2.0;
        return area;
    }
}





