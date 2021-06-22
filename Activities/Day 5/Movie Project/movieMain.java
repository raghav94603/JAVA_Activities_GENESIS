import com.ltts.mdao.*;
import com.ltts.movieclass.*;
import com.ltts.configure.*;


import java.util.*;
import java.util.Date;
import java.awt.image.SampleModel;
import java.lang.*;
import java.sql.*;
//import java.sql.Date;
import java.text.*;
import java.sql.*;
public class movieMain {

	public static void main(String[] args)throws Exception,SQLException,ParseException {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("!*!*! Welcome To Movie Manager *!*!*!");
		
		System.out.println("1.INSERT DATA\n2.VIEW DATA\n3.DELETE DATA\n4.UPDATE DATA\n5.VIEW DATA BY MOVIEID\nEnter Your Choice:");
		int choice=s.nextInt();
		Date date,date1;
		//Date d=new java.sql.Date(date.getTime());
		
		switch (choice) {
		case 1:
			
			System.out.println("Enter MovieID:");
			int id=s.nextInt();
			
			System.out.println("Enter Movie name:");
			String name=s.next();
			
			System.out.println("Enter Hero Name:");
			String hero=s.next();
			
			System.out.println("Enter Heroine name:");
			String heroine=s.next();
			
			System.out.println("Enter Releasedate:");
			String ss;
			ss=s.next();
			SimpleDateFormat formatter;
			//Date convertedDate;
		    formatter= new SimpleDateFormat("YYYY-MM-DD");
			date =formatter.parse(ss);
			
			
			System.out.println("Enter Movie Language:");
			String lang=s.next();
			
			System.out.println("Enter Movie Length:");
			int length=s.nextInt();
			
			System.out.println("Enter Movie Type:");
			String type=s.next();
			
			System.out.println("Enter Production ID:");
			int pid=s.nextInt();
			
			movie m=new movie(id,name,hero,heroine,date,lang,length,type,pid);
		    movieDao md=new movieDao();
		    
		    md.insertdata(m);
		
			break;

			
			
		case 2: 
		movieDao md1=new movieDao();
        List<movie> li=md1.getAllMovie();
        for(movie m1:li) {
        System.out.println(m1);
        }
        break;
		
		case 3:
			movieDao md3=new movieDao();
            System.out.println("Enter MovieID of movie to be deleted:");
            int i=s.nextInt();
            boolean b=md3.deletedata(i);
            break;
           
		case 4:    
		System.out.println("Enter MovieID of movie to be updated:");
		int id1=s.nextInt();
		
		System.out.println("Enter Movie name to be updated :");
		String name1=s.next();
		
		System.out.println("Enter Hero Name to be updated :");
		String hero1=s.next();
		
		System.out.println("Enter Heroine name to be updated:");
		String heroine1=s.next();
		
		System.out.println("Enter Releasedate to be updated:");
		String da=s.next();
		SimpleDateFormat formatter2=new SimpleDateFormat("YYYY-MM-DD");
		date1=formatter2.parse(da);
		
		System.out.println("Enter Movie Language to be updated:");
		String lang1=s.next();
		
		System.out.println("Enter Movie Length to be updated:");
		int length1=s.nextInt();
		
		System.out.println("Enter Movie Type to be updated:");
		String type1=s.next();
		
		System.out.println("Enter Production ID to be updated:");
		int pid1=s.nextInt();
		
		movie m2=new movie(id1,name1,hero1,heroine1,date1,lang1,length1,type1,pid1);
	    movieDao md2=new movieDao();
	    
	    md2.updatedata(m2);
	    
	    
	    break;
	    
		case 5:     
		System.out.println("Enter MovieID of movie to be viewed:");
		int id3=s.nextInt();
		 movieDao md4=new movieDao();
		 md4.getMovieById(id3);
		 break;
		default:
			break;
		}
	}

}
