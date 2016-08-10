package objectDesignAssignment;

public class SingleFamilyHouse extends Residence {

		public int fullBathrooms = 0;
		public int halfBathrooms = 0;
		public int floors = 1;
		public int windows = 0;
		public int bedrooms = 0;
		public int backyardSqFt = 0;
		public int parkingSpaces = 0;
		public int yearBuilt = 0;
		public String outsideColor = null;
		public String insideColor = null;
		
		public SingleFamilyHouse(int fullBathrooms, int halfBathrooms, int floors, int windows, int bedrooms,
				int backyardSqFt, int parkingSpaces, int yearBuilt, String outsideColor, String insideColor) {
			super();
			this.fullBathrooms = fullBathrooms;
			this.halfBathrooms = halfBathrooms;
			this.floors = floors;
			this.windows = windows;
			this.bedrooms = bedrooms;
			this.backyardSqFt = backyardSqFt;
			this.parkingSpaces = parkingSpaces;
			this.yearBuilt = yearBuilt;
			this.outsideColor = outsideColor;
			this.insideColor = insideColor;
		}
		
		public SingleFamilyHouse() {
			super();
		}


		public int getFullBathrooms() {
			return fullBathrooms;
		}

		public void setFullBathrooms(int fullBathrooms) {
			this.fullBathrooms = fullBathrooms;
		}

		public int getHalfBathrooms() {
			return halfBathrooms;
		}

		public void setHalfBathrooms(int halfBathrooms) {
			this.halfBathrooms = halfBathrooms;
		}

		public int getFloors() {
			return floors;
		}

		public void setFloors(int floors) {
			this.floors = floors;
		}

		public int getWindows() {
			return windows;
		}

		public void setWindows(int windows) {
			this.windows = windows;
		}

		public int getBedrooms() {
			return bedrooms;
		}

		public void setBedrooms(int bedrooms) {
			this.bedrooms = bedrooms;
		}

		public int getBackyardSqFt() {
			return backyardSqFt;
		}

		public void setBackyardSqFt(int backyardSqFt) {
			this.backyardSqFt = backyardSqFt;
		}

		public int getParkingSpaces() {
			return parkingSpaces;
		}

		public void setParkingSpaces(int parkingSpaces) {
			this.parkingSpaces = parkingSpaces;
		}

		public int getYearBuilt() {
			return yearBuilt;
		}

		public void setYearBuilt(int yearBuilt) {
			this.yearBuilt = yearBuilt;
		}

		public String getOutsideColor() {
			return outsideColor;
		}

		public void setOutsideColor(String outsideColor) {
			this.outsideColor = outsideColor;
		}

		public String getInsideColor() {
			return insideColor;
		}

		public void setInsideColor(String insideColor) {
			this.insideColor = insideColor;
		}

		@Override
		public void hasRoof() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void hasWalls() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String toString() {
			
			
					
			return "Just to confirm, you are interested in a single family house with " + fullBathrooms + " full baths and " + halfBathrooms + " half baths." + "\n" + "The required home is "
					+ floors + " stories tall and has " + windows + "windows. There are " + bedrooms + " bedroom and the outside feature a backyard of " + backyardSqFt 
					+ " square feet." + "\n" + "There is enough parking for " + parkingSpaces + " vehicles. And this home was build after " + yearBuilt + ".";
		}
		
		
		
		
		
}