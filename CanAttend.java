import java.util.ArrayList;

public class CanAttend {

	//precondition: An ArrayList of MeetingInterval objects is the input. For each object, a start time and end time must be a non-negative integer.
	//postcondition: Returns true if a person can attend all meetings in the list and false if there is a conflict in the schedule.
	//Conflicts occur if meeting times overlap.
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		//your implementation here
		System.out.println(meetings);

		for(int i = 0; i < meetings.size(); i++)
		{
			for (int j = i + 1; j < meetings.size(); j++)
			{
				if (meetings.get(i).getStart() < meetings.get(j).getEnd() && meetings.get(j).getStart() < meetings.get(i).getEnd())
				{
					return false;	
				}
			}
		}
		return true; //replace me with actual logic please!
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
		meet.clear();
		meet.add(new MeetingInterval(0, 30));
		meet.add(new MeetingInterval(80, 1000));
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
	}
}

