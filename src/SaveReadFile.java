import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SaveReadFile {
    public static void main(String[] args) {
        List<String> shoppingList = null;

        try {
            shoppingList = Files.readAllLines(Paths.get("C:\\Users\\OEM\\Desktop\\AkademiaKodu\\shoppingList.txt"),
                    Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
            shoppingList = new ArrayList<>();
        }
        List<Products>prodactList = new ArrayList<>();
            for (String s:shoppingList){

            String[]someData = s.split(":");
            prodactList.add(new Products(someData[0],
                    Integer.parseInt(someData[1]),
                    Double.parseDouble(someData[2])));
        }

        float valueShopping = 0;
            for (Products product: prodactList){
                 valueShopping += product.getQuantiti()*product.getPrice();
        }
        System.out.println("the purchase cost is: " + valueShopping + " zł ");
    }
}

