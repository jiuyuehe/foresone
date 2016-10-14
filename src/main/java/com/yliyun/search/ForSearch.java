package com.yliyun.search;

import com.yliyun.client.EsClient;
import com.yliyun.model.EsIndexConfig;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.support.IndicesOptions;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * Created by Administrator on 2016/9/30.
 */
public class ForSearch {


    TransportClient tc = EsClient.getInstance();

    public  void dosearch(EsIndexConfig cf){

    //    QueryBuilder queryBuilders = QueryBuilders.disMaxQuery().add()


        SearchResponse response = tc.prepareSearch(cf.getIndexName())
                .setTypes(cf.getTypeName())
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
                .setQuery(QueryBuilders.termQuery("footer", "非法"))                 // Query
               // .setPostFilter(QueryBuilders.rangeQuery("age").from(12).to(18))     // Filter
                .setFrom(0).setSize(60).setExplain(true)
                .execute()
                .actionGet();

        System.out.println(response);
        System.out.println(response.getContext());

        System.out.println(response.getHits().getHits().toString());


        tc.close();

    }



}

