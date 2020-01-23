import java.sql.*; 
import java.util.*; 

class Main7899
{ 
	public static void main(String args[]) throws Exception
	{ 
                                   Class.forName("oracle.jdbc.driver.OracleDriver");
		//Creating the connection 
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "SYSTEM"; 
		String pass = "9888314151"; 

		//Entering the data 
		Scanner k = new Scanner(System.in); 
		System.out.println("enter name"); 
		String SNAME = k.next(); 
		System.out.println("enter roll no"); 
		int SID = k.nextInt(); 
		System.out.println("enter class"); 
		String cls = k.next(); 

		//Inserting data using SQL query 
		String sql = "insert into STUDENTSOFCHITKARA values('"+SID+"',"+SNAME+"')"; 
		Connection con=null; 
		try
		{ 
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 

			//Reference to connection interface 
			con = DriverManager.getConnection(url,user,pass); 

			Statement st = con.createStatement(); 
			int m = st.executeUpdate(sql); 
			if (m == 1) 
				System.out.println("inserted successfully : "+sql); 
			else
				System.out.println("insertion failed"); 
			con.close(); 
		} 
		catch(Exception ex) 
		{ 
			System.err.println(ex); 
		} 
	} 
} 
