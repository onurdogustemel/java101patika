import java.util.Arrays;

public class MyList<T> {
	
	private T[] myArr; // the array which contains elements
	
	private int size = 0; // the value of the number of elements
	
	public static final int DEFAULT_LENGTH = 10;
	
	public MyList() {
		this.myArr = (T[])new Object[DEFAULT_LENGTH];
	}
	public MyList(int capacity) {
		this.myArr = (T[])new Object[capacity];
	}
	
	public int size() {
		return this.getSize();
	}
	
	public int getCapacity() {
		return this.getMyArr().length;
	}
	
	public void add(T data) {
		if(size<this.getMyArr().length) {
			for(int i = 0; i < this.getMyArr().length;i++) {
				if(this.getMyArr()[i] == null) {
					this.getMyArr()[i] = data;
					this.setSize(this.getSize() + 1);
					break;
				}
			}
		}else {
			T[] newArr = this.getMyArr();
			this.myArr =(T[]) new Object[this.getCapacity()*2];
			for(int i = 0; i < newArr.length;i++) {
				this.myArr[i] = newArr[i];	
			}
			this.myArr[size] = data;
			size++;
		}
	}
	
	public T get(int index) {
		T number = (T)(this.getMyArr()[index]);
		return number != null ? number : null;
	}
	
	public void remove(int index) {
		if(index >= 0 && index < this.getMyArr().length &&this.getMyArr()[index] != null) {
			for(int i = index; i < this.getMyArr().length; i++) {
				this.getMyArr()[i] = this.getMyArr()[i+1];
				if(this.getMyArr()[i] == null) {
					break;
				}else {
					this.getMyArr()[i] = null;
				}
			}
		}
	}
	
	public T set(int index,T data) {
		if(this.getMyArr().length-1 < index) {
			return null;
		}
		return this.getMyArr()[index] = data;
	}

	@Override
	public String toString() {
		int count = 0;
		int newCount = 0;
		for(T i : this.getMyArr()) {
			if(i != null) {
				count++;
			}
		}
		
		T[] emptyArray = (T[]) new Object[count];
		for(int i = 0; i < this.getMyArr().length; i++) {
			if(this.getMyArr()[i] != null) {
				emptyArray[newCount] = this.getMyArr()[i];
				newCount++;
			}
		}
		return Arrays.toString(emptyArray);
	}
	
	public int indexOf(T data) {
		int indexValue = -1;
		for(int i = 0; i<this.getMyArr().length;i++) {
			if(data == this.getMyArr()[i]) {
				indexValue = i;
				break;
			}
		}
		return indexValue;
	}
	
	public int lastIndexOf(T data) {
		int lastIndexValue = -1;
		for(int i = this.getMyArr().length - 1 ; i>=0 ;i--) {
			if(data == this.getMyArr()[i]) {
				lastIndexValue = i;
				break;
			}
		}
		return lastIndexValue;
	}
	public boolean isEmpty() {
		
		int count = 0;
        for(T i : this.getMyArr()){
            if(i!=null)
                count+=1;
        }
        if(count==0){
            return true;
        }
        return false;
	}
	
	public T[] toArray() {
		
		T[] emptyArray = (T[]) new Object[this.getMyArr().length];
		
		for(int i = 0; i < this.getMyArr().length; i++) {
				emptyArray[i] = this.getMyArr()[i];
		}
		return emptyArray;
		
	}
	
	public MyList<T> subList(int start,int finish){
		MyList<T> newList = new MyList<>();
        int count = start;
        
        if(start == 0){
            for(int i = 0; i <= finish ;i++){
                newList.add(this.getMyArr()[count]);
                count++;
            }
        }else{
            for(int i = 0; i < finish; i++){
                newList.add(this.getMyArr()[count]);
                count++;
            }
        }
        return newList;
	}
	
	public boolean contains(T data) {
		for(T i : this.getMyArr()) {
			if(i == data) {
				return true;
			}
		}
		return false;
	}
	
	public void clear() {
		
		for(int i = 0; i<this.getMyArr().length; i++) {
			this.getMyArr()[i] = null;
		}
	}

	public T[] getMyArr() {
		return myArr;
	}
	public void setMyArr(T[] myArr) {
		this.myArr = myArr;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}
