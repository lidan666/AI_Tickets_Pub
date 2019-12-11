package AIETickets.dao;

import AIETickets.Util.DataSource;
import AIETickets.Model.Tree;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@DataSource("local")
public interface TreeDao extends GenericDAO<Integer, Tree>{

	 List<Tree> sonList(Integer id);

	 List<Tree> sonRoleList(@Param("pId") Integer id, @Param("role") Integer role);

	 List<Tree> listRole(Integer role);
}
