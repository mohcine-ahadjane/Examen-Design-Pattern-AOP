package org.mohcine.relations;

public class Heritage implements Relation {
    @Override
    public void appliquerRelation(String source, String target) {
        System.out.println("***************************");
        System.out.println("La classe "+ source+ "herite de  la classe "+ target);
        System.out.println("***************************");
    }
}
