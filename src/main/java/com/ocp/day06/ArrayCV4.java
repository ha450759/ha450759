package com.ocp.day06;

public class ArrayCV4 {
    public static void main(String[] args) {
        double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double[] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        double stock_cv = MyMath.cv(stocks);
        double bonds_cv = MyMath.cv(bonds);
        String result = (stock_cv < bonds_cv)?"股票":"公債";
        System.out.printf("股票獲利: %.2f%% 債卷獲利: %.2f%% %s獲利較穩健",stock_cv*100, bonds_cv*100, result);
        System.out.printf("股票最大獲利: %.1f 股票最小獲利: %.1f\n",MyMath.max(stocks), MyMath.min(stocks));
        
    }
    
    
}
