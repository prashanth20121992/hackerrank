package hackerrank;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Date;
public class SherlockAndAnagram {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String cunvertCurrentDate="2015-10-15";
        java.util.Date dateOfBirth = df.parse(cunvertCurrentDate);
        java.sql.Date sql = new java.sql.Date(dateOfBirth.getTime());
        System.out.println("dateOfBirth==>"+sql);
	}
}

