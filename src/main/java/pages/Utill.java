package pages;

import io.qameta.allure.Step;

public class Utill {
    @Step("step: {str}")
    public static void print (String str){
        System.out.println(str);

    }
}
