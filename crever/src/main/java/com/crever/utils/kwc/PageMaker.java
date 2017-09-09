package com.crever.utils.kwc;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

//이 클래스는 리스트의 하단에 나오는 prev next 버튼을 만들기 위해 제작된 클래스
public class PageMaker {
	private int totalCount;
/*전체 데이터의 개수 끝페이지 번호를 계산할때 전체 데이터의 개수를 이용해서 최종적으로 끝페이지의 번호가 결정된다
 * 만일 끝페이지 번호보다 많은 양의 데이터가 존재
 * 할때는 뒤로 갈 수 있는 링크가 추가로 붙게 되야한다.
 */	
	private int startPage;
/*예를 들어 홤ㄴ상에 10개의 페이지 번호를 출력한다고 했을시 현재 페이지가 1에서
 * 10의 사이에있는 번호라면??
 * 시ㄱ작 페이지는 1이 되어야한다 만일 시작페이지의 번호가 1이 아니라면 이전으로 갈수있는
 * 링크가 제공되야한다
 */	
	private int endPage;
/*시작 페이지 번호부터 몇개의 번호를 보여줘야하는 결정해야한다
 * 이때 영향을 미치는 것이 전체 데이터의 개수다
 * 예를 들어 전체 데이터가 65개 이고 ㅎ현재 페이지가 5페이지라면 시작페이지
 * 번호는 1이고 끝 페이지 번호는 7(전체가 65개라고 가정)
 * 이라 표시해야한다
 */	
	private boolean prev;
/*맨 앞의 페이지 번호가 1이 아닐때 호면상에 링크를 통해서 이전페이지를 조회할수있어야한다
 */	
	private boolean next;
/*맨뒤의 페이지 이후에 더 많은 데이터가 존재하는 경우 이동이
 * 가능하도록 링크를 제공한다.
 */	
	private int displayPageNum = 10;
	
	private Criteria cri;
	
	

	public void setCri(Criteria cri){
		this.cri = cri;
	}
	
	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
		
		calcData();
	}

	private void calcData() {
	    endPage = (int) (Math.ceil(cri.getPage() / (double) displayPageNum) * displayPageNum);

	    startPage = (endPage - displayPageNum) + 1;

	    int tempEndPage = (int) (Math.ceil(totalCount / (double) cri.getPerPageNum()));

	    if (endPage > tempEndPage) {
	      endPage = tempEndPage;
	    }

	    prev = startPage == 1 ? false : true;

	    next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
	}

	public int getTotalCount() {
	    return totalCount;
	  }

	  public int getStartPage() {
	    return startPage;
	  }

	  public int getEndPage() {
	    return endPage;
	  }

	  public boolean isPrev() {
	    return prev;
	  }

	  public boolean isNext() {
	    return next;
	  }

	  public int getDisplayPageNum() {
	    return displayPageNum;
	  }

	  public Criteria getCri() {
	    return cri;
	  }

	  public String makeQuery(int page) {

		  UriComponents uriComponents =
		            UriComponentsBuilder.newInstance()
		            .queryParam("page", page)
		            .queryParam("perPageNum", cri.getPerPageNum())
		            .build();	            
			
			return uriComponents.toUriString();
	  }
	  
	  public String makeSearch(int page){
		  
		  UriComponents uriComponents = 
				  UriComponentsBuilder.newInstance()
				  .queryParam("page",page)
				  .queryParam("perPageNum",cri.getPerPageNum())
				  .queryParam("searchType",((SearchCriteria)cri).getSearchType())
				  .queryParam("keyword",((SearchCriteria)cri).getKeyword())
				  .build();	
		  return uriComponents.toUriString();
	  }
	
	
}
