package AIETickets.service;

import AIETickets.dao.TreeDao;
import AIETickets.Model.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeService {

	
	 private final TreeDao treeDao;

	public TreeService(TreeDao treeDao) {
		this.treeDao = treeDao;
	}

	public List<Tree> list()
	  {
		List<Tree> list = this.treeDao.list();
	    return list;
	  }

	  public List<Tree> sonList(Integer pId) {
		  List<Tree> list = this.treeDao.sonList(pId);
	    return list;
	  }

	  public List<Tree> treeTist()
	  {
		  List<Tree> list = this.treeDao.list();
	      System.out.println("----TreeList------" + list);
	      for (int a = 0; a < list.size(); a++) {
	      sonList(list.get(a));
	      System.out.println("11111111111111111");
	    }
	    return list;
	  }

	  public List<Tree> listRole(Integer role)
	  {
		  List<Tree> list = treeDao.listRole(role);
	    System.out.println("ROLE++++++++++++++++++++++++" + list);

	    for (int a = 0; a < list.size(); a++) {
	      sonRoleList(list.get(a), role);
	      System.out.println("11111111111111111");
	    }
	    return list;
	  }

	  public List<Tree> sonList(Tree father)
	  {
		  List<Tree> sonlist = this.treeDao.sonList(father.getId());
	    if (sonlist != null) {
	      father.setSonlist(sonlist);
	      for (int b = 0; b < sonlist.size(); b++) {
	        System.out.println("------------------b=" + b + "-----------------" + sonlist.get(b));
	        sonList(sonlist.get(b));
	      }
	    }
	    return null;
	  }

	  public List<Tree> sonRoleList(Tree father, Integer role) {
		  List<Tree> sonlist = treeDao.sonRoleList(father.getId(), role);
	      if (sonlist != null) {
	      father.setSonlist(sonlist);
	      for (int b = 0; b < sonlist.size(); b++) {
	      System.out.println("------------------b=" + b + "-----------------" + sonlist.get(b));
	      sonRoleList(sonlist.get(b), role);
	      }
	    }
	    return null;
	  }
}
