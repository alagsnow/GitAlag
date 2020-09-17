package practice;

import org.json.JSONArray;
import org.json.JSONObject;


public class produceSkuList {
    public static void main(String[] args) {

        int seq = 0;
//        HashMap<String, Object> effectScopeValue = new HashMap<String, Object>();
//        List<HashMap<String,Object>> effectScopeValueList =new ArrayList<HashMap<String,Object>>();
        JSONArray result = new JSONArray();
        for (int i = 0; i < 501; i++) {

            seq += 1;
            String SKU = "SKUlvyx" + seq;
            String SPU = "SPUlvyx" + seq;

            JSONObject temp = new JSONObject();

            temp.put("spu_seq", SKU);
            temp.put("sku_seq", SPU);
            temp.put("category_id", "");
            temp.put("label_id", "");

            result.put(temp);
//            effectScopeValueList.add(effectScopeValue);

        }


        System.out.println(result.toString());

    }


}
