import com.google.gson.Gson;

import java.util.HashMap;

/**
 * Description:
 * -----------------------------------------------
 * Author:      chenliuchun
 * Date:        2018-12-07 10:54
 * Revision history:
 * Date         Description
 * --------------------------------------------------
 */

public class DemoA {

    public static void main(String[] args) {

        // test source
        Gson gson = new Gson();
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2,"haha");
        String json = gson.toJson(map);
        System.out.println("json: " + json);
    }


}
