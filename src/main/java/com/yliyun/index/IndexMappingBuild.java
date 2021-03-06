package com.yliyun.index;

import com.yliyun.client.ElasticSearchReservedWords;
import com.yliyun.client.SearchDocumentFieldName;
import com.yliyun.util.SearchDateUtils;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;

import java.io.IOException;

/**
 * Created by manbuzhiwu on 2016/10/1.
 */
public class IndexMappingBuild {



    public static XContentBuilder getDocumentTypeMapping(String typeName){

        try {
            XContentBuilder builder = XContentFactory.jsonBuilder().startObject().startObject(typeName).startObject("properties");

            addLiveDateMapping(builder);
            addFullTextMapping(builder);
            addAllStoreMapping(builder);

            builder.endObject().endObject().endObject();

            return builder;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    // 时间格式
    private static void addLiveDateMapping(XContentBuilder builder) throws IOException
    {
        int len =   SearchDocumentFieldName.dateTextDocumentFields.length;
        for (int i = 0; i < len; i++) {
            builder.startObject(SearchDocumentFieldName.dateTextDocumentFields[i])
                    .field(ElasticSearchReservedWords.TYPE.getText(), ElasticSearchReservedWords.DATE.getText())
                    .field(ElasticSearchReservedWords.FORMAT.getText(), SearchDateUtils.pattern)
                    .field(ElasticSearchReservedWords.STORE.getText(), ElasticSearchReservedWords.YES.getText())
                    .field(ElasticSearchReservedWords.INDEX.getText(), ElasticSearchReservedWords.NOT_ANALYZED.getText())
                    .endObject();

        }
    }

    // 需要分词器分词的
    private static void addFullTextMapping(XContentBuilder builder) throws IOException
    {
        int len =   SearchDocumentFieldName.fullTextDocumentFields.length;

        for (int i = 0; i < len; i++) {

            if(SearchDocumentFieldName.fullTextDocumentFields[i].equals(SearchDocumentFieldName.FILE_CONTENTS.getFieldName())){
                builder.startObject(SearchDocumentFieldName.fullTextDocumentFields[i])
                        .field(ElasticSearchReservedWords.TYPE.getText(), ElasticSearchReservedWords.STRING.getText())
                        .field(ElasticSearchReservedWords.STORE.getText(), ElasticSearchReservedWords.NO.getText())
                        .field(ElasticSearchReservedWords.ANALYZER.getText(), ElasticSearchReservedWords.ANALYZER_IK_MAX.getText())
                        .endObject();
            }

            builder.startObject(SearchDocumentFieldName.fullTextDocumentFields[i])
                    .field(ElasticSearchReservedWords.TYPE.getText(), ElasticSearchReservedWords.STRING.getText())
                    .field(ElasticSearchReservedWords.STORE.getText(), ElasticSearchReservedWords.YES.getText())
                    .field(ElasticSearchReservedWords.ANALYZER.getText(), ElasticSearchReservedWords.ANALYZER_IK_MAX.getText())
                    .endObject();
        }


    }

    // 不需要分词器，需要索引的
    private static void addAllStoreMapping(XContentBuilder builder) throws IOException
    {

        int len =   SearchDocumentFieldName.allStoreTextDocumentFields.length;
        for (int i = 0; i < len; i++) {

            builder.startObject(SearchDocumentFieldName.allStoreTextDocumentFields[i])
                    .field(ElasticSearchReservedWords.TYPE.getText(), ElasticSearchReservedWords.STRING.getText())
                    .field(ElasticSearchReservedWords.STORE.getText(), ElasticSearchReservedWords.YES.getText())
                    .field(ElasticSearchReservedWords.INDEX.getText(), ElasticSearchReservedWords.NOT_ANALYZED.getText())
                    .endObject();

        }
    }



}
