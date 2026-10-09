package com.creational.prototype;

import java.util.Hashtable;
import java.util.Map;
// Prototype pattern is used when craetion of object directly is costly
public class ProfessionCache {
    private static Map<Integer, Profession> professionMap = new Hashtable<>();

    // return required cloned object
    public static Profession getCloneOfNewProfession(int id) {
        Profession cachedProfessionInstance = professionMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    //load cache
    public static void loadProfessionCache() {
        Doctor doc = new Doctor();
        doc.id = 1;
        Engineer eng = new Engineer();
        eng.id = 2;
        Teacher teach = new Teacher();
        teach.id = 3;
        professionMap = Map.of(1,doc, 2, eng, 3, teach);
    }
}
