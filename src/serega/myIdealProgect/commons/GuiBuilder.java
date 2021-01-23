package serega.myIdealProgect.commons;

import serega.myIdealProgect.util.VariantsLoader;

public class GuiBuilder {

    public static String generateRandomFraza(){
        String resultText = "";

        VariantsLoader variantsLoader = new VariantsLoader();

        int firstRandomNumber = (int) (Math.random() * variantsLoader.firstWordArray.size());
        resultText += variantsLoader.firstWordArray.get(firstRandomNumber);
        resultText += " ";

        int secondRandomNumber = (int) (Math.random() * variantsLoader.secondWordArray.size());
        resultText += variantsLoader.secondWordArray.get(secondRandomNumber);
        resultText += " ";

        int thirdRandomNumber = (int) (Math.random() * variantsLoader.thirdWordArray.size());
        resultText += variantsLoader.thirdWordArray.get(thirdRandomNumber);
        resultText += " ";

        int fourRandomNumber = (int) (Math.random() * variantsLoader.fourthWordArray.size());
        resultText += variantsLoader.fourthWordArray.get(fourRandomNumber);
        resultText += " ";

        int fifthRandomNumber = (int) (Math.random() * variantsLoader.fifthWordArray.size());
        resultText += variantsLoader.fifthWordArray.get(fifthRandomNumber);

        return resultText;
    }



}
