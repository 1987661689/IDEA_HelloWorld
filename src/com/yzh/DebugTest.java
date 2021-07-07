package com.yzh;

import java.util.HashMap;

public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("name","yzh");
        map.put("age","22");
        map.put("sex","man");
        map.put("height","173");
        System.out.println(map.toString());

        String age = map.get("age");
        System.out.println(age);

        map.remove("height");
        System.out.println(map.toString());
    }
}
