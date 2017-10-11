package skinstrade.model;

import skinstrade.model.Enum.Rarity;
import skinstrade.model.Enum.TypeGroup;
import skinstrade.model.Enum.Wear;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {

    private URL url;

    URLReader(URL url) {
        this.url = url;
    }

    public Item getItem(int index) {
        String domain = this.url.toString().split("/")[2];

        switch (domain) {
            case "bitskins.com":
                return getItemBitSkins(index);
            default:
                return new Item();

        }
    }

    private Item getItemBitSkins(int index) {
        try {
            String itemName = "";
            double itemPrice = 0.0;
            double itemWear = 1.0;
            boolean find = false;

            BufferedReader in = new BufferedReader(new InputStreamReader(this.url.openStream()));
            String inputLine;
            //recherche du bon indice et du nom de l'arme
            while ((inputLine = in.readLine()) != null && !find) {
                //System.out.println(inputLine);
                if (inputLine.contains("panel-heading item-title")) {
                    if (index != 0) {
                        index--;
                    } else {
                        find = true;
                        itemName = inputLine.split("<|>")[2];
                    }
                }
            }
            //recherche du prix
            find = false;
            while ((inputLine = in.readLine()) != null && !find) {
                if (inputLine.contains("item-price-display")) {
                    find = true;
                    itemPrice = Double.parseDouble(inputLine.split("\\$|<|>")[3]);
                }
            }
            //recherche de la wear
            find = false;
            while ((inputLine = in.readLine()) != null && !find) {
                if (inputLine.contains("hidden unwrappable-float-pointer")) {
                    find = true;
                    itemWear = Double.parseDouble(inputLine.split("<|>|,")[2]);
                    //OverallWear RelativeWear, Right, PercentWear
                    //System.out.println(inputLine);
                }
            }
            in.close();

            return new Item(itemName, itemPrice, itemWear);

        } catch (Exception e) {
            e.printStackTrace();
            return new Item();
        }
    }

    public static void main(String[] args) throws Exception {
        /*
        URLReader reader1 = new URLReader(URLFormer.bitSkinsGenerateURL("Neon", TypeGroup.ANY, Rarity.ANY, Wear.FACTORYNEW, 0, 0, 0, 1, 1));
        System.out.println(reader1.getItem(0));
        System.out.println(reader1.getItem(1));
        */
    }
}