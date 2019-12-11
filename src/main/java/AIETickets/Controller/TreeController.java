package AIETickets.Controller;

import AIETickets.Model.Tree;
import AIETickets.Util.JsonUtil;
import AIETickets.service.TreeService;
import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("tree")
public class TreeController {

	private final TreeService treeService;
	public TreeController(TreeService treeService) {
		this.treeService = treeService;
	}

//	@Autowired
//	private TreeService treeService;

	@RequestMapping("menu")
	@ResponseBody
	public void menuList1(HttpServletRequest requset,HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		PrintWriter pw = response.getWriter();
//		List<Tree> list = treeService.list();
		MongoClient client = new MongoClient("192.168.1.109",27017);
		DB db = client.getDB("BTW_MU_AI");
		DBCollection collection = db.getCollection("AI_TREE");
		DBObject query = new BasicDBObject("GRADE", 1);
		DBCursor dbCursor = collection.find(query);
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
			}
		}
		for(int a = 0 ; a<treeList.size();a++){
			sonList(treeList.get(a));
		}
		String rowsJson = JsonUtil.list2json(treeList);
		String json = "{\"rows\":" + rowsJson + "}";
		pw.print(json);
	  }

	  public List<Tree> sonList(Tree father){
//		  List<Tree> sonlist = treeService.sonList(father.getId());
		  MongoClient client = new MongoClient("192.168.1.109",27017);
		  DB db = client.getDB("BTW_MU_AI");
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
		  if(sonlist != null){
			  father.setSonlist(sonlist);
			  for(int b = 0 ; b < sonlist.size(); b ++){
				  sonList(sonlist.get(b));
			  }
		  }
		  return null;
	  }
}
