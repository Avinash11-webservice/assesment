package assessment;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Iterator;
	import java.util.List;
	import java.util.TreeSet;

	class Patient implements Comparable<Patient> {

		public Patient(int patientId, String name, int age) {
			super();
			this.patientId = patientId;
			this.name = name;
			this.age = age;
		}

		private int patientId;

		public int getPatientId() {
			return patientId;
		}

		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		private String name;
		int age;

		@Override
		public int compareTo(Patient o) {
			return o.age;
		}

	}

	public class PatientList {
		public static void main(String[] args) {

			ArrayList<Patient> list = new ArrayList<Patient>();
			list.add(new Patient(1, "Naveen", 25));
			list.add(new Patient(2, "Vivek", 26));
			list.add(new Patient(3, "Satyam", 20));
			list.add(new Patient(4, "Sahil", 30));

			List<String> list1 = new ArrayList<String>();
			for (Patient p1 : list) {
				list1.add(p1.getName());
			}
			list1.sort(Comparator.naturalOrder());

			System.out.println(list1);

			List<Integer> ageList = new ArrayList<Integer>();
			for (Patient p1 : list) {
				ageList.add(p1.getAge());
			}
			
			Collections.sort(ageList);
			Iterator<Integer> itr = ageList.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			TreeSet<Patient> set = new TreeSet<Patient>();
			set.addAll(list);
			Iterator<Patient> itra = set.iterator();
			while(itra.hasNext()) {
			System.out.println(itra.next().getPatientId() + " " + itra.next().getName() + " " + itra.next().age);
			itra.next();
			}
						
			System.out.println(getPatientAge("Naveen", set));
			
			System.out.println(getPatientAge("Satyam", set));
		}

		private static int getPatientAge(String name, TreeSet<Patient> set) {
			Iterator<Patient> itra = set.iterator();
			while(itra.hasNext()) {
				if(name.equalsIgnoreCase(itra.next().getName())) {
					return itra.next().age;
				}
			}
			return 0;
		}

	}


