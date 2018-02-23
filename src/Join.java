import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yeogi.jspweb.dao.MemberDao;
import com.yeogi.jspweb.dao.jdbc.JdbcMemberDao;


@WebServlet("/join")
public class Join extends HttpServlet {



	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		OutputStream os = response.getOutputStream();
		//PrintStream out = new PrintStream(os);
		PrintWriter out = new PrintWriter(os);

	    out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
	    out.write("<html>\r\n");
	    out.write("<head>\r\n");
	    out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
	    out.write("<title>Insert title here</title>\r\n");
	    out.write("<link href = \"../CSS/style.css\" type =\"text/css\" rel =\"stylesheet\" />\r\n");
	    out.write("</head>\r\n");
	    out.write("\r\n");
	    out.write("\r\n");
	    out.write("<body>\r\n");
	    out.write("<!-- 제목 목록 표 문장 폼 -->\r\n");
	    out.write("\t\t<header id = \"header\">\r\n");
	    out.write("\t\t\t<div class=\"root-container\">\r\n");
	    out.write("\t\t\t<a href= \"../main/main.html\"><h1 id=\"logo\"><img src =\"../resources/logo.png\" height=\"65px\" alt =\"여기\" /> </h1></a>\r\n");
	    out.write("\t\r\n");
	    out.write("\t\t\t<section>\r\n");
	    out.write("\t\t\t\t<h1 class=\"hidden\">헤더</h1>\r\n");
	    out.write("\t\t\t\t\r\n");
	    out.write("\t\t\t\t<nav class=\"hor-menu main-menu first-pad-none\">\r\n");
	    out.write("\t\t\t\t\t<h1>메인메뉴</h1>\r\n");
	    out.write("\t\t\t\t\t<ul>\r\n");
	    out.write("\t\t\t\t\t\t<li><a href=\"\">계획하기</a></li>\r\n");
	    out.write("\t\t\t\t\t\t<li><a href=\"member/story/write/main.jsp\">기록하기</a></li>\r\n");
	    out.write("\t\t\t\t\t\t<li><a href=\"public-board/travel-log/log-main/log-main.html\">여행기</a></li>\r\n");
	    out.write("\t\t\t\t\t\t<li><a href=\"\">커뮤니티</a></li>\r\n");
	    out.write("\t\t\t\t\t</ul>\r\n");
	    out.write("\t\t\t\t</nav>\r\n");
	    out.write("\r\n");
	    out.write("\t\t\t\t<nav class =\"hor-menu member-menu first-pad-none\" style =\"margin-bottom:15px\">\r\n");
	    out.write("\t\t\t\t\t<h1>회원 메뉴</h1>\r\n");
	    out.write("\t\t\t\t\t<ul>\r\n");
	    out.write("\t\t\t\t\t\t<li><a href= \"log-in.html\">로그인</a></li> \r\n");
	    out.write("\t\t\t\t\t\t<li><a href= \"join.html\">회원가입</a></li>\r\n");
	    out.write("\t\t\t\t\t\t<li><a href =\"member/mypage/mypage.html\" class =\"btn btn-mypage\">마이페이지</a></li>\r\n");
	    out.write("\t\t\t\t\t</ul>\r\n");
	    out.write("\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t</nav>\t\r\n");
	    out.write("\t\t\t\t\r\n");
	    out.write("\t\t\t\r\n");
	    out.write("\t\t\t</section> \r\n");
	    out.write("\t\t\t\r\n");
	    out.write("\t\t</div>\r\n");
	    out.write("\t\t\r\n");
	    out.write("\t</header>\r\n");
	    out.write("\t\r\n");
	    out.write("\t<!-- Visual 부분 시작 -->\r\n");
	    out.write("\t<div id = \"visual2\">\r\n");
	    out.write("\t\t<div class=\"root-container\">\r\n");
	    out.write("\t\t\t<div class =\"big-loca\">\r\n");
	    out.write("\t\t\t</div>\r\n");
	    out.write("\t\t</div>\r\n");
	    out.write("\t</div>\r\n");
	    out.write("\t\r\n");
	    out.write("\t<div id = \"body\">\r\n");
	    out.write("\t\t<div class=\"root-container\" > <!-- 따옴표 안에 clear-fix --> \r\n");
	    out.write("\t\t\t\r\n");
	    out.write("\t\t\t<!-- main 시작-------------------------------------------------------------------------------------------------------------- --> \r\n");
	    out.write("\t\t\r\n");
	    out.write("\t\t\t\t<section id =\"main\">\r\n");
	    out.write("\r\n");
	    out.write("\t\t\t\t<section>\r\n");
	    out.write("\t\t\t\t\t\t<div class=\"title\">\r\n");
	    out.write("\t\t\t\t\t\t\t여기의 회원이 되어보세요!\r\n");
	    out.write("\t\t\t\t\t\t</div>\r\n");
	    out.write("\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t<form class=\"join\"  action=\"join\">\r\n");
	    out.write("\t\r\n");
	    out.write("\t\t\t\t\t\t\t<fieldset class=\"join\">\r\n");
	    out.write("\t\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t\t<legend class=\"hidden\">검색필드</legend>\r\n");
	    out.write("\r\n");
	    out.write("\t\t\t\t\t\t\t\t<div class=\"join-label\">\r\n");
	    out.write("\t\t\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<label>아이디</label>&ensp;&nbsp;\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<input type =\"text\" name=\"id\"/>&nbsp;<input class=\"btn btn-cancel\" type =\"submit\" value =\"중복확인\" name=\"btn\" method=\"post\"/>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<label>비밀번호</label>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<input type =\"password\"/><br><br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&nbsp;<input type =\"password\" placeholder=\"비밀번호 확인\"/> \r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<label>이메일</label>&ensp;&nbsp;\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<input type =\"text\"/>&nbsp;<input class=\"btn btn-cancel\" type =\"submit\" value =\"중복확인\"/>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<label>별명</label>&ensp;&ensp;&ensp;&nbsp;\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<input type =\"text\"/>&nbsp;<input class=\"btn btn-cancel\" type =\"submit\" value =\"중복확인\"/>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<label>전화번호</label>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<input type =\"number\" style =\"width:40px\" />-<input type =\"number\" style =\"width:60px\"/>-<input type =\"number\" style =\"width:40px\"/>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<label>생년월일</label>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<input type =\"date\" /><br><br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t\t\t</div>\r\n");
	    out.write("\t\t\t\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t\t\t<input class=\"btn btn-important join-btn\" type =\"submit\" value =\"회원가입\"/>\r\n");
	    out.write("\t\t\t\t\t\t\t\t<input class=\"btn btn-cancel\" type =\"submit\" value =\"가입취소\"/>\r\n");
	    out.write("\r\n");
	    out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
	    out.write("\t\t\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t\t</form>\r\n");
	    out.write("\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t</section>\r\n");
	    out.write("\t\t\t\t\r\n");
	    out.write("\t \t\t</section> \r\n");
	    out.write("\r\n");
	    out.write("\t\t</div>\r\n");
	    out.write("\t\t\r\n");
	    out.write("\t</div>\r\n");
	    out.write("\r\n");
	    out.write("\t<!-- footer 시작------------------------------------------------------------------------------------------------------------ --> \r\n");
	    out.write("\t\r\n");
	    out.write("\t<footer id = \"footer\">\r\n");
	    out.write("\t\r\n");
	    out.write("\t\t<div class=\"root-container\">\r\n");
	    out.write("\t\t\t\t\r\n");
	    out.write("\t\t\t\t<div id = \"footer_logo\">\r\n");
	    out.write("\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t<div id = \"footer_bar\">\r\n");
	    out.write("\t\t\t\t\r\n");
	    out.write("\t\t\t\t\t</div>\r\n");
	    out.write("\t\t\t\t\t\r\n");
	    out.write("\t\t\t\t</div>\r\n");
	    out.write("\r\n");
	    out.write("\t\t\t\t회사정보\r\n");
	    out.write("\t\t\t\t서울특별시 마포구 월드컵북로 21 풍성빌딩 2, 3, 4층 쌍용강북교육센터 <br>\r\n");
	    out.write("\t\t\t\tTel 02)000-0000 | Fax 02)000-0000<br>\r\n");
	    out.write("\t\t\t\t사업자번호 : 000-00-00000 | 제작 : 여행자들 | 개인정보처리관리책임자 : 김땡땡\r\n");
	    out.write("\t\t\t\t<br><br>\r\n");
	    out.write("\t\t\t\tCopyright (C) 2018 Travelers , ALL Right Reserved \r\n");
	    out.write("\r\n");
	    out.write("\r\n");
	    out.write("\t\t</div>\r\n");
	    out.write("\t\t\r\n");
	    out.write("\t</footer>\r\n");
	    out.write("</body>\r\n");
	    out.write("\r\n");
	    out.write("\r\n");
	    out.write("</html>\r\n");
	    out.write("\r\n");

	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		JdbcMemberDao member = new JdbcMemberDao();
		
		String btn = "btn";
		String btn_ = request.getParameter("btn");
	
		if(btn_ != null && !btn_.equals(""))
			btn = btn_;
	

			try {
				member.insertMember(request.getParameter("id"));
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
