package AIETickets.Model;

import java.util.List;

public class Tree {
	  private Integer Id;
	  private Integer pId;
	  private String name;
	  private String url;
	  private Integer grade;
	  private Tree parent;
	  private List<Tree> sonlist;

	  public Tree getParent()
	  {
	    return this.parent;
	  }

	  public void setParent(Tree parent) {
	    this.parent = parent;
	  }

	  public List<Tree> getSonlist() {
	    return this.sonlist;
	  }

	  public void setSonlist(List<Tree> sonlist) {
	    this.sonlist = sonlist;
	  }

	  public Integer getId() {
	    return this.Id;
	  }

	  public void setId(Integer id) {
	    this.Id = id;
	  }

	  public Integer getpId() {
	    return this.pId;
	  }

	  public void setpId(Integer pId) {
	    this.pId = pId;
	  }

	  public String getName() {
	    return this.name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getUrl() {
	    return this.url;
	  }

	  public void setUrl(String url) {
	    this.url = url;
	  }

	  public Integer getGrade() {
	    return this.grade;
	  }

	  public void setGrade(Integer grade) {
	    this.grade = grade;
	  }

	  @Override
	public String toString()
	  {
	    return "Tree [Id=" + this.Id + ", pId=" + this.pId + ", name=" + this.name + ", url=" + this.url + ", grade=" + this.grade + ", parent=" + 
	      this.parent + ", sonlist=" + this.sonlist + "]";
	  }
}
