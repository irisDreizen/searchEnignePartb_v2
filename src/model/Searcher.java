package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Searcher {

    private Ranker r=new Ranker();


    public HashMap<String,Map<String,Double>>   RankDocs(String nameQuery, String query, Indexer index, String pathToRead, HashMap<String, Map<String,Double>> relevantDoc, double docAvg) throws IOException {
        //to add parsing option

     return  r.collectLinesQuery(nameQuery, query, index, pathToRead, relevantDoc, docAvg);


    }
}
