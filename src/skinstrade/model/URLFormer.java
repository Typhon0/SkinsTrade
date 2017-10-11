package skinstrade.model;

import skinstrade.model.Enum.Rarity;
import skinstrade.model.Enum.TypeGroup;
import skinstrade.model.Enum.Wear;
import java.net.MalformedURLException;
import java.net.URL;

public final class URLFormer {

    public static URL bitSkinsGenerateURL(String search, TypeGroup type, Rarity rarity, Wear wear, int isStatTrack, int hasSticker, int isSouvenir, int sortType, int order) {
        String string_url = "https://bitskins.com/";
        URL resultURL = null;
        //search
        if (search.isEmpty()) {
            string_url += "?appid=730";
        } else {
            search = search.replace(" ","+");    //bon format pour search
            string_url += "?market_hash_name=" + search + "&appid=730";
        }
        //type
        if (type != TypeGroup.ANY) {
            string_url += "&item_type=" + type.toStringBitSkins();
        }
        //rarity
        if (rarity != Rarity.ANY) {
            string_url += "&item_rarity=" + rarity.toStringBitSkins();
        }
        //wear
        if (wear != Wear.ANY) {
            string_url += "&item_wear=" + wear.toStringBitSkins();
        }
        //isStatTrack
        if (isStatTrack == 1) {
            string_url += "&is_stattrak=" + "1";  //stattrack
        } else if (isStatTrack == -1) {
            string_url += "&is_stattrak=" + "-1"; //no stattrack
        } else {
            string_url += "&is_stattrak=" + "0"; //any
        }
        //hasSticker
        if (hasSticker == 1) {
            string_url += "&has_stickers=" + "1"; //sticker
        } else if (hasSticker == -1) {
            string_url += "&has_stickers=" + "-1"; //no sticker
        } else {
            string_url += "&has_stickers=" + "0"; //any
        }
        //isSouvenir
        if (isSouvenir == 1) {
            string_url += "&is_souvenir=" + "1"; //souvenir
        } else if (isSouvenir == -1) {
            string_url += "&is_souvenir=" + "-1"; //no souvenir
        } else {
            string_url += "&is_souvenir=" + "0"; //any
        }
        //sortType
        if (sortType == 0) {
            string_url += "&sort_by=" + "bumped_at"; //Featured
        } else if (sortType == 1) {
            string_url += "&sort_by=" + "price";    //Price
        } else if (sortType == 2) {
            string_url += "&sort_by=" + "created_at";     //Date Added
        } else {
            string_url += "&sort_by=" + "wear_value";   //Float (wear)
        }
        //order
        if (order == 0) {
            string_url += "&order=" + "desc"; //Descendant
        } else {
            string_url += "&order=" + "asc"; //Ascendant
        }
        //generation de l'URL
        try {
            resultURL = new URL(string_url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return resultURL;
    }
}
