package com.elesticsearch;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.poi.ss.formula.functions.T;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.IndicesClient;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;
import org.elasticsearch.cluster.metadata.MappingMetadata;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.Map;

/**
 * ES工具 <br>
 * index: 库<br>
 * map: 表<br>
 * document: 每一条数据
 */

public class ElesticSearchUtil {

    //地址
    private static String BASE_URL="";

    //方法
    private static String SEARCH="";
    private static String add="";
    private static String remove="";
    private static String get="";

    @Autowired
    private RestHighLevelClient client;

    /**
     * 获取 IndicesClient对象
     * @return client
     */
    private IndicesClient getIndicesClient(){
        return client.indices();
    }

    /**
     * 创建索引
     * @param indexStr 索引名
     * @throws Exception
     */
    public void addIndex(String indexStr) throws Exception{
        //获取client操作对象
        IndicesClient indices = getIndicesClient();
        //设置索引名称
        CreateIndexRequest index = new CreateIndexRequest(indexStr);
        CreateIndexResponse createIndexResponse = indices.create(index, RequestOptions.DEFAULT);
        boolean acknowledged = createIndexResponse.isAcknowledged();
        if(acknowledged){
            System.err.println("创建索引成功");
        }
    }

    /**
     * 创建索引，映射
     * @param indexStr  索引名
     * @param mapping   map型映射
     * @throws Exception
     */
    public void addIndexAndMapping(String indexStr, Map<String,?> mapping) throws Exception{
        IndicesClient client = getIndicesClient();
        CreateIndexRequest index = new CreateIndexRequest(indexStr);
        index.mapping(mapping);
        CreateIndexResponse createIndexResponse = client.create(index, RequestOptions.DEFAULT);
        boolean acknowledged = createIndexResponse.isAcknowledged();
        if(acknowledged){
            System.err.println("创建索引成功");
        }
    }

    /**
     * 创建索引，映射
     * @param indexStr 索引名
     * @param mapping 字符串型映射
     * @throws Exception
     */
    public void addIndexAndMapping(String indexStr, String mapping) throws Exception{
        IndicesClient client = getIndicesClient();
        CreateIndexRequest index = new CreateIndexRequest(indexStr);
        index.mapping(mapping, XContentType.JSON);
        CreateIndexResponse createIndexResponse = client.create(index, RequestOptions.DEFAULT);
        boolean acknowledged = createIndexResponse.isAcknowledged();
        if(acknowledged){
            System.err.println("创建索引成功");
        }
    }

    /**
     * 查询索引
     * @param index 索引名
     * @return mappings 结果集
     * @throws Exception
     */
    public Map<String,MappingMetadata> queryIndex(String index) throws Exception{
        IndicesClient client = getIndicesClient();
        GetIndexRequest getIndexRequest = new GetIndexRequest(index);
        GetIndexResponse response = client.get(getIndexRequest, RequestOptions.DEFAULT);
        Map<String, MappingMetadata> mappings = response.getMappings();
        return mappings;
    }

    /**
     * 删除索引
     * @param index 索引名
     * @throws Exception
     */
    public void removeIndex(String index) throws Exception{
        IndicesClient client = getIndicesClient();
        DeleteIndexRequest request = new DeleteIndexRequest(index);
        AcknowledgedResponse delete = client.delete(request, RequestOptions.DEFAULT);
        if(delete.isAcknowledged()){
            System.out.println("删除索引成功");
        }
    }

    /**
     * 判断索引是否存在
     * @param index 索引名
     * @return result
     * @throws Exception
     */
    public Boolean indexIsExits(String index) throws Exception{
        IndicesClient client = getIndicesClient();
        GetIndexRequest indexRequest = new GetIndexRequest(index);
        return client.exists(indexRequest, RequestOptions.DEFAULT);
    }

    /**
     * 以map作为数据存储
     * @param index 索引
     * @param map   map集
     * @param id id
     * @throws Exception
     */
    public void addDocumentWithMap(String index,Map<String,?> map,String id) throws Exception{
        IndexRequest source = new IndexRequest(index).id(id).source(map);
        IndexResponse indexResponse = client.index(source, RequestOptions.DEFAULT);
    }

    /**
     * 根据实体类添加或修改(不存在则添加)数据
     * @param index 索引名称
     * @param data  实体
     * @param id    id
     * @throws Exception
     */
    public void addDocumentWithEntity(String index, Object data,String id) throws Exception{
        String result= JSON.toJSONString(data);
        IndexRequest request = new IndexRequest(index).id(id).source(result,XContentType.JSON);
        IndexResponse response = client.index(request, RequestOptions.DEFAULT);
    }

    /**
     * 活得String结果集
     * @param index 索引
     * @param id    id
     * @return  str
     * @throws Exception
     */
    public String getDocumentToStringResult(String index,String id) throws Exception{
        GetRequest request = new GetRequest(index, id);
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
        return response.getSourceAsString();
    }

    /**
     * 获取map结果集
     * @param index 索引
     * @param id    id
     * @return  result
     * @throws Exception
     */
    public Map<String,?> getDocumentToMap(String index,String id) throws Exception{
        GetRequest request = new GetRequest(index, index);
        GetResponse response = client.get(request, RequestOptions.DEFAULT);
        return response.getSourceAsMap();
    }

    /**
     * 删除文档
     * @param index 索引
     * @param id    id
     * @throws Exception
     */
    public void removeDocument(String index,String id)throws Exception{
        DeleteRequest request = new DeleteRequest(index, id);
        DeleteResponse delete = client.delete(request, RequestOptions.DEFAULT);
    }

}
