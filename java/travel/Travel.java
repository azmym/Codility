package travel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Travel {

	public static void main(String args[]) {
		System.out.println(new Travel().solution("photo.jpg, Warsaw, 2013-09-05 14:08:15" + "\n"
				+ "john.png, London, 2015-06-20 15:13:22" + "\n" + "myFriends.png, Warsaw, 2013-09-05 14:07:13" + "\n"
				+ "Eiffel.jpg, Paris, 2015-07-23 08:03:02" + "\n" + "pisatower.jpg, Paris, 2015-07-22 23:59:59" + "\n"
				+ "BOB.jpg, London, 2015-08-05 00:02:03" + "\n" + "notredame.png, Paris, 2015-09-01 12:00:00" + "\n"
				+ "me.jpg, Warsaw, 2013-09-06 15:40:22" + "\n" + "a.png, Warsaw, 2016-02-13 13:33:50" + "\n"
				+ "b.jpg, Warsaw, 2016-01-02 15:12:22" + "\n" + "c.jpg, Warsaw, 2016-01-02 14:34:30" + "\n"
				+ "d.jpg, Warsaw, 2016-01-02 15:15:01" + "\n" + "e.png, Warsaw, 2016-01-02 09:49:09" + "\n"
				+ "f.png, Warsaw, 2016-01-02 10:55:32" + "\n" + "g.jpg, Warsaw, 2016-02-29 22:13:11"));
	}

	public String solution(String S) {

		String[] split = S.split("\n");
		List<Photo> input = new ArrayList<Photo>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			for (int i = 0; i < split.length; i++) {
				Photo photo = new Photo();
				String[] split2 = split[i].split(",");

				photo.setName(split2[0].substring(0, split2[0].indexOf('.')));
				photo.setExtension(split2[0].substring(split2[0].indexOf('.')));
				photo.setCity(split2[1]);
				photo.setCreationDate(formatter.parse(split2[2]));
				input.add(photo);
			}
			
			//get number of groups
			Map<String, List<Photo>> collect = input.stream().collect(Collectors.groupingBy(w -> w.city));
			for (List<Photo> photos : collect.values()) {
				Collections.sort(photos);
				int sizeLength = String.valueOf(photos.size()).length();
				for (int i = 0; i < photos.size(); i++) {
					int si = String.valueOf(i+1).length();
					int counter = sizeLength - si;
					String prefix = "";
					if (counter > 0) {
						prefix = String.format(String.format("%%%ds", counter), " ").replace(" ","0");
					} 
					
					photos.get(i).setPosition(prefix+(i+1)); 	
				}
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		StringJoiner result = new StringJoiner("\n");
		for (Photo photo : input) {
			result.add(photo.toString().trim());
		}
		return result.toString();
	}

	class Photo implements Comparable<Photo>{
		private String name;
		private String city;
		private Date creationDate;
		private String extension;
		private String position;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public String getExtension() {
			return extension;
		}

		public void setExtension(String extension) {
			this.extension = extension;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		@Override
		public int compareTo(Photo o) {
			 return getCreationDate().compareTo(o.getCreationDate());
		}
		
		@Override
		public String toString() {
			return this.city + this.position + this.extension;
		}
	}
}
