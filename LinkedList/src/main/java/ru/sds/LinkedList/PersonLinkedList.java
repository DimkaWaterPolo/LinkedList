package ru.sds.LinkedList;



public class PersonLinkedList {
	
	PersonLinkedList next;
	Person person;
	PersonLinkedList first;
	
	
	
	public PersonLinkedList() {
	}
	
	public PersonLinkedList(Person person) {
		super();
		this.person = person;
	}

	public void add(Person person) {
		
		PersonLinkedList temp = first;
		
		if (temp != null)
		   while (temp.next != null) {
			   temp = temp.next;
		   } else temp = this;
		
		
		PersonLinkedList personLinkedList = new PersonLinkedList(person);
		temp.next=personLinkedList;
		
		if(first==null) {
			first = this;
		}
		personLinkedList.first = first;

		
	}
	
	public PersonLinkedList getIndexPersonList(int index) {
		PersonLinkedList personL = null;
		
		
		int k=0;
		PersonLinkedList temp = first;
		
		if (temp != null)
		   while (temp.next != null) {
			   if(k==index) {
				   personL=temp;
				   //System.out.println("Элемент под номером" + ":"+index+" - "+temp.toString());
			   }
			   temp = temp.next;
			   k++;
		   }
		if( index == getSize()-1) { 
			personL=temp;
			
			}
		
		return personL;
	}
	
	public Person getIndexPerson(int index) {
		Person person = null;
		
		
		int k=0;
		PersonLinkedList temp = first;
		
		if (temp != null)
		   while (temp.next != null) {
			   if(k==index) {
				   person=temp.person;
				   //System.out.println("Элемент под номером" + ":"+index+" - "+temp.toString());
			   }
			   temp = temp.next;
			   k++;
		   }
		//if(temp.next==null || k==index) {k++; System.out.println("Элемент под номером" + ":"+index+" - "+temp.toString());}
		
		return person;
	}
	
	public void remove(int index) {
		PersonLinkedList last;
		PersonLinkedList prev;
		
		if(index==0) {
			first = getIndexPersonList(1);
			PersonLinkedList temp = first;
			while (temp.next != null) {
				temp.first = first;
				temp = temp.next;
			}
			temp.first = first;
			
		}else {
			prev = getIndexPersonList(index-1);
			last = getIndexPersonList(index+1);
			prev.next = last;
		}
		
	}
	
	public void addPerson(Person person, int index) {
		PersonLinkedList is;
		PersonLinkedList prev;
		PersonLinkedList personLinkedList = new PersonLinkedList(person);
	
	
	
	if(index==0) {
		personLinkedList.next = getIndexPersonList(index);
		first = personLinkedList;
		personLinkedList.first=first;
		PersonLinkedList temp = first;
		while (temp.next != null) {
			temp.first = first;
			temp = temp.next;
		}
		temp.first = first;
		
		
		}else {
			prev = getIndexPersonList(index-1);
			is = getIndexPersonList(index);
			
			prev.next = personLinkedList;
			personLinkedList.next = is;
			personLinkedList.first = first;
		}
	}
	
	
	
/*	public void remove(int index) {
		PersonLinkedList list = new PersonLinkedList();
		PersonLinkedList temp = first;
		int k=0;
		if (temp != null)
			   while (temp.next != null) {
				   if(k!=index)
		list.add(list.getIndexPerson(k));
			   }
		
	}*/
	
	public int getSize() {
		int k=0;
		
		PersonLinkedList temp = first;
		
		if (temp != null)
		   while (temp.next != null) {
			   temp = temp.next;
			   k++;
		   }
		k++;
		return k;
	}
	
	public void print() {
		
		PersonLinkedList temp = first;
		
		if (temp != null) {
		   while (temp.next != null) {
			   System.out.println(temp.toString());
			   temp = temp.next;
		   }
		   System.out.println(temp.toString());
		}
		
	}
	
	@Override
	public String toString() {
		return ("Person - " + person +  "Size"+ getSize());
		} 
	
	
	
	
	public static void main(String[] args) {
		
		
		Person person1 = new Person("IVAN1", 11, "5a");
		Person person2 = new Person("IVAN2", 12, "5a");
		Person person3 = new Person("IVAN3", 13, "5a");
		Person person4 = new Person("IVAN4", 14, "5a");
		
		PersonLinkedList personLinkedList = new PersonLinkedList(person1);
		
		//personLinkedList.add(person1);
		personLinkedList.add(person2);
		personLinkedList.add(person3);
		personLinkedList.add(person4);
		
		
		
		/*for(int i=0; i<10; i++) {
			Person person = new Person("IVAN" + i, 1+i, "5a");
			personLinkedList.add(person);
		}
		*/
		
		personLinkedList.print();
		
		//System.out.println(personLinkedList.getIndexPersonList(0));
		//System.out.println(personLinkedList.getIndexPerson(2).toString());
		//personLinkedList.getIndexPersonList(4);
		
		System.out.println("-------------------------------------------------");
		personLinkedList.addPerson(person4, 0);
		// personLinkedList.remove(3);
		 personLinkedList.print();
		
	
	}

}
