<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table {
	width: 400px;
	text-align: center;
}

th {
	background-color: cyan;
}
</style>
<title>성적표</title>
</head>
<body>
    <h1>학생 성적표</h1>
    <table>
        <tr>
            <th>번호</th>
            <th>이름</th>
            <th>국어</th>
            <th>영어</th>
            <th>수학</th>
            <th>총점</th>
            <th>평균</th>
        </tr>
        <%
        Class.forName("oracle.jdbc.driver.OracleDriver");
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from score")) {
            int maxKor = 0;
            int maxEng = 0;
            int maxMath = 0;
            int count = 0;
            float totalAvg = 0.00f;
            int totalKor=0;
            int totalEng=0;
            int totalMath=0;
            
            while (rs.next()) {
                int sum = rs.getInt("kor") + rs.getInt("eng") + rs.getInt("math");
                count++;
                totalKor+=rs.getInt("kor");
                totalEng+=rs.getInt("Eng");
                totalMath+=rs.getInt("Math");
        %>
        <tr>
            <td><%=rs.getInt("num")%></td>
            <td><a href="updateForm.jsp?name=<%=rs.getString("name")%>"><%=rs.getString("name")%></a></td>
            <td><%=rs.getInt("kor")%></td>
            <td><%=rs.getInt("eng")%></td>
            <td><%=rs.getInt("math")%></td>
            <td><%=sum%></td>
            <td><%=String.format("%.2f", (float) sum / 3)%></td>
            <td><button onclick="location.href='delete.jsp?name=<%=rs.getString("name")%>'">기록 삭제</button></td>
        </tr>
        <%  
                maxKor = Math.max(maxKor, rs.getInt("kor"));
                maxEng = Math.max(maxEng, rs.getInt("eng"));
                maxMath = Math.max(maxMath, rs.getInt("math"));
            }
        %>
    </table>
    <button onclick="location.href='insertForm.jsp'">신규 학생 데이터 등록</button></br>

    <h2>과목별 최고 점수</h2>
    <table>
        <tr>
            <th>국어</th>
            <th>영어</th>
            <th>수학</th>
        </tr>
        <tr>
            <th><%=maxKor %></th>
            <th><%=maxEng %></th>
            <th><%=maxMath %></th>
        </tr>
    </table>
    <h2>과목별 평균 점수</h2>
    <table>
        <tr>
            <th>국어</th>
            <th>영어</th>
            <th>수학</th>
        </tr>
        <tr>
            <th><%=totalKor/count %></th>
            <th><%=totalEng/count %></th>
            <th><%=totalMath/count %></th>
        </tr>
    </table>
    <h2>전체 평균 점수</h2>
    <table>
        <tr>
            <th>국어+영어+수학</th>
            <th><%=(totalKor+totalEng+totalMath)/(count*3) %></th>
        </tr>
      
    </table>

    <%  
        } catch (Exception e) {
        e.printStackTrace();
    }
    %>

</body>
</html>