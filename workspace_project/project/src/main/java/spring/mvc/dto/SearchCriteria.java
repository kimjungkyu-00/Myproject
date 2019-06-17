package spring.mvc.dto;

public class SearchCriteria extends Criteria{
	
	String searchOption;
	String searchOption1;
	String keyword;
	public String getSearchOption() {
		return searchOption;
	}
	public void setSearchOption(String searchOption) {
		this.searchOption = searchOption;
	}
	public String getSearchOption1() {
		return searchOption1;
	}
	public void setSearchOption1(String searchOption1) {
		this.searchOption1 = searchOption1;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "SearchCriteria [searchOption=" + searchOption + ", searchOption1=" + searchOption1 + ", keyword="
				+ keyword + "]";
	}
	
	

}
