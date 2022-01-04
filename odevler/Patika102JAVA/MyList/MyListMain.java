
public class MyListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList<Integer> list = new MyList<>();
		/* System.out.println("Number of Elements: " + list.getSize());
		System.out.println("Capacity: " + list.getCapacity());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Number of Elements: " + list.getSize());
		System.out.println("Capacity: " + list.getCapacity());
		list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of Elements: " + list.getSize());
		System.out.println("Capacity: " + list.getCapacity());
		System.out.println("Value at index 2 : " + list.get(2));
		list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("Value at index 2 : " + list.get(2));
        System.out.println(list.toString());
        */
		
		System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Index : " + list.indexOf(20));
        System.out.println("Index :" + list.indexOf(100));
        System.out.println("Index : " + list.lastIndexOf(20));
        Object[] newList = list.toArray();
        System.out.println("The First element of the array Object : " + newList[0]);
        MyList<Integer> altListem = list.subList(0, 3);
        System.out.println(altListem.toString());
        System.out.println("Value 20 in the list : " + list.contains(20));
        System.out.println("Value 120 in the list : " + list.contains(120));
        list.clear();
        System.out.println(list.toString());
	}

}
