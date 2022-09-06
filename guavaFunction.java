package com.study.otherWays;

import com.google.common.collect.*;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class GoogleGuava {


    public void listFunction(List<Integer> list){

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+",");
        }

        System.out.println();
        //反转list
        List<Integer> reverse = Lists.reverse(list);
        for (int i = 0; i < reverse.size(); i++) {
            System.out.print(reverse.get(i) + ",");
        }

        //集合分成若干份
        List<List<Integer>> partition = Lists.partition(list, 10);

    }


    public void mapFunction(){
        //一个key映射多个value的HashMap
        Multimap<String,String> multimap  = ArrayListMultimap.create();
        multimap.put("key","1");
        multimap.put("key","2");

        Collection<String> key = multimap.get("key");
        System.out.println(multimap);

        //转化为map
        Map<String, Collection<String>> stringCollectionMap = multimap.asMap();
        System.out.println(stringCollectionMap);
    }


    public void biMapFunction(){
        //value 都不能重复的map
        BiMap<String,String> biMap = HashBiMap.create();
        biMap.put("key","value");
        System.out.println(biMap);

        //key value反转
        BiMap<String, String> inverse = biMap.inverse();
        System.out.println(inverse);
    }

    public void tableFunction(){
        //这是一个两个key的类
        Table<Integer,String,String> table = HashBasedTable.create();
        table.put(18,"男","Tom");
        table.put(18,"女","Mary");
        table.put(19,"男","sam");

        //获取对应的value
        String s = table.get(18, "男");
        System.out.println(s);

        //查看有多少列
        Map<Integer, String> column = table.column("男");
        System.out.println(column);

    }

    public void setFunction(){
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("apple");
        multiset.add("orange");
        multiset.add("apple");
        multiset.add("apple");

        //统计指定元素
        int apple = multiset.count("apple");
        System.out.println(apple);

        //去除重复元素
        Set<String> set = multiset.elementSet();
        System.out.println(set);

        //打印元素
        Iterator<String> iterator = multiset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void main(String[] args) {
        //List<Integer> list = Lists.newArrayList(1,2,3);
        GoogleGuava gg = new GoogleGuava();
        //gg.MapFunction();
        //gg.biMapFunction();
        //gg.tableFunction();
        gg.setFunction();
    }
}
