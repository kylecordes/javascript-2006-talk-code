/*
 * Sample code from a user group talk:
 * Direct Manipulation with Swing
 * 
 * Copyright 2005 Kyle Cordes
 * http://kylecordes.com
 * http://oasisdigital.com
 *
 * Feel free to mine this for ideas and snippets for your own projects.
 */
package scripttalk.rhino;

import java.util.Random;

public class RandomData {

	private static Random rand = new Random();

	public static String makeName() {
		return firstNames[rand.nextInt(firstNames.length)] + " "
				+ lastNames[rand.nextInt(lastNames.length)];
	}

	public static String makeAddress() {
		return "" + rand.nextInt(10000) + " "
				+ streetNames[rand.nextInt(streetNames.length)];
	}

	private static String[] lastNames = { "Abrew", "ACKERMAN", "ACTON",
			"Adams", "ADAMS", "Agresto", "Aguilar", "Albertson", "Allen",
			"Alverman", "Alvila", "AMMANN", "Andrews", "ANDREWS", "ARAGON",
			"Ashley", "Ashwell", "Auston", "AUTOBEE", "BACA", "bailey",
			"Bailey", "Baiton", "Baker", "Baldwin", "Banks", "Barefoot",
			"Barela", "Bares", "Baresinkoff", "Barger", "Barnes", "Barreras",
			"BARTLETT", "bass", "BAUER", "Beasley", "Beaumont", "Beckel",
			"Bedry", "Belanger", "BELL", "Bencomo", "Benner", "Bennett",
			"BENNETT", "bentley", "Bergeron", "Bergman", "Besharah", "Betbeze",
			"Bieganek", "Bird", "Blackmon", "BLAKE", "Bland", "Bohac", "boles",
			"Bolin", "Bolton", "BOLTZ", "bond", "Bone", "BONNER", "Boothe",
			"Bourque", "Boutet", "boyd", "Boyd", "Boykin", "Bradford",
			"BRASHER", "Bratton", "Braun", "Bray", "Breeding", "BREEDS",
			"Brewer", "Brickle", "Brinson", "BRISTOL", "Brochue", "Brooks",
			"Brown", "BROWN", "Browne", "Bruan", "Bruneau", "Bryan", "Buckler",
			"Buckner", "Budd", "Burk", "BURNETT", "BURNS", "bush", "BUTLER",
			"Buttrum", "Bynes", "Cabello", "Caird", "Callan", "CAMPBELL",
			"Cantu", "Carithers", "Carlisle", "Carlson", "Carreon", "Carrillo",
			"Carter", "Casey", "Cassell", "CASSITY", "Caterina", "CHADWICK",
			"Chaney", "CHAPMAN", "Chase", "Chastain", "Chavez", "CHAVEZ",
			"Chavis", "Chinn", "Ciarla", "Cisneros", "Clabough", "Clarke",
			"Cleary", "Clemons", "Clifton", "COBBS", "COLE", "COOK", "COONTZ",
			"Cope", "COPELAND", "Corkin", "Couch", "Courson", "COX", "Cragg",
			"crain", "crowder", "Currie", "Curry", "Davey", "Davidson",
			"davis", "Davis", "DAVIS", "Deavers", "DELFS", "Deliva", "Demel",
			"Denney", "Der", "Desroches", "Diaz", "Dickinson", "dillon",
			"Dixson", "DONOVAN", "Douglas", "Doyle", "DREW", "Duffey",
			"Duford", "Duggins", "durham", "DWYER", "Dyck", "Dye", "Dyson",
			"Dzatko", "Earlwine", "EARNST", "eastman", "Echols", "Edge",
			"Edwards", "Elliott", "Ellis", "ELLS", "ELM", "EMERY",
			"Englebright", "Erdos", "Fairbanks", "Fambro", "Ferguson",
			"Fields", "Finch", "Fire", "Fisher", "Fletcher", "Fliss", "Florio",
			"FLORIO", "Flowers", "Fogarty", "Fogle", "Forster", "Fortunato",
			"Fortune", "FRANKLIN", "Frayne", "FRAZIER", "Frazzini", "Frost",
			"GA", "GAINES", "Galick", "GALLEGOS", "Gallivan", "Garcia",
			"Garge", "Garlow", "Garner", "GARRETSON" };

	private static String[] firstNames = { "Lisa", "LONNY", "Lorenzo", "LORI",
			"Lorne", "Luis", "Mags", "Malcolm", "Mandie", "Marcus", "Mardy",
			"MARIO", "Mark", "MARK", "Marsha", "Martin", "Marty", "Marvin",
			"Mary", "MARY", "Matt", "matthew", "Matthew", "Maurice", "MELANI",
			"Melinda", "Melissa", "MELISSA", "Melodie", "Melton", "Melvin",
			"Michael", "MICHAEL", "Michelle", "mike", "Mike", "MIKE", "Mireya",
			"Morris", "multi", "MYRON", "Natasha", "Nate", "NATE", "NATHAN",
			"Nestor", "Nick", "Nira", "NORMAN", "Oscar", "Owen", "PATRICK",
			"Paul", "PAUL", "Peggy", "PETER", "Phillip", "Quinton", "Rachelle",
			"RAMIRO", "Randy", "Ray", "Raymond", "Regina", "Renee", "Rhonald",
			"Richard", "RICK", "Ricky", "Rob", "Robert", "ROBERT", "ROBIN",
			"Rocky", "Rodney", "ROGER", "Ronnie", "ROSIE", "ROWDY", "Roxanne",
			"Roy", "Russell", "Ryan", "RYAN", "SANDRA", "Sandy", "Sarah",
			"Scott", "Sean", "Shane", "Shannon", "Sharon", "Shaun", "Shawn",
			"Sherri", "Shirley", "Sidney", "Sondra", "Sonja" };

	static String[] streetNames = { "3rd Street", "5th  & Hunt Street",
			"91-325 Komohana St.", "Airport Rd", "Airport Way", "Allanburg Rd",
			"AMERICAN RD", "Anderson Ave.", "Ardmore Dr.", "Azalea Drive",
			"BALFOUR", "Bay Park Road", "Beaver Channel Parkway",
			"Bermuda Hundred", "BIRCH HILL RD", "Bird Street", "Bosworth St",
			"Breckenridge Ind. Ct.", "Brent Lane Suite A", "Brian Way",
			"Briar Rose", "Bridge St.", "Bridge Street", "Brush Wellman Road",
			"Burning Bush Drive", "Burnt Mill Dr.", "CAHABA VALLEY CIRCLE",
			"Cahaba Valley Circle", "Cantwell Lane", "Centennial Boulevard",
			"Cherry Oak", "Chesterdale Rd.", "Chestnut Street",
			"Church Street Extension", "CLINTON ST. NORTH",
			"Columbia Southern Road", "Commerce Way", "COMMODORE RD",
			"Cook St", "County Road G", "COVINGTON COVE", "Cranwood Dr",
			"Crosby Eastgate Road", "Crown Point Rd.", "Crown Point Road",
			"Cureton Ferry Road", "Decker Drive", "Deepwater Terminal Road",
			"Dickey Road", "Don Lou Dr.", "DON LUE DR.", "Don Mills Rd",
			"E. 27th St.", "E. Beltway 8", "E. Chandler Rd.",
			"E. Chandler Road", "E. Garfeild", "E. GARFIELD", "E. Market St.",
			"East 1st Avenue", "East Hawthorne Ave.", "East Superior St",
			"East University", "EAston Drive", "Evett St", "Evett Street",
			"Export Drive", "EXXON REFINERY ROAD", "FM 1960 W", "Ford Ave.",
			"FRANCES AVE", "French Road", "Game Farm Road", "Garwin Road",
			"Girard St.", "Goldenwood Drive", "Grant Road", "Haden Road",
			"Harrison Street", "Hatcher Lake Rd", "Hess Plaza",
			"Highway 332 East", "Highway 52  North", "Hillsboro Ave.",
			"Horseshoe Lake Rd", "Huish Road", "Hwy 120", "Hwy 405",
			"Hwy 57 E", "Indiana Ave.", "Industrial Drive",
			"Industrial Park Road", "Kaster Road", "Kenrick", "Lafayette Ave",
			"Lakeland Rd.", "Lemay Ferry Rd", "Lemay Ferry Road", "Lupine St",
			"MADISON RD.", "Main St.", "Main Street", "Market Street",
			"Mayfeild", "Meany Ave", "Michigan Street", "Midway Road",
			"Mococo Road", "Montridge Dr.", "N. Tabler Rd.", "Natchez Mill",
			"Navigation Blvd.", "Newark Atlantic", "Nicholas Road",
			"North Industrail Rd", "North Lamar", "North Lindbergh",
			"North State Road", "Old Bloomington Rd", "Old Town Mill",
			"Patterson", "Pea Ridge Road", "Pearl Street", "Pierce",
			"Pilgrim Station", "Pinemont Dr.", "Portland Street", "Portlland",
			"Possumtown Rd.", "PROFESSIONAL BLVD", "PUTNAM STREET",
			"Reichold Rd", "RIVER AVE", "River Ave.", "River Ave. Bld. 3A",
			"River Lane", "Riverview St", "Route 17", "Rt. 37", "S 300 W",
			"S Hwy 94", "S. 1100 W.", "S. 47th Street", "S. Broadway",
			"S.W. 107th Place", "Satellite Blvd.", "Savi Ranch Parkway",
			"Shop", "South 300 West", "South 3rd Street",
			"South Broadacres Road", "South Commerce St",
			"South Somerton Avenue", "South Union", "SOUTH WATER ST",
			"Southfield Rd Cut Off", "Southwest Mcadam Avenue",
			"St. Andrews Road", "State Rte. 2 North", "Stavanger Drive",
			"Stoneham Lane", "Sweetwater", "Tanglewilde", "Tasewell",
			"TEAL ST", "Townson Rd.", "TUSSENDO DRIVE", "Valley Forge Mill",
			"VANCOUVER MILL", "Viscount", "W 25th St", "W. 51 Street",
			"W. Jefferson", "Washington Street", "West 12th St",
			"West 2100 South", "West 21st St", "West 34th St",
			"West 47th Street", "West 4th St", "West 6400 North",
			"WEST 9320 ST.", "West Chester Pike", "West DuPont Road",
			"West El Segundo Blvd.", "West Lake Meade Dr.",
			"West Liittle York", "West Main", "West Park Drive",
			"West Walnut St.", "Westchester Pike", "Westheimer",
			"Whitesbridge Rd", "Wilbur Avenue", "Williams Street",
			"Yulee Drive" };

}
