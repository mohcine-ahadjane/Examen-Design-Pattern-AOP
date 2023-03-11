package org.mohcine.relations;

public class Implementation implements Relation {
    @Override
    public void appliquerRelation(String source, String target) {
        System.out.println("***************************");
        System.out.println("La classe "+ source+ "implemente l'interface "+ target);
        System.out.println("***************************");
    }
}
