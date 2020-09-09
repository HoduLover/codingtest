package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
 
 
public class Test04 {
     
     
    public static void main(String[] args) throws IOException, ParseException {
    	
    	// 1. 파일 쓰기
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
    	
    	String colName = "No,Name,Birthy,Nationality,Address,Fromer Workplace,Department\n";
        String row1 = "1,Robert Kim,1995.02.01,American,Seoul,Polytech System,Planning(12)\n" ;
        String row2 = "2,Kildong Hong,1997.03.12,American,Seoul,Polytech Edu,HR(10)\n" ;
        String row3 = "3,Kildong Hong,1997.03.12,American,Busan,Polytech Music,HR(10)\n" ;
        String row4 = "4,Kildong Hong,1997.03.12,Korean,Busan,Polytech Music,HR(10)\n" ;
        String row5 = "5,Minhee Lee,1990.05.09,Korean,Busan,Polytech Edu.,R&D(11)\n" ;
        String row6 = "6,Minhee Lee,1993.09.30,Korean,Daegu,Polytech Machine,Sales(13)\n" ;
         
        String fileName = "D:\\download\\OneDrive - 중앙대학교\\2. 과제\\과제\\1. 코딩테스트\\4일차test4.txt" ;
 
        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName, false));
         
        // 파일안에 문자열 쓰기
        fw.write(colName);
        fw.write(row1);
        fw.write(row2);
        fw.write(row3);
        fw.write(row4);
        fw.write(row5);
        fw.write(row6);
        
        fw.flush();
 
        // 객체 닫기
        fw.close();
             
        // 2. 파일 읽기
        // 열들을 담을 list 초기화
    	List<Member> list = new ArrayList<Member>();
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String str;
        
        in.readLine(); // 첫 번째 열(컬럼값)은 없앤다.
        
        while((str = in.readLine()) != null){
        	String[] split1 = str.split(","); // ,로 구분한 각 데이터 값
        	String[] split2 = split1[1].split(" "); // Last Name만을 위해 split
        	String[] split3 = split1[6].split("\\("); // 부서의 숫자값만 빼기 위에 split
        	
        	int no = Integer.parseInt(split1[0]);
        	String lastName = split2[0];
        	Date date = sdf.parse(split1[2]);
        	String dp = split3[1].replace(")", "").trim();
        	
        	// 정제한 데이터 값을 Member라는 객체 담는다. 
            list.add(new Member(no, lastName, date,split1[3],split1[4],dp));
    
        }
       
        
        // 4. 정렬 하기
        Collections.sort(list);
        
        
        // 5. 파일 쓰기
        String fileName2 = "D:\\download\\OneDrive - 중앙대학교\\2. 과제\\과제\\1. 코딩테스트\\4일차test4_2.txt" ;
      
        BufferedWriter fw2 = new BufferedWriter(new FileWriter(fileName2, false));
        StringBuffer sb = new StringBuffer();
        String result = "";
        
        // 컬럼을 써주고
        String col = "No Name ID\n";
        fw2.write(col);
        
        // 정렬한 list를 하나씩 꺼내서 문자열로 만든 뒤 파일에 쓴다.
        for (int i = 0; i < list.size(); i++) {
			result = sb.append(list.get(i).getNo()).append(" ")
			.append(list.get(i).getName()).append(" ").append("2020-")
			.append(list.get(i).getDepartment()).append("00").append(i).append("\n").toString();
			
			 fw2.write(result);
			 sb.setLength(0);
		}
        
        fw2.flush();
 
        // 객체 닫기
        fw2.close();
        
    }
}

// 3. 정렬을 위한 객체 Member
class Member implements Comparable<Member> {
	int no;
	String name;
	Date birth;
	String nation;
	String addr;
	String department;
	
	public Member() {
		
	}
	
	public Member(int no, String name, Date birth, String nation, String addr, String department) {
		super();
		this.no = no;
		this.name = name;
		this.birth = birth;
		this.nation = nation;
		this.addr = addr;
		this.department = department;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	// compareTo를 오버라이드 하여 정렬한다. 
	@Override
	public int compareTo(Member mem) {
		Integer noTemp = new Integer(no);
		
		// 먼저 이름이 같은 것을 정렬 다음으로 생년원일, 번호로 정렬
		if(!name.equals(mem.name)) {
			return name.compareTo(mem.name);
		} else if(!birth.equals(mem.birth)) {
			return birth.compareTo(mem.birth);
		} else {
			return noTemp.compareTo(mem.no);
		}
	}
}




