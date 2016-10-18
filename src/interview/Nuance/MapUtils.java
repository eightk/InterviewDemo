/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.Nuance;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author huico
 */
public class MapUtils {

    public static Map<String, Integer> addRecord(Map<String, Integer> map, String key, Integer value) {
        if (map.containsKey(key.trim())) {
            Integer newValue = map.get(key.trim()) + value;
            map.put(key.trim(), newValue);
        } else {
            map.put(key.trim(), value);
        }
        return map;
    }

    public static void writeResult(Map<String, Integer> map, Writer outputFile) throws IOException {
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();

            outputFile.write(entry.getKey());
            outputFile.write("\t");
            outputFile.write(entry.getValue().toString());
            outputFile.write("\n");
        }
    }

}
