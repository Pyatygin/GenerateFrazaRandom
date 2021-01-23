package serega.myIdealProgect.util;

import java.util.ArrayList;

//TODO: Переделать класс когда пройдем до конца тему коллекции.
public class VariantsLoader {

    public ArrayList<String> firstWordArray = new ArrayList();
    public ArrayList<String> secondWordArray = new ArrayList();
    public ArrayList<String> thirdWordArray = new ArrayList();
    public ArrayList<String> fourthWordArray = new ArrayList();
    public ArrayList<String> fifthWordArray = new ArrayList();

    public VariantsLoader() {

        addFirstWordInArray("Пластиковые окна");
        addFirstWordInArray("Деревянные окна");
        addFirstWordInArray("Окна ПВХ");
        addFirstWordInArray("Железные двери");
        addFirstWordInArray("Входные двери");
        addFirstWordInArray("Межкомнтаные двери");

        addSecondWordInArray("Samsung");
        addSecondWordInArray("Philips");
        addSecondWordInArray("Apple");
        addSecondWordInArray("Nokia");
        addSecondWordInArray("LG");

        addThirdWordInArray("купить");
        addThirdWordInArray("заказать");
        addThirdWordInArray("приобрести");
        addThirdWordInArray("заказ");
        addThirdWordInArray("установка");
        addThirdWordInArray("рассрочка");
        addThirdWordInArray("кредит");
        addThirdWordInArray("производство");
        addThirdWordInArray("изготовление");
        addThirdWordInArray("забронировать");
        addThirdWordInArray("цена");
        addThirdWordInArray("стоимость");
        addThirdWordInArray("срочно");

        addFourthWordInArray("в");

        addFifthWordInArray("Москве");
        addFifthWordInArray("Воронеже");
        addFifthWordInArray("Липецке");
        addFifthWordInArray("Санкт-Петербурге");
        addFifthWordInArray("Ростове-на-дону");
        addFifthWordInArray("Туле");
        addFifthWordInArray("Екатеринбурге");
        addFifthWordInArray("Омске");
    }

    public void addFirstWordInArray(String text){
        firstWordArray.add(text);
    }

    public void addSecondWordInArray(String text){
        secondWordArray.add(text);
    }

    public void addThirdWordInArray(String text){
        thirdWordArray.add(text);
    }

    public void addFourthWordInArray(String text){
        fourthWordArray.add(text);
    }

    public void addFifthWordInArray(String text){
        fifthWordArray.add(text);
    }
}
