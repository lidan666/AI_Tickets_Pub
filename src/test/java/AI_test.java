import AIETickets.Model.Tree;
import com.mongodb.*;
import org.junit.Test;

import java.util.*;

public class AI_test {

    @Test
    public void test1(){
        MongoClient client = new MongoClient("192.168.1.109",27017);
        DB db = client.getDB("runoobdb");
        DBCollection collection = db.getCollection("AI_TREE");
        DBObject query = new BasicDBObject("GRADE", 1);
        DBCursor dbCursor = collection.find(query);
        System.out.println(dbCursor == null);
        while (dbCursor.hasNext()) {
            BasicDBObject bdbObj = (BasicDBObject) dbCursor.next();
            if (dbCursor != null) {
                Tree tree = new Tree();
                List<Tree> treeList= new ArrayList<Tree>();
                Integer ID = bdbObj.getInt("ID");
//                报PID空指针异常是因为getInt方法是将String类型的值转为int类型，mongoDB中的null值转不过来，所以应将model中的id、pID全都改成String类型
//                Integer PID = bdbObj.getInt("PID");
                String NAME = bdbObj.getString("NAME");
                String URL = bdbObj.getString("URL");
                Integer GRADE = bdbObj.getInt("GRADE");
                tree.setId(ID);
//                tree.setpId(PID);
                tree.setName(NAME);
                tree.setUrl(URL);
                tree.setGrade(GRADE);
                treeList.add(tree);
                System.out.println("list1:"+treeList);
            }
        }
    }



    @Test
    public void test2(){
        MongoClient client = new MongoClient("192.168.1.109",27017);
        DB db = client.getDB("runoobdb");
        DBCollection collection = db.getCollection("AI_TREE");
        DBObject query = new BasicDBObject("GRADE", 1);
        DBCursor dbCursor = collection.find(query);
//        System.out.println(dbCursor == null);
        List<Tree> treeList= new ArrayList<Tree>();
        while (dbCursor.hasNext()) {
            BasicDBObject bdbObj = (BasicDBObject) dbCursor.next();
            if (dbCursor != null) {
                Tree tree = new Tree();
                Integer ID = bdbObj.getInt("ID");
//                Integer PID = bdbObj.getInt("PID");
                String NAME = bdbObj.getString("NAME");
                String URL = bdbObj.getString("URL");
                Integer GRADE = bdbObj.getInt("GRADE");
                tree.setId(ID);
//                tree.setpId(PID);
                tree.setName(NAME);
                tree.setUrl(URL);
                tree.setGrade(GRADE);
                treeList.add(tree);
                System.out.println("list1:"+treeList);
            }
        }
        for(int a = 0 ; a<treeList.size();a++){
            sonList(treeList.get(a));
        }
        System.out.println("list2:"+treeList);
    }

    public List<Tree> sonList(Tree father){
        MongoClient client = new MongoClient("192.168.1.109",27017);
        DB db = client.getDB("runoobdb");
        DBCollection collection = db.getCollection("AI_TREE");
        List<Tree> sonlist= new ArrayList<Tree>();
        DBObject query = new BasicDBObject("PID",father.getId());
        DBCursor dbCursor = collection.find(query);
        while (dbCursor.hasNext()) {
            BasicDBObject bdbObj = (BasicDBObject) dbCursor.next();
            if (dbCursor != null) {
                Tree tree = new Tree();
                Integer ID = bdbObj.getInt("ID");
                Integer PID = bdbObj.getInt("PID");
                String NAME = bdbObj.getString("NAME");
                String URL = bdbObj.getString("URL");
                Integer GRADE = bdbObj.getInt("GRADE");
                tree.setId(ID);
                tree.setpId(PID);
                tree.setName(NAME);
                tree.setUrl(URL);
                tree.setGrade(GRADE);
                sonlist.add(tree);
            }
        }
        System.out.println("sonlist:"+sonlist);
        if(sonlist != null){
            father.setSonlist(sonlist);
            for(int b = 0 ; b < sonlist.size(); b ++){
                sonList(sonlist.get(b));
            }
        }
        return null;
    }
}
