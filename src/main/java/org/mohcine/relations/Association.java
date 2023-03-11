package org.mohcine.relations;

public class Association implements Relation {
    CardinalityMin min;
    CardinalityMax max;

    @Override
    public void appliquerRelation(String source, String target) {
        System.out.println("***************************");
        System.out.println("La classe "+ source+ "peut avoir " + min +
                "ou "+ max + " avec " + target);
        System.out.println("***************************");
    }

}
